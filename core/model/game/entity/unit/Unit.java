package core.model.game.entity.unit;

import core.model.game.entity.Entity;
import core.util.Coordinate;

public abstract class Unit extends Entity
{
    private int hp;
    private int attackPower;
    protected Unit(Coordinate<? extends Number> coordinate, int hp, int sunCost, int attackPower)
    {
        super(coordinate);
        this.hp = hp;
        this.attackPower = attackPower;
    }
}
