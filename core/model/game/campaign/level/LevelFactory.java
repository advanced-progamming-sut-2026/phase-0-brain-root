package core.model.game.campaign.level;

import core.model.game.campaign.chapter.Chapter;
import core.model.game.campaign.level.minigame.WallnutBowlingLevel;
import core.model.game.gameplay.levelConfig.LevelConfig;
import core.model.game.gameplay.levelConfig.minigame.WallnutBowlingLevelConfig;

public class LevelFactory
{
    public CampaignLevel createCampaignLevel(LevelConfig config, Chapter chapter)
    {
        return new CampaignLevel(config, chapter);
    }

    public Level createMinigameLevel(LevelConfig config)
    {
        if (config instanceof WallnutBowlingLevelConfig)
        {
            return new WallnutBowlingLevel((WallnutBowlingLevelConfig) config);
        }
        //complete here
        throw new IllegalArgumentException("Unknown minigame config");
    }

    private void validateCampaignConsistency(LevelConfig config, Chapter chapter)
    {

    }
}