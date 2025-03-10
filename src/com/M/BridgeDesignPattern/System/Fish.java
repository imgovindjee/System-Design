package com.M.BridgeDesignPattern.System;

import com.M.BridgeDesignPattern.SystemImplementor.BreatheImpementor;

public class Fish extends LivingThings{
    public Fish(BreatheImpementor breatheImpementor) {
        super(breatheImpementor);
    }

    @Override
    public void breatheProcess() {
        System.out.println("Breathe through Gills"+
                "\nAbsorb OXYGEN from Water"+
                "\nExhale CARBON DIOXIDE");
    }
}
