package core.model.game.entity.unit.plant;

import core.engine.Tickable;
import core.model.game.entity.Buyable;
import core.model.game.entity.unit.Unit;
import core.model.game.gameplay.match.Match;
import core.util.Coordinate;

public abstract class Plant extends Unit implements Tickable, Buyable
{
    private String type;
    protected Plant(Coordinate<? extends Number> coordinate, int hp, int sunCost, int attackPower, String type)
    {
        super(coordinate, hp, sunCost, attackPower);
        this.type = type;
    }

    public void advanceTick(Match match)
    {

    }

    public String getType()
    {
        return type;
    }
    public abstract int getCost();
}
