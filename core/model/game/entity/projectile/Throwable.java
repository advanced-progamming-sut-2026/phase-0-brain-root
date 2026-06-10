package core.model.game.entity.projectile;

import core.util.Coordinate;

public abstract class Throwable extends Projectile
{
    private float height;
    private float zVelocity;

    protected Throwable(Coordinate<? extends Number> coordinate)
    {
        super(coordinate);
    }
}
