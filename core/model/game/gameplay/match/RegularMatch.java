package core.model.game.gameplay.match;

import core.engine.CooldownManager;
import core.model.game.entity.projectile.Projectile;
import core.model.game.entity.tile.Tile;
import core.model.game.entity.unit.plant.Plant;
import core.model.game.entity.unit.zombie.Zombie;

import java.util.List;

public class RegularMatch extends Match
{
    public RegularMatch(Tile[][] grid, List<Plant> plants, List<Zombie> zombies, List<Projectile> projectiles, CooldownManager cooldownManager)
    {
        super(grid, plants, zombies, projectiles, cooldownManager);
    }
}
