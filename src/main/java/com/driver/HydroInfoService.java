package com.driver;

import java.util.List;

public class HydroInfoService {
    private WaterLevelDataRepository waterLevelDataRepository;

    public HydroInfoService(WaterLevelDataRepository waterLevelDataRepository) {
        this.waterLevelDataRepository = waterLevelDataRepository;
    }

    public void storeWaterLevelData(WaterLevelDTO waterLevelDTO) {
    	//your code goes here
    }

    public List<WaterLevel> getAllWaterLevels() {
    	//your code goes here
        return waterLevelDataRepository.getAllWaterLevels();
    }
}

