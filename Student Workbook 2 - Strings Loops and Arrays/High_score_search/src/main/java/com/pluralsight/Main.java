package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] highScores = {10, 20, 30, 50, 100};

        System.out.print("Enter the score to search for: ");
        int searchScore = scanner.nextInt();

        boolean found = false; // assume score is not found

        for (int score : highScores) {
            if (score == searchScore) {
                found = true;
                break; // exit the loop early if found
            }
        }

        if (found) {
            System.out.println(searchScore + " was found in the high scores!");
        } else {
            System.out.println(searchScore + " was NOT found in the high scores.");
        }

        scanner.close();

    }
}