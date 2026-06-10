package core.model.game.gameplay.levelConfig.special;

import core.model.game.entity.unit.plant.Plant;
import core.model.game.gameplay.levelConfig.RegularLevelConfig;

public class LockedPlants2LevelConfig  extends RegularLevelConfig
{
    Plant[] requiredPlants;

    protected LockedPlants2LevelConfig()
    {
        super(true);
    }
}
