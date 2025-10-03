package com.pluralsight;

public class HighScorePosition {
    public static void main(String[] args) {
        int[] highScores = {1500, 900, 1200, 700, 2000};
        int maxScore = highScores[0];
        int maxIndex = 0;

        for (int i = 1; i < highScores.length; i++) {
            if (highScores[i] > maxScore) {
                maxScore = highScores[i];
                maxIndex = i;
            }
        }

        System.out.println("The highest score is " + maxScore + " at position " + maxIndex);
    }
}