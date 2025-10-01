package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        for (int opponent = 1; opponent <= 3; opponent++) {
            System.out.println("Fighting opponent " + opponent);

            for (int punch = 1; punch <= 5; punch++) {
                System.out.println("Punch " + punch + " lands!");
            }

            System.out.println("Opponent " + opponent + " defeated!\n");
        }
        //💬 Quick question: How many times will "Punch X lands!" print in total?
                   // answer = 15
    }
}