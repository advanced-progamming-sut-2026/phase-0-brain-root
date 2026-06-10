package core.model.game.campaign.level;

import core.model.game.gameplay.levelConfig.LevelConfig;
import core.model.game.campaign.chapter.Chapter;

public abstract class Level
{
    private LevelConfig config;

    public Level(LevelConfig config)
    {
        this.config = config;
    }

    public LevelConfig getConfig()
    {
        return config;
    }
}

