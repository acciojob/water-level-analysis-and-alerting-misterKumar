package com.driver;

import java.util.List;

public class HydroInfoService {
    private WaterLevelDataRepository waterLevelDataRepository;

    public HydroInfoService(WaterLevelDataRepository waterLevelDataRepository) {
        this.waterLevelDataRepository = waterLevelDataRepository;
    }

    public void storeWaterLevelData(WaterLevelDTO waterLevelDTO) {
    	//your code goes here
        WaterLevel waterLevel = new WaterLevel(waterLevelDTO.getSiteName(), waterLevelDTO.getWaterLevel());
        waterLevelDataRepository.storeWaterLevel(waterLevel);
        System.out.println("Stored Data for " + waterLevelDTO.getSiteName() + ".");
        checkThreshold(waterLevel);
    }

    public List<WaterLevel> getAllWaterLevels() {
    	//your code goes here
        return waterLevelDataRepository.getAllWaterLevels();
    }
    private void checkThreshold(WaterLevel waterLevel) {
        if (waterLevel.getWaterLevel() > waterLevel.getThresholdLevel()) {
            System.out.println("ALERT! Water level in " + waterLevel.getSiteName() + " exceeds the threshold.");
        }
    }
}

