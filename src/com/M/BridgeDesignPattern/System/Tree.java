package com.M.BridgeDesignPattern.System;

import com.M.BridgeDesignPattern.SystemImplementor.BreatheImpementor;

public class Tree extends LivingThings{

    public Tree(BreatheImpementor breatheImpementor) {
        super(breatheImpementor);
    }

    @Override
    public void breatheProcess() {
        System.out.println("Breathe through Leaves"+
                "\nInhale CARBON DIOXIDE"+
                "\nExhale OXYGEN using Photosynthesis");
    }
}
