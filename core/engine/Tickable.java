package core.engine;

import core.model.game.gameplay.match.Match;

public interface Tickable
{
    void advanceTick(Match match);
}
