package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Weapons";

        System.out.println("watch, " + name);
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First letter: " + name.charAt(0));
        System.out.println("Does it contain 'sey'? " + name.contains("sey"));

        // Scanner for user input
        Scanner read = new Scanner(System.in);

        // Example 1 – While loop for password
        System.out.println("Example 1 – While loop password check:");
        String password = "0708";
        String enterPassword = "";

        while (!enterPassword.equals(password)) {
            System.out.println("What is the password?");
            enterPassword = read.nextLine();

            if (!enterPassword.equals(password)) {
                System.out.println("Incorrect");
            }
        }

        // Example 2 – Do-while loop
        System.out.println("Example 2 – Do-while loop:");
        int x = 0;
        do {
            System.out.println("x is: " + x);
            x++;
        } while (x < 4);

        // Example 3 – For loop
        System.out.println("\nExample 3 – For loop:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Im the best!");
        }

        // Example 4 – While loop countdown
        System.out.println("\nExample 4 – While loop countdown:");
        int counter = 3;
        while (counter > 0) {
            System.out.println("Counter is: " + counter);
            counter--;
        }

        // Example 5 – Do-while loop again
        System.out.println("\nExample 5 – Another do-while loop:");
        int y = 0;
        do {
            System.out.println("y is: " + y);
            y++;
        } while (y < 3);

        read.close(); // Close Scanner
    }
}