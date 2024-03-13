package com.driver;

import java.util.ArrayList;
import java.util.List;

public class WaterLevelDataRepository {
    private List<WaterLevel> waterLevels;

    public WaterLevelDataRepository() {
        this.waterLevels = new ArrayList<>();
    }

    public void storeWaterLevel(WaterLevel waterLevel) {
    	//your code goes here
    }

    public List<WaterLevel> getAllWaterLevels() {
    	//your code goes here
        return new ArrayList<>(waterLevels);
    }
}
