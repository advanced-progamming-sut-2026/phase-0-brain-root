package core.model.game.gameplay.levelConfig.special;

import core.model.game.gameplay.levelConfig.RegularLevelConfig;

public class DeadLineLevelConfig  extends RegularLevelConfig
{
    int deadline; //1 means the deadline is at the end of col 1

    protected DeadLineLevelConfig()
    {
        super(true);
    }
}
