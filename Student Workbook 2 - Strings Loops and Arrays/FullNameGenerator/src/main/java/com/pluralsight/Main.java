package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert First Name here");
        String firstName = input.nextLine();

        System.out.print("Insert Middle Name here");
        String middleName = input.nextLine();


        System.out.print("Insert Last Name here");
        String lastName = input.nextLine();


        System.out.print("Insert Suffix");
        String suffix = input.nextLine();


        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName = fullName + " " + middleName;
        }

        fullName = fullName + " " + lastName;

        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }

        System.out.println("Full name: " + fullName);
        input.close();
    }
}