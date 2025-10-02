package com.pluralsight; // keep this only if the file is in com/pluralsight/

public class CatExercise {    // file should be CatExercise.java
    public static void main(String[] args) {
        String catName = "Charlie";
        int catAge = 2;
        double catWeight = 1.3;
        char catGrade = 'A';
        boolean isHungry = true;
        boolean isBegging = false;
        boolean isSleeping = false;
        boolean isPurring = true;

        System.out.println("Hi " + catName + "!");
        System.out.println("Age = " + catAge);
        System.out.println("Weight = " + catWeight + " lb");
        System.out.println("isHungry = " + isHungry);

        if (isSleeping) {
            System.out.println(catName + " is sleeping, shh... ");
        } else {
            System.out.println("Wake kitty! ");
        }
    }
}