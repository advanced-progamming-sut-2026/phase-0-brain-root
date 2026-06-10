package core.model.game.entity;

import core.util.Coordinate;

public class LawnMower extends Entity
{
    private final int row;
    private boolean isExcuted;

    protected LawnMower(Coordinate<Integer> coordinate)
    {
        super(coordinate);
        this.row = (int) getCoordinate().getX(); //TODO
    }
    public void excute()
    {
        throw new IllegalArgumentException();
    }
}
