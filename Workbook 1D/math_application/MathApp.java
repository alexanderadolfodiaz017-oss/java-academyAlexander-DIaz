package com.pluralsight;

public class MathApp {
    public class MathApp {
        public static void main(String[] args) {
            double bobSalary = 55000, garySalary = 60000;
            System.out.println("The highest salary is $" + Math.max(bobSalary, garySalary));

            double carPrice = 30000, truckPrice = 28000;
            System.out.println("The smallest price is $" + Math.min(carPrice, truckPrice));

            double radius = 7.25;
            System.out.println("The area of the circle is " + (Math.PI * Math.pow(radius, 2)));

            double number = 5.0;
            System.out.println("The square root of " + number + " is " + Math.sqrt(number));

            double x1 = 5, y1 = 10, x2 = 85, y2 = 50;
            System.out.println("The distance between the points is " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

            double value = -3.8;
            System.out.println("The absolute value of " + value + " is " + Math.abs(value));

            System.out.println("A random number between 0 and 1 is " + Math.random());

            int totalMinutes = 24 * 24 * 60;
            System.out.println("There are " + totalMinutes + " minutes in 24 days");
            System.out.println("There are " + ((long) totalMinutes * 60 * 1000) + " milliseconds in 24 days");
        }
    }
