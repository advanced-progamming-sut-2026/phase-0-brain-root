package core.model.game.campaign.chapter;

import core.model.game.campaign.level.CampaignLevel;

import java.util.List;

public abstract class Chapter
{
    private final List<CampaignLevel> levels;
    private int unlockedLevelIndex;

    public Chapter(List<CampaignLevel> levels)
    {
        this.levels = levels;
        this.unlockedLevelIndex = 0;
        registerLevels();
    }

    protected abstract void registerLevels();

    public CampaignLevel getLastUnlockedLevel()
    {

    }

    public void completeCurrentLevel()
    {
        unlockedLevelIndex++;
    }

    public boolean isChapterCompleted()
    {
        return unlockedLevelIndex >= levels.size();
    }
}

