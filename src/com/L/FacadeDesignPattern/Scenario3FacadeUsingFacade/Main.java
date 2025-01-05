package com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade;

import com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.Facade2.MasterFacade;

public class Main {
    public static void main(String[] args) {
        MasterFacade masterFacade = new MasterFacade();
        masterFacade.startAllSystem();
        masterFacade.stopAllSystem();
    }
}
