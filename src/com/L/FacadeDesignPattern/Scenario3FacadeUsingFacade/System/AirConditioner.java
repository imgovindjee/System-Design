package com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.System;

public class AirConditioner implements Working{
    @Override
    public void turnOn() {
        System.out.println("AirConditioner are ON");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioner are OFF");
    }
}
