package core.model.game.entity.zombie;

public class ZombieFactory
{
    private final ZombieDatabase database;
    public ZombieFactory(ZombieDatabase database)
    {
        this.database = database;
    }

    public Zombie createZombie(ZombieType type)
    {
        ZombieStats stats = database.getStats(type.getAlias());

        switch (type)
        {


            default:
                throw new IllegalArgumentException();
        }

        return new Zombie(stats, behaviors);
    }
}
