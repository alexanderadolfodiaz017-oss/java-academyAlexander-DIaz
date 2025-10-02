package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // primitive variables
        boolean alreadyAte = false;
        boolean canCook = true;

        // reference variables
        String firstName = "Alexander";
        String lastName = "Diaz";
        int age = 22;
        String favColor = "blue";
        String favArtist = "NAV";
        String fullName = firstName + " " + lastName;

        // Intro
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println("Favorite color: " + favColor);
        System.out.println("Favorite artist: " + favArtist);

        // Eating & cooking logic
        if (alreadyAte) {
            System.out.println(firstName + " has already eaten and is ready to start the day focused.");
        }
        else if (!alreadyAte && canCook) {
            System.out.println(firstName + " is hungry, but can make something to eat before getting started.");
        }
        else {
            System.out.println(firstName + " is hungry and doesn’t know how to cook. Needs a quick meal.");
        }

        // Mood & breakfast checker (personalized)
        boolean isHappy = true;
        boolean hadBreakfast = false;
        
        if (isHappy && hadBreakfast) {
            System.out.println(firstName + " is feeling good and fueled by breakfast, ready to tackle the day.");
        }
        else if (isHappy && !hadBreakfast) {
            System.out.println(firstName + " is in a positive mood, but skipping breakfast might affect energy later.");
        }
        else if (!isHappy && hadBreakfast) {
            System.out.println(firstName + " had breakfast, but something is making the morning feel off.");
        }
        else {
            System.out.println(firstName + " is low on energy and not feeling great. Breakfast is needed soon.");
        }
    }
}
