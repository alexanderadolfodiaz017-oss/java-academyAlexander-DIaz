package com.Hotel;

public class Clerk {
    private String name;
    private int employeeId;

    public Clerk(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void checkIn(Guest guest, Room room) {
        room.setOccupied(true);
        System.out.println(name + " checked in " + guest.getName() + " to Room " + room.getRoomNumber());
    }

    public void checkOut(Guest guest, Reservation res) {
        System.out.println(guest.getName() + " checked out. Total: $" + res.getReservationTotal());
        System.out.println("Housekeeping has been notified to clean the room.");
    }
}
