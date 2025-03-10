package com.AA.AllPattern.StructuralDesignPattern.Bridge.System;

import com.AA.AllPattern.StructuralDesignPattern.Bridge.SystemImplementor.BreatheImplemenator;

public abstract class LivingThings {
    BreatheImplemenator breatheImplemenator;

    public LivingThings(BreatheImplemenator breatheImplemenator) {
        this.breatheImplemenator = breatheImplemenator;
    }

    abstract public void breatheProcess();
}
