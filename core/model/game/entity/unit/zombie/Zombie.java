package core.model.game.entity.unit.zombie;

import core.engine.Tickable;
import core.model.game.entity.trait.Moveable;
import core.model.game.entity.trait.CanDamage;
import core.model.game.entity.unit.Unit;
import core.model.game.entity.unit.plant.Plant;
import core.model.game.gameplay.match.Match;

import java.util.List;

public class Zombie extends Unit implements Tickable, Moveable, CanDamage
{
    ZombieBehavior[] behaviors;
    public Zombie(ZombieStats stats, List<ZombieBehavior> behaviors)
    {
        //set fields
    }

    @Override
    public void advanceTick(Match match)
    {
        //something like this
        for (ZombieBehavior behavior : behaviors)
        {
            behavior.execute(this, match);
        }
    }

    @Override
    public float getSpeed()
    {

    }

    private void attackPlant(Plant plant)
    {

    }

    @Override
    public int getdamage()
    {

    }
}
