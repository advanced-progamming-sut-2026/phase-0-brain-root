package core.model.game.gameplay.levelConfig.minigame;

import core.model.game.entity.unit.plant.Plant;
import core.model.game.entity.unit.zombie.Zombie;

public class IZombieLevelConfig
{
    final int deadLine; //1 means plants are at max on row number 1
    final Plant[][] startingPlants;
    final int startingSun = 150;
    final int minimumZombieCost; //to decide is game finished or not
    final Zombie[] selectedZombies = new Zombie[5];
}
