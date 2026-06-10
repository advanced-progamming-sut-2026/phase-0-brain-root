package core.model.game.gameplay.levelConfig.special;

import core.model.game.entity.unit.plant.Plant;
import core.model.game.gameplay.levelConfig.RegularLevelConfig;

public class LockedPlants1LevelConfig extends RegularLevelConfig
{
    Plant[] unavaiablePlants;

    protected LockedPlants1LevelConfig()
    {
        super(true);
    }
}
