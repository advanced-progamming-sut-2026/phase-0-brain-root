package core.model.game.entity.unit.zombie;

import java.util.List;

public interface AttackPattern
{
    List<Zombie> calculateNextSpawns(long currentPlayTime);

    boolean isWaveCompleted();
}