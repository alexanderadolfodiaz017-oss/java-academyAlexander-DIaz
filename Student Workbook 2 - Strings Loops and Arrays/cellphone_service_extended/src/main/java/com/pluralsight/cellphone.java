package com.pluralsight;

public class cellphone {
        String serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        void dial(String numberToCall) {
            System.out.println(owner + " is calling " + numberToCall);
        }

        void displayInfo() {
            System.out.println("Serial: " + serialNumber);
            System.out.println("Model: " + model);
            System.out.println("Carrier: " + carrier);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Owner: " + owner);
        }
}

