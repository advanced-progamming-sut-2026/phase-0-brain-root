package core.model.game.gameplay.levelConfig;

import core.model.game.entity.unit.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public abstract class LevelConfig
{
    Plant[] unlockedPlants;

    boolean sunDroping;
    boolean playerChoosePlants;
    Plant[] unavaiablePlants;
    Plant[] requiredPlants;

    protected LevelConfig()
   {

   }
}
