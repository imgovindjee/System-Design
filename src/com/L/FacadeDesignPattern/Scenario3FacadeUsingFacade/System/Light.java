package com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.System;

public class Light implements Working{
    @Override
    public void turnOn() {
        System.out.println("Lights are ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights are OFF");
    }
}
