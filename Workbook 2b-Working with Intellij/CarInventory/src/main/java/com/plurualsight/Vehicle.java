package com.plurualsight;

public class Vehicle {
    private int id;
    private String makeModel;

    // Parameterized constructor
    public Vehicle(int id, String makeModel) {
        this.id = id;
        this.makeModel = makeModel;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    // toString method
    @Override
    public String toString() {
        return "Vehicle ID: " + id + ", Make/Model: " + makeModel;
    }
}
