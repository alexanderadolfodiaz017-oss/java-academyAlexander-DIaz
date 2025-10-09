package com.pluralsight;

public class Main {
    private long vehicleId;
    private String makeModel;

    public Main(long vehicleId, String makeModel) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
    }

    public long getVehicleId() { return vehicleId; }
    public void setVehicleId(long vehicleId) { this.vehicleId = vehicleId; }

    public String getMakeModel() { return makeModel; }
    public void setMakeModel(String makeModel) { this.makeModel = makeModel; }

    public String toString() {
        return vehicleId + " | " + makeModel;
    }
}