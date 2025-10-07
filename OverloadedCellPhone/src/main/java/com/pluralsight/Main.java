package com.pluralsight;
public class Main {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone("C7890", "Pixel 9", "T-Mobile", "555-1111", "Alex Pereira");
        CellPhone phone2 = new CellPhone();
        phone2.CellPhone = "D4567";
        phone2.CellPhone = "iPhone 15";
        phone2.carrier = "Verizon";
        phone2.phoneNumber = "555-2222";
        phone2.owner = "Tom Aspinall";

        phone1.toString();
        phone2.toString();

        phone1.finalize("555-3333");
        phone1.finalize(phone2);
    }
}