package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // 1. Use numbers for scores
        String input = "Jon Jones:Tom Aspinall|25:23";

        // 2. Split into names and scores
        String[] parts = input.split("\\|");
        String[] names = parts[0].split(":");
        String[] scores = parts[1].split(":");

        // 3. Convert scores to integers
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        // 4. Compare and print inside the if/else
        if (score1 > score2) {
            System.out.println(names[0] + " wins!");
        } else if (score2 > score1) {
            System.out.println(names[1] + " wins!");
        } else {
            System.out.println("It’s a tie!");
        }
    }
}
