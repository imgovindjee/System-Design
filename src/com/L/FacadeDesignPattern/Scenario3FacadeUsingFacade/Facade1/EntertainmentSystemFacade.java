package com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.Facade1;

import com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.System.Light;
import com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.System.MusicSystem;

public class EntertainmentSystemFacade {

    private MusicSystem musicSystem;
    private Light light;

//    CONSTRUCTOR
    public EntertainmentSystemFacade() {
        this.light = new Light();
        this.musicSystem = new MusicSystem();
    }

    public void startEntertainmentMode() {
        System.out.println("------------------------------------------------------------------------------" +
                "\nStarting Entertainment Mode");

        light.turnOn();
        musicSystem.playMusic();
    }

    public void stopEntertainmentMode() {
        System.out.println("-------------------------------------------------------------------------------" +
                "\nStopping Entertainment Mode");

        musicSystem.stopMusic();
        light.turnOff();
    }
}
