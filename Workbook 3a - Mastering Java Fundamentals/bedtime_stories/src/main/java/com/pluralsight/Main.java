package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Choose a story to read:");
                System.out.println("1. goldilocks.txt");
                System.out.println("2. mary_had_a_little_lamb.txt");
                System.out.println("3. hansel_and_gretel.txt");
                System.out.print("Enter 1, 2, or 3: ");

                String choice = scanner.nextLine();
                String filename = "";

                switch (choice) {
                    case "1":
                        filename = "goldilocks.txt";
                        break;
                    case "2":
                        filename = "mary_had_a_little_lamb.txt";
                        break;
                    case "3":
                        filename = "hansel_and_gretel.txt";
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        scanner.close();
                        return;
                }

                System.out.println("Looking for file in: " + System.getProperty("user.dir"));

                try (BufferedReader bufReader = new BufferedReader(new FileReader(filename))) {
                    String line;
                    int lineNumber = 1;
                    while ((line = bufReader.readLine()) != null) {
                        System.out.println(lineNumber + ": " + line);
                        lineNumber++;
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }

                scanner.close();
            }
        }