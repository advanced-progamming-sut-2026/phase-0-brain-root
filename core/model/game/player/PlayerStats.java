package core.model.game.player;

import core.model.game.campaign.chapter.Chapter;
import core.model.game.campaign.level.Level;
import core.model.game.quest.Quest;

import java.util.HashSet;

public class PlayerStats
{
    private HashSet<Quest> CompletedQuests = new HashSet<>();
    private Chapter lastChapter;
    private Level lastLevel;

    public void CompleteQuest(Quest quest)
    {
        CompletedQuests.add(quest);
    }

    public void achiveNextLevel()
    {

    }
    public void achiveNextChapter()
    {

    }

    public Chapter getLastChapter()
    {
        return lastChapter;
    }
    public Level getLastLevel()
    {
        return lastLevel;
    }
}
