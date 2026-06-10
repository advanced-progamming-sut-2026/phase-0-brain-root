package core.model.game.gameplay.levelConfig.special;

import core.model.game.gameplay.levelConfig.RegularLevelConfig;

public class TimedWarLevelConfig  extends RegularLevelConfig
{
    int zombieKillsGoal;
    int timeGoal;

    protected TimedWarLevelConfig()
    {
        super(true);
    }
}
