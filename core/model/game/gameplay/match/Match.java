package core.model.game.gameplay.match;


import core.engine.CooldownManager;
import core.model.game.entity.projectile.Projectile;
import core.model.game.entity.unit.plant.Plant;
import core.model.game.entity.unit.zombie.Zombie;
import core.model.game.entity.tile.Tile;
import core.model.game.gameplay.levelConfig.LevelConfig;

import java.util.List;

public abstract class Match
{
    private final LevelConfig levelConfig;
    private final Tile[][] grid;
    private final List<Plant> plants;
    private final List<Zombie> zombies;
    private final List<Projectile> projectiles;
    private final CooldownManager cooldownManager;
    private int sunAmount = 0;

    public Match(LevelConfig levelConfig)
    {
        //set fields
    }

    public void advanceTick()
    {
        cooldownManager.advanceTick(this);

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
            zombie.advanceTick(this);
        }

        for (Projectile projectile : projectiles)
        {
            projectile.advanceTick(this);
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

    public List<Projectile> getProjectiles()
    {
        return projectiles;
    }
}