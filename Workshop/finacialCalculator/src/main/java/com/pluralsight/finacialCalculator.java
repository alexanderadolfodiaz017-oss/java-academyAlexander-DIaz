package com.pluralsight;

import java.util.Scanner;

public class finacialCalculator {

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Which calculator do you want to use?");
            System.out.println("1. Mortgage Calculator");
            System.out.println("2. Future Value Calculator");
            System.out.println("3. Present Value Calculator");

            System.out.print("Make a selection: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: mortgageCalculator(sc); break;
                case 2: futureValueCalculator(sc); break;
                case 3: presentValueCalculator(sc); break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

            sc.close();
        }

        public static void mortgageCalculator(Scanner input) {
            System.out.print("Enter principal amount: ");
            double principal = input.nextDouble();
            System.out.print("Enter interest rate: ");
            double rate = input.nextDouble();
            System.out.print("Enter number of years: ");
            int years = input.nextInt();
        }

        public static void futureValueCalculator(Scanner input) {
            System.out.print("Enter deposit amount: ");
            double deposit = input.nextDouble();
            System.out.print("Enter interest rate: ");
            double rate = input.nextDouble();
            System.out.print("Enter number of years: ");
            int years = input.nextInt();
        }

        public static void presentValueCalculator(Scanner input) {
            System.out.print("Enter future amount: ");
            double futureAmount = input.nextDouble();
            System.out.print("Enter interest rate: ");
            double rate = input.nextDouble();
            System.out.print("Enter number of years: ");
            int years = input.nextInt();
        }
    }
}
