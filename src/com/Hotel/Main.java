package com.Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Clerk clerk = new Clerk("Maddie", 101);
        Guest guest = new Guest("Zack Martin");
        Room room = new Room(2, 150.00, false, true);
        Reservation reservation = new Reservation("Suite", 3, true);

        int choice;

        do {
            System.out.println("\n=== Welcome to The Tipton Hotel ===");
            System.out.println("1. Check In Guest");
            System.out.println("2. Order Room Service");
            System.out.println("3. Request Housekeeping");
            System.out.println("4. Check Out");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            choice = input.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    clerk.checkIn(guest, room);
                    break;
                case 2:
                    input.nextLine(); // consume leftover newline
                    System.out.print("Enter meal name: ");
                    String meal = input.nextLine();
                    System.out.print("Enter meal price: ");
                    double price = input.nextDouble();
                    guest.orderRoomService(meal, price);
                    break;
                case 3:
                    guest.requestHousekeeping();
                    break;
                case 4:
                    clerk.checkOut(guest, reservation);
                    break;
                case 5:
                    System.out.println("Thank you for staying at The Tipton Hotel!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        } while (choice != 5);

        input.close();
    }
}
