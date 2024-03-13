package com.driver;

public class WaterLevel {
    private String siteName;
    private double waterLevel;
    private double thresholdLevel;

    public WaterLevel(String siteName, double waterLevel) {
        this.siteName = siteName;
        this.waterLevel = waterLevel;
    }

    public String getSiteName() {
    	//your code goes here
        return siteName;
    }

    public double getWaterLevel() {
    	//your code goes here
        return waterLevel;
    }

    public double getThresholdLevel() {
        return thresholdLevel;
    }

    public void setThresholdLevel(double thresholdLevel) {
        this.thresholdLevel = thresholdLevel;
    }
}

