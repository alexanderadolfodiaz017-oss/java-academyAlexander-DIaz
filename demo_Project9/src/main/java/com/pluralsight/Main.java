package com.pluralsight;

public class Main {

    // Methods are declared at the class level
    public static void flyingKnee() {
        System.out.println("Flying Knee lands!");
    }

    public static void powerUppercut() {
        System.out.println("Power Uppercut hits!");
    }

    public static void heal() {
        System.out.println("Sergio heals 20 points!");
    }

    public static void main(String[] args) {
        // Loop to call each method 3 times
        for (int i = 1; i <= 3; i++) {
            flyingKnee();
            powerUppercut();
            heal();
        }
    }
}
