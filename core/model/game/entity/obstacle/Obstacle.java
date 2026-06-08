package core.model.game.entity.obstacle;

import core.engine.Tickable;
import core.model.game.entity.Entity;
import core.util.Coordinate;

public abstract class Obstacle extends Entity implements Tickable
{
    private int health;
    private Coordinate<Integer> coordinate;

    protected Obstacle(Coordinate<Integer> coordinate)
    {
        super(coordinate);
    }

    public void decreaseHp(int amount)
    {
        health -= amount;
    }
}
