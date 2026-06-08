package core.model.game.entity.tile;

public class BigWaveBeachTile extends Tile
{
    private boolean isSubmerged;
    private boolean hasLilyPad;

    public boolean isSubmerged()
    {
        return isSubmerged;
    }

    public void setSubmerged(boolean submerged)
    {
        this.isSubmerged = submerged;
    }

    @Override
    public boolean isPlantable()
    {
        return false;
    }
}
