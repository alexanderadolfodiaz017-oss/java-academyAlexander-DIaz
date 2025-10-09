package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 10 test scores
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 89, 84, 91};

        // Average
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / scores.length;

        // High and low scores
        int high = scores[0];
        int low = scores[0];
        for (int score : scores) {
            if (score > high) high = score;
            if (score < low) low = score;
        }

        // Median (BONUS)
        Arrays.sort(scores);
        double median;
        if (scores.length % 2 == 0) {
            median = (scores[4] + scores[5]) / 2.0;
        } else {
            median = scores[scores.length / 2];
        }

        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + high);
        System.out.println("Lowest score: " + low);
        System.out.println("Median score: " + median);
        System.out.println("Difference between average and median: " + Math.abs(average - median));
    }
}