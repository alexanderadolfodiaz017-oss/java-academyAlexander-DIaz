package com.pluralsight;

public class debug_demo {
    public static void main(String[] args) {
        int number = 5;
        int result = number * 2;

        System.out.println("Double of number is: 10"); // variable error
        if (number < 0) { // logical error
            System.out.println("The number is positive.");
        }
    }
}

