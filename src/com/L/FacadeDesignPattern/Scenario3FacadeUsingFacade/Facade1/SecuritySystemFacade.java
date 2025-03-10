package com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.Facade1;

import com.L.FacadeDesignPattern.Scenario3FacadeUsingFacade.System.SecuritySystem;

public class SecuritySystemFacade {

    private SecuritySystem securitySystem;

    public SecuritySystemFacade() {
        this.securitySystem = new SecuritySystem();
    }

    public void activateSecurity() {
        System.out.println("\nActivating Security");
        securitySystem.activate();
    }

    public void deactivateSecurity() {
        System.out.println("\nDeactivating Security");
        securitySystem.deactivate();
    }
}
