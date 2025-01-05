package com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.Facade2;

import com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.Facade1.EntertainmentSystemFacade;
import com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.Facade1.SecuritySystemFacade;
import com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.System.AirConditioner;

public class MasterFacade {

    private EntertainmentSystemFacade entertainmentSystemFacade;
    private SecuritySystemFacade securitySystemFacade;
    private AirConditioner airConditioner;

    public MasterFacade() {
        this.entertainmentSystemFacade = new EntertainmentSystemFacade();
        this.securitySystemFacade = new SecuritySystemFacade();
        this.airConditioner = new AirConditioner();
    }

    public void startAllSystem() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Starting All System");
        entertainmentSystemFacade.startEntertainmentMode();
        airConditioner.turnOn();
        securitySystemFacade.activateSecurity();
    }

    public void stopAllSystem() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Stopping All System");
        entertainmentSystemFacade.stopEntertainmentMode();
        airConditioner.turnOff();
        securitySystemFacade.deactivateSecurity();
        System.out.println("All System Stopped");
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
