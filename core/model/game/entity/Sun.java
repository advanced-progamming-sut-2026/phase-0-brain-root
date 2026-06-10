package core.model.game.entity;

import core.engine.Tickable;
import core.model.game.gameplay.match.Match;
import core.util.Coordinate;

public class Sun extends Entity implements Tickable
{
    private final int amount;
    private final int despawnTime;
    private float remaningTime;

    protected Sun(Coordinate<? extends Number> coordinate, int amount, int despawnTime, float remaningTime)
    {
        super(coordinate);
        this.amount = amount;
        this.despawnTime = despawnTime;
        this.remaningTime = remaningTime;
    }

    @Override
    public void advanceTick(Match match)
    {

    }

    public float getRemaningTime()
    {
        return remaningTime;
    }

    public int getAmount()
    {
        return amount;
    }
}
