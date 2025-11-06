package com.plurualsight;

public class ForLoop {
     public static void main(String[] args) throws InterruptedException {
            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
                Thread.sleep(1000); // pauses 1 second between numbers
            }
            System.out.println("Launch!");
        }
    }
