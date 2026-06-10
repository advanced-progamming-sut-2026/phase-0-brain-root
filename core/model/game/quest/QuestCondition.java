package core.model.game.quest;

import core.model.game.gameplay.match.Match;

public interface QuestCondition
{
    boolean isMet(Match match);

    int calculateProgress(Match match);

    int getTargetAmount();

    default int getProgressPercentage(Match match)
    {
        return 100 * calculateProgress(match) / getTargetAmount();
    }
}