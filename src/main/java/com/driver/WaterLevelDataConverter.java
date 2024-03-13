package com.driver;

public class WaterLevelDataConverter {
    public WaterLevel convertToEntity(WaterLevelDTO waterLevelDTO) {
    	//your code goes here
        return new WaterLevel(waterLevelDTO.getSiteName(), waterLevelDTO.getWaterLevel());
    }

    public WaterLevelDTO convertToDTO(WaterLevel waterLevel) {
    	//your code goes here
        return new WaterLevelDTO(waterLevel.getSiteName(), waterLevel.getWaterLevel());
    }
}

