package com.pluralsight;

public class Main {

    // Class-level variable so the method can access it
    static int health = 80;

    // Method: healing move
    public static void heal() {
        health += 20;  // Add 20 health points
        System.out.println("Sergio heals 20 points! Current health: " + health);
    }

    public static void main(String[] args) {
        System.out.println("Before healing, health: " + health);
        heal(); // Call the healing move
    }
}