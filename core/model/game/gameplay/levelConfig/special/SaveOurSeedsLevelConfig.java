package core.model.game.gameplay.levelConfig.special;

import core.model.game.entity.unit.plant.Plant;
import core.model.game.gameplay.levelConfig.RegularLevelConfig;

public class SaveOurSeedsLevelConfig  extends RegularLevelConfig
{
    Plant[] vitalPlants;

    protected SaveOurSeedsLevelConfig()
    {
        super(true);
    }
}
