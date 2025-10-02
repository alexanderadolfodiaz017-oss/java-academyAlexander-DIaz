package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int health = 120;
        int damageTaken = 35;

        health -= damageTaken;

        if (health < 50) {
            System.out.println("Warning! Health is low!");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Punch " + i + " lands!");
        }
    }
}