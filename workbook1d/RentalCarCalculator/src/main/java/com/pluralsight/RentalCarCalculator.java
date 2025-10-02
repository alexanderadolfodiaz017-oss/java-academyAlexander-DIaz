package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pickup date: ");
        scanner.nextLine();
        System.out.print("Rental days: ");
        int days = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Toll tag (yes/no)? ");
        String toll = scanner.nextLine();
        System.out.print("GPS (yes/no)? ");
        String gps = scanner.nextLine();
        System.out.print("Roadside assistance (yes/no)? ");
        String road = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        double base = 29.99 * days;
        double options = 0;
        if (toll.equalsIgnoreCase("yes")) options += 3.95 * days;
        if (gps.equalsIgnoreCase("yes")) options += 2.95 * days;
        if (road.equalsIgnoreCase("yes")) options += 3.95 * days;
        double surcharge = (age < 25) ? base * 0.3 : 0;
        double total = base + options + surcharge;

        System.out.println("Basic rental: $" + base);
        System.out.println("Options: $" + options);
        System.out.println("Surcharge: $" + surcharge);
        System.out.println("Total: $" + total);
    }
}
