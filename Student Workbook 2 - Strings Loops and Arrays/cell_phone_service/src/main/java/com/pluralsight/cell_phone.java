package com.pluralsight;

public class cell_phone {

        String serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        void displayInfo() {
            System.out.println("Serial: " + serialNumber);
            System.out.println("Model: " + model);
            System.out.println("Carrier: " + carrier);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Owner: " + owner);
        }
    }


