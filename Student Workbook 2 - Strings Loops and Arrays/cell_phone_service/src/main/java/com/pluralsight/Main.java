package com.pluralsight;

public class Main {
    public static void main(String[] args) {

                cell_phone phone = new cell_phone();
                phone.serialNumber = "A1234";
                phone.model = "Galaxy S24";
                phone.carrier = "Verizon";
                phone.phoneNumber = "555-9876";
                phone.owner = "Jon Jones";

                phone.displayInfo();
    }
}

