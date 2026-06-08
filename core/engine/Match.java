package core.engine;


import core.model.game.entity.unit.plant.Plant;
import core.model.game.entity.unit.zombie.Zombie;
import core.model.game.gameplay.LevelConfig;
import core.model.game.entity.tile.Tile;

import java.util.List;

public class Match
{
    private final LevelConfig levelConfig = new LevelConfig();
    private final Tile[][] grid;
    private final List<Plant> plants;
    private final List<Zombie> zombies;
    private final List<Projectile> projectiles;
    private final CooldownManager cooldownManager;

    public Match(Tile[][] grid, List<Plant> plants, List<Zombie> zombies, List<Projectile> projectiles,
                 CooldownManager cooldownManager) //projectile is an example
    {
        this.grid = grid;
        this.plants = plants;
        this.zombies = zombies;
        this.projectiles = projectiles;
        this.cooldownManager = cooldownManager;
    }

    public void advanceTick()
    {
        cooldownManager.tick(this);

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                grid[i][j].advanceTick(this);
            }
        }

        for (Plant plant : plants)
        {
            plant.advanceTick(this);
        }

        for (Zombie zombie : zombies)
        {
            zombie.tick(this);
        }

        for (Projectile projectile : projectiles)
        {
            projectile.tick(this);
        }
    }

    public List<Zombie> getZombies()
    {
        return zombies;
    }

    public List<Plant> getPlants()
    {
        return plants;
    }

    public void addProjectile(Projectile projectile)
    {
        projectiles.add(projectile);
    }
}