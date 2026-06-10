package core.model.game.entity.unit.zombie;

import java.util.ArrayList;
import java.util.List;

public class ZombieWave
{
    private final int waveNumber;
    private final int delay;
    private final List<String> zombies;

    public ZombieWave(int waveNumber, int delay, List<String> zombies)
    {
        this.waveNumber = waveNumber;
        this.delay = delay;
        this.zombies = new ArrayList<>(zombies);
    }

    public int getWaveNumber()
    {
        return waveNumber;
    }

    public int getDelay()
    {
        return delay;
    }

    public List<String> getZombies()
    {
        return new ArrayList<>(zombies);
    }
}

