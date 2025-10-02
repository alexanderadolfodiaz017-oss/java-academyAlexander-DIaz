package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int score = 0;  // Start with 0 points

        for (int punch = 1; punch <= 10; punch++) {
            score += 10;  // Add 10 points per punch
            System.out.println("Punch " + punch + " scored! Current score: " + score);
        }

        System.out.println("Total score after 10 punches: " + score);

        //💬 Quick question:
        //What will be printed as the final total score after the loop ends?
        //Total score after 10 punches: 100
    }
}