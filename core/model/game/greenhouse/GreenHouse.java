package core.model.game.greenhouse;

import core.model.game.entity.unit.plant.Plant;
import core.util.Coordinate;

import java.util.ArrayList;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class GreenHouse
{
    private Instant lastHarvestTime;
    private Map<Coordinate<Integer>, Boolean> potsStatus;

    public GreenHouse()
    {
        this.potsStatus = new HashMap<>();
    }

    public void plantNewPlant(Coordinate<Integer> cordinate, Plant plant)
    {

    }

    public void harvestPlants()
    {
        //havest the plant please
        this.lastHarvestTime = Instant.now();
    }

    public Instant getLastHarvestTime()
    {
        return lastHarvestTime;
    }

    public Map<Coordinate<Integer>, Boolean> getPotsStatus()
    {
        return potsStatus;
    }
}

