package com.plurualsight;

public class Main {
    public static void main(String[] args) {
        Vehicle[] cars = {
                new Vehicle(1, "Lambo"),
                new Vehicle(2, "Mustang"),
                new Vehicle(3, "Camaro"),
                new Vehicle(4, "Dodge"),
                new Vehicle(5, "Jeep"),
                new Vehicle(6, "Silverado"),
                new Vehicle(7, "Prius"),
                new Vehicle(8, "Bugatti"),
                new Vehicle(9, "Tacoma"),
                new Vehicle(10, "BMW AMG")
        };

        for (Vehicle car : cars) {
            System.out.println(car);
        }
    }
}
