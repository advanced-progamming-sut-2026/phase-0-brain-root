package core.model.game.entity.tile;

import core.model.game.gameplay.match.Match;
import core.engine.Tickable;
import core.model.game.entity.Entity;
import core.model.game.entity.unit.zombie.Zombie;
import core.util.Coordinate;

public abstract class Tile extends Entity implements Tickable
{
    protected boolean plantable;

    public Tile(Coordinate<Integer> coordinate, boolean plantable)
    {
        super(coordinate);
        this.plantable = plantable;
    }

    public void advanceTick()
    {
    }

    public abstract void onZombieStep(Zombie zombie, Match match);

    public boolean isPlantable()
    {
        return plantable;
    }

    public int getRow()
    {
        return (int) getCoordinate().getX();
    }

    public int getColumn()
    {
        return (int) getCoordinate().getY();
    }
}


