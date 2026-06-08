package core.model.game.entity;

import core.util.Coordinate;

public abstract class Entity
{
    private Coordinate<? extends Number> coordinate;

    protected Entity(Coordinate<? extends Number> coordinate)
    {
        this.coordinate = coordinate;
    }

    public Coordinate<? extends Number> getCoordinate()
    {
        return coordinate;
    }
}
