package core.model.game.entity.projectile;

import core.engine.Tickable;
import core.model.game.entity.trait.CanDamage;
import core.model.game.entity.Entity;
import core.model.game.entity.trait.Moveable;
import core.util.Coordinate;

public abstract class Projectile extends Entity implements Tickable, CanDamage, Moveable
{
    protected Projectile(Coordinate<? extends Number> coordinate)
    {
        super(coordinate);
    }
}
