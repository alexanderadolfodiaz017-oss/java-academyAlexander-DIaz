package com.pluralsight;

import java.util.Scanner;

public class addressbuilder {
    public static void main(String[] args) {

    }
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter your street: ");
    String street = sc.nextLine();

        System.out.print("Enter your city: ");
    String city = sc.nextLine();

        System.out.print("Enter your state: ");
    String state = sc.nextLine();

        System.out.print("Enter your zip code: ");
    String zip = sc.nextLine();

    StringBuilder address = new StringBuilder();
        address.append(street).append(", ").append(city)
                .append(", ").append(state).append(" ").append(zip);

        System.out.println("Your address is: " + address);
        sc.close();
    }
}