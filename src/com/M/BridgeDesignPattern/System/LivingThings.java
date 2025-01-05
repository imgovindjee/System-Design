package com.M.BridgeDesignPattern.System;

import com.M.BridgeDesignPattern.SystemImplementor.BreatheImpementor;

public abstract class LivingThings {

    BreatheImpementor breatheImpementor;
    public LivingThings(BreatheImpementor breatheImpementor) {
        this.breatheImpementor = breatheImpementor;
    }

    abstract public void breatheProcess();
}
