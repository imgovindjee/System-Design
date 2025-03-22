package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem;

public class Passenger {

    private final String passengerID;
    private final String passengerName;
    private final String email;
    private final String phone;

    public Passenger(String passengerID, String passengerName, String email, String phone) {
        this.passengerID = passengerID;
        this.passengerName = passengerName;
        this.email = email;
        this.phone = phone;
    }

    public String getPassengerID() {
        return passengerID;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
}
