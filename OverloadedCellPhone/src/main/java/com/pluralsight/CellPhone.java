package com.pluralsight;

public class CellPhone {
    public class CellPhone {
        String serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        CellPhone() {}

        CellPhone(String serialNumber, String model, String carrier, String phoneNumber, String owner) {
            this.serialNumber = serialNumber;
            this.model = model;
            this.carrier = carrier;
            this.phoneNumber = phoneNumber;
            this.owner = owner;
        }

        void dial(String numberToCall) {
            System.out.println(owner + " is calling " + numberToCall);
        }

        void dial(CellPhone otherPhone) {
            System.out.println(owner + " is calling " + otherPhone.owner + " at " + otherPhone.phoneNumber);
        }

        void displayInfo() {
            System.out.println(model + " (" + carrier + ") - " + phoneNumber);
        }
    }

}
