package com.M.BridgeDesignPattern.System;

import com.M.BridgeDesignPattern.SystemImplementor.BreatheImpementor;


public class Dog extends LivingThings{

    public Dog(BreatheImpementor breatheImpementor) {
        super(breatheImpementor);
    }

    @Override
    public void breatheProcess() {
        System.out.println("Breathe through Nose"+
                "\nInhale OXYGEN form AIR"+
                "\nExhale CARBON DIOXIDE");
    }
}
