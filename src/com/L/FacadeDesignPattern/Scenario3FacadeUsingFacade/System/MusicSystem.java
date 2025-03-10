package com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.System;

public class MusicSystem implements Working{
    @Override
    public void turnOn() {
        System.out.println("Music System are ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Music System are OFF");
    }

    public void playMusic(){
        turnOn();
        System.out.println("Playing Music");
    }

    public void stopMusic(){
        turnOff();
        System.out.println("Stop Playing Music");
    }
}
