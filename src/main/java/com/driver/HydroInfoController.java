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
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    storeWaterLevel(scanner);
                    break;
                case 2:
                    displayAllWaterLevels();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private void printMenu() {
    	//your code goes here
        System.out.println("HydroInfo Menu:");
        System.out.println("1. Store Water Level Data");
        System.out.println("2. Display All Water Levels");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private void storeWaterLevel(Scanner scanner) {
    	//your code goes here
        System.out.print("Enter site name: ");
        String siteName = scanner.nextLine();
        System.out.print("Enter current water level: ");
        double waterLevel = scanner.nextDouble();
        System.out.print("Enter threshold level: ");
        double thresholdLevel = scanner.nextDouble();

        WaterLevelDTO waterLevelDTO = new WaterLevelDTO(siteName, waterLevel);
        WaterLevel waterLevelData = new WaterLevel(siteName, waterLevel);
        waterLevelData.setThresholdLevel(thresholdLevel); // Set threshold level

        hydroInfoService.storeWaterLevelData(waterLevelDTO);
    }

    private void displayAllWaterLevels() {
    	//your code goes here
        List<WaterLevel> waterLevels = hydroInfoService.getAllWaterLevels();
        for (WaterLevel waterLevel : waterLevels) {
            System.out.println("Site: " + waterLevel.getSiteName() + ", Water Level: " + waterLevel.getWaterLevel());
        }
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
