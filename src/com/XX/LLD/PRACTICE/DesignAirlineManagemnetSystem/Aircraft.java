package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem;

public class Aircraft {

    private final String model;
    private final int totalSeat;
    private final String tailNumber;

    public Aircraft(String model, int totalSeat, String tailNumber) {
        this.model = model;
        this.totalSeat = totalSeat;
        this.tailNumber = tailNumber;
    }

    public String getModel() {
        return model;
    }
    public int getTotalSeat() {
        return totalSeat;
    }
    public String getTailNumber() {
        return tailNumber;
    }
}
