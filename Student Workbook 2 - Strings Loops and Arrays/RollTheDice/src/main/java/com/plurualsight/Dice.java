package com.plurualsight;

public class Dice {
    // Method to roll a single die (1–6)
    public int roll() {
        int randomNumber = (int) (Math.random() * 6) + 1;
        return randomNumber;
    }
}
