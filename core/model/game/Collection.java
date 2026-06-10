package core.model.game;

import core.model.game.entity.unit.plant.Plant;
import core.model.game.player.Player;

import java.util.ArrayList;

public class Collection
{
    ArrayList<Plant> unlockedPlants;
    ArrayList<Plant> lockedPlants;

    public boolean unlockPlant(Plant plant)
    {

    }

    public ArrayList<Plant> getLockedPlants()
    {
        return lockedPlants;
    }

    public ArrayList<Plant> getUnlockedPlants()
    {
        return unlockedPlants;
    }
}
