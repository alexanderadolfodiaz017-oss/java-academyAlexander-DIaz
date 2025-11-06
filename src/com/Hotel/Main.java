package com.Hotel;

public class Main {
    public static void main(String[] args) {

        Room room = new Room(2, 120.00, false, false);
        System.out.println("Beds: " + room.getNumberOfBeds() + ", Price: $" + room.getPrice());

        Reservation res = new Reservation("King", 3, false);
        res.setPricePerNight(139.00);
        System.out.println("Type: " + res.getRoomType() + ", Nights: " + res.getNumberOfNights() + ", Total: $" + res.getReservationTotal());

        Employee emp = new Employee(101, "Alex Diaz", "Front Desk", 25.00, 45.0);
        System.out.println("Employee: " + emp.getName() + ", Pay Rate: $" + emp.getPayRate() + ", Total Pay: $" + emp.getTotalPay());
    }
}
 //