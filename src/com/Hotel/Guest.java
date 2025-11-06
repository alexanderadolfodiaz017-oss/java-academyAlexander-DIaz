package com.Hotel;

public class Guest {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void orderRoomService(String meal, double price) {
        System.out.println(name + " ordered " + meal + " for $" + price + " (charged to room).");
    }

    public void requestHousekeeping() {
        System.out.println(name + " called the front desk for housekeeping assistance.");
    }
}