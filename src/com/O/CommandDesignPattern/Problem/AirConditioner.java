package com.O.CommandDesignPattern.Problem;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAC() {
        isOn = true;
        System.out.println("AC is On");
    }

    public void turnOffAC() {
        isOn = false;
        System.out.println("AC os Off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to "+temperature);
    }
}
