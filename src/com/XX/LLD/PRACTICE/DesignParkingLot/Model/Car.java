package com.XX.LLD.PRACTICE.DesignParkingLot.Model;

public class Car {

    private String registrationNumber;
    private String carColor;

    public Car(String registrationNumber, String color) {
        this.registrationNumber = registrationNumber;
        this.carColor = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String color) {
        this.carColor = color;
    }
}
