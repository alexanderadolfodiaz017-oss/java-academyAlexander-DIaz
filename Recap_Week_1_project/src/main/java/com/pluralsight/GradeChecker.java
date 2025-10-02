package com.pluralsight;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your exam score (0-100): ");

    int score = input.nextInt();


    if (score >= 90) {
        System.out.println("You got A");
    } else if (score >= 80) {
        System.out.println("You got B");
    } else if (score >= 70) {
        System.out.println("You got C");
    } else if (score >= 60) {
        System.out.println("You got D");
    } else {
        System.out.println("You got F");
    }
        input.close();
    }

}