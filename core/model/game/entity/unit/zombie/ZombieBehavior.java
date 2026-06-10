package core.model.game.entity.unit.zombie;

import core.model.game.gameplay.match.Match;

public abstract class ZombieBehavior
{
    abstract public void execute(Zombie zombie, Match match);
}
