package com.pluralsight;

public class Main {
    public static void main(String[] args) {
                cellphone phone = new cellphone();
                phone.serialNumber = "B4567";
                phone.model = "iPhone 15";
                phone.carrier = "AT&T";
                phone.phoneNumber = "555-1234";
                phone.owner = "Tom Aspinall";

                phone.displayInfo();
                phone.dial("555-9876");
            }
        }
