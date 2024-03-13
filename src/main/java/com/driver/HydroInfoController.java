package com.driver;

import java.util.List;
import java.util.Scanner;


public class HydroInfoController {
    private HydroInfoService hydroInfoService;

    public HydroInfoController(HydroInfoService hydroInfoService) {
        this.hydroInfoService = hydroInfoService;
    }

    public void processUserInput() {
    	//your code goes here
    }

    private void printMenu() {
    	//your code goes here
    }

    private void storeWaterLevel(Scanner scanner) {
    	//your code goes here
    }

    private void displayAllWaterLevels() {
    	//your code goes here
    }

    public static void main(String[] args) {
        // Create necessary objects and start the application
        WaterLevelDataRepository repository = new WaterLevelDataRepository();
        HydroInfoService hydroInfoService = new HydroInfoService(repository);
        HydroInfoController hydroInfoController = new HydroInfoController(hydroInfoService);

        // Start processing user input
        hydroInfoController.processUserInput();
    }
}
