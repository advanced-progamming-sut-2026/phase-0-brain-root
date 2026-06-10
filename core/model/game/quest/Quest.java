package core.model.game.quest;

import core.model.game.gameplay.match.Match;

public abstract class Quest
{
    private String name;
    private String description;
    private QuestCategory category;
    private QuestPriority priority;

    private RewardType rewardType;
    private int rewardAmount;

    private QuestCondition condition;

    private int currentProgress;
    private boolean isCompleted;

    public Quest(String name, String description, QuestCategory category, QuestPriority priority,
                 RewardType rewardType, int rewardAmount, QuestCondition condition)
    {
        this.name = name;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.rewardType = rewardType;
        this.rewardAmount = rewardAmount;
        this.condition = condition;
        this.currentProgress = 0;
        this.isCompleted = false;
    }

    public void updateProgress(Match match)
    {
        if (isCompleted)
            return;

        this.currentProgress = condition.calculateProgress(match);

        if (condition.isMet(match))
        {
            this.isCompleted = true;
            grantReward();
        }
    }

    private void grantReward()
    {

    }
}
