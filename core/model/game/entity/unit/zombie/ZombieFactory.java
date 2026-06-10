package core.model.game.entity.unit.zombie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ZombieFactory
{
    private final ZombieDatabase database;
    private final Map<String, Supplier<List<ZombieBehavior>>> behaviorRegistry = new HashMap<>();

    public ZombieFactory(ZombieDatabase database)
    {
        this.database = database;

        registerZombieBehaviors();
    }

    public Zombie createZombie(String alias)
    {
        ZombieStats stats = database.getStats(alias);

        if (stats == null)
        {
            throw new IllegalArgumentException();
        }

        Supplier<List<ZombieBehavior>> behaviorSupplier = behaviorRegistry.get(alias);
        if (behaviorSupplier == null)
        {
            throw new IllegalArgumentException();
        }

        return new Zombie(stats, behaviorSupplier.get());
    }

    private void registerZombieBehaviors()
    {

    }
}
