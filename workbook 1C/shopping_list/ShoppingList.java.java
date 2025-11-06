package com.pluralsight;

public class ShoppingList {
    public static void main(String[] args) {
        // Store items in an array
        String[] items = {
                "RAM",
                "BMW",
                "LAMBO",
                "AMG",
                "JEEP",
                "MUSTANG",
                "CAMERO",
                "KIA",
                "CAMRY",
                "TACOMA"
        };
        System.out.println("Shopping List:");
        // Loop through items and print each one
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }
    }
}
