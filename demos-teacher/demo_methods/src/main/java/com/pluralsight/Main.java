package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Call the Hi function with new names
        Hi("Alex");     // prints: "Let's go Alex"
        Hi("Juanito");  // prints: "Let's go Juanito"
        Hi("Jr");       // prints: "Let's go Jr"

        // Call the IncreasePowerLevel function
        IncreasePowerLevel(90000); // prints: "My power has been increasing, now it's at 90000"
    }

    public static void Hi(String name) {
        System.out.println("Let's go " + name);
    }

    public static void IncreasePowerLevel(int powerlevel) {
        System.out.println("My power has been increasing, now it's at " + powerlevel);
    }
}