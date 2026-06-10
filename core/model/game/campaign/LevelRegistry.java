package core.model.game.campaign;

import core.model.game.gameplay.levelConfig.NormalGameLevelConfig;
import core.model.game.gameplay.levelConfig.special.*;

public class LevelRegistry
{

    private final Class<?>[] specialLevelsSequence = {ConveyorBeltLevelConfig.class, LockedPlants1LevelConfig.class, //چطوری این اسپشیال لول خودش 2 تا مرحله س اخه
            SaveOurSeedsLevelConfig.class, TimedWarLevelConfig.class, NightOpsLevelConfig.class,
            DeadLineLevelConfig.class, LoveYourPlantsLevelConfig.class, PlantWhatYouGetLevelConfig.class};

    public Class<?> getLevelConfig(int chapter, int level)
    {
        if (level == 1)
        {
            return NormalGameLevelConfig.class;
        }
        else if (level == 4)
        {
            return null;
        }
        else if(level == 2 || level == 3)
        {
            int specialIndex = ((chapter - 1) * 2) + (level - 2);
            return specialLevelsSequence[specialIndex];
        }
        else
            throw new IllegalArgumentException();
    }
}
