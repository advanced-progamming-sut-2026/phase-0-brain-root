package core.model.game.entity.tile;

import core.model.enums.Direction;

public class SliderTile extends Tile
{
    private Direction direction;

    public Direction getDirection()
    {
        return null;
    }

    @Override
    public boolean isPlantable()
    {
        return false;
    }
}
