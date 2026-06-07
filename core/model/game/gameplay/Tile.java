package core.model.game.gameplay;

import core.engine.Match;
import core.engine.Tickable;
import core.model.game.entity.zombie.Zombie;

public abstract class Tile implements Tickable
{
    protected final int row;
    protected final int col;
    protected boolean plantable;

    public Tile(int row, int col, boolean plantable)
    {
        this.row = row;
        this.col = col;
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
}
