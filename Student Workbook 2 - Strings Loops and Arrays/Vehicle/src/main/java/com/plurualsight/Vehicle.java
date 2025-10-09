package com.plurualsight;

import java.util.Scanner;

public class Vehicle {
    public Vehicle(int i, String lambo) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[20];
        int count = 10;

        vehicles[0] = new Vehicle(1, "Lambo");
        vehicles[1] = new Vehicle(2, "Mustang");
        vehicles[2] = new Vehicle(3, "Camaro");
        vehicles[3] = new Vehicle(4, "Dodge");
        vehicles[4] = new Vehicle(5, "Jeep");
        vehicles[5] = new Vehicle(6, "Silverado");
        vehicles[6] = new Vehicle(7, "Prius");
        vehicles[7] = new Vehicle(8, "Bugatti");
        vehicles[8] = new Vehicle(9, "Tacoma");
        vehicles[9] = new Vehicle(10, "BMW AMG");

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Add a vehicle");
            System.out.println("4 - Quit");
            System.out.print("Enter your command: ");
            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    for (int i = 0; i < count; i++)
                        System.out.println(vehicles[i]);
                    break;

                case 2:
                    System.out.print("Enter make/model: ");
                    String model = scanner.nextLine();
                    for (int i = 0; i < count; i++)
                        if (vehicles[i].getMakeModel().equalsIgnoreCase(model))
                            System.out.println(vehicles[i]);
                    break;

                case 3:
                    if (count < vehicles.length) {
                        System.out.print("Vehicle ID: ");
                        long id = scanner.nextLong();
                        scanner.nextLine();
                        System.out.print("Make/Model: ");
                        String makeModel = scanner.nextLine();
                        vehicles[count++] = new Vehicle((int) id, makeModel);
                    } else System.out.println("Inventory full!");
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;
            }
        }

    }

    private String getMakeModel() {
        return null;
    }
}




