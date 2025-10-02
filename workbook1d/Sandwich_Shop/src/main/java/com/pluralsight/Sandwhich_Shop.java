package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sandwich size:");
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");
        int size = scanner.nextInt();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        double price = 0.0;
        if (size == 1) {
            price = 5.45;
        } else if (size == 2) {
            price = 8.95;
        }

        if (age <= 17) {
            price = price * 0.90;
        } else if (age >= 65) {
            price = price * 0.80;
        }

        System.out.println("Your sandwich price is: $" + price);
    }
}

