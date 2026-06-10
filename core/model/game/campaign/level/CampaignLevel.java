package core.model.game.campaign.level;

import core.model.game.campaign.chapter.Chapter;
import core.model.game.gameplay.levelConfig.LevelConfig;

public class CampaignLevel extends Level
{
    private Chapter chapter;

    public CampaignLevel(LevelConfig config, Chapter chapter)
    {
        super(config);
        this.chapter = chapter;
    }

    public Chapter getChapter()
    {
        return chapter;
    }
}
