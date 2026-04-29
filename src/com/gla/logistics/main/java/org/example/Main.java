package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RouteLinkedList<Checkpoint> route = new RouteLinkedList<>();

        System.out.println("=== Logistics Management System ===");
        System.out.print("Enter Driver Name: ");
        String driverName = scanner.nextLine();
        System.out.print("Enter Driver ID: ");
        String driverId = scanner.nextLine();

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Delivery Checkpoint");
            System.out.println("2. Add Fuel Checkpoint");
            System.out.println("3. View Route & Score");
            System.out.println("4. Save to MySQL Workbench");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Location Name: ");
                    String loc = scanner.nextLine();
                    System.out.print("Distance from last: ");
                    double dist = scanner.nextDouble();
                    route.addCheckpoint(new DeliveryCheckpoint("DC", loc, dist, 30, 40));
                    System.out.println("Delivery Checkpoint added!");
                    break;

                case 2:
                    System.out.print("Fuel Station Name: ");
                    String fuelLoc = scanner.nextLine();
                    System.out.print("Distance: ");
                    double fDist = scanner.nextDouble();
                    route.addCheckpoint(new FuelCheckpoint("FC", fuelLoc, fDist, 15, 15));
                    System.out.println("Fuel Checkpoint added!");
                    break;

                case 3:
                    route.printRoute();
                    double totalDist = route.computeTotalDistance();
                    double totalPenalty = route.computeTotalPenalty();
                    System.out.printf("Total Distance: %.2f | Route Score: %.2f%n", totalDist, (totalDist - totalPenalty));
                    break;

                case 4:
                    double d = route.computeTotalDistance();
                    double s = d - route.computeTotalPenalty();
                    // Calling the method we discussed earlier
                    route.saveToDatabase(driverName, driverId, d, s);
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}