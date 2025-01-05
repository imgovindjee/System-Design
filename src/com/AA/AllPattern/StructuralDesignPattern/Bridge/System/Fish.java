package com.AA.AllPattern.StructuralDesignPattern.Bridge.System;

import com.AA.AllPattern.StructuralDesignPattern.Bridge.SystemImplementor.BreatheImplemenator;

public class Fish extends LivingThings{
    public Fish(BreatheImplemenator breatheImplemenator) {
        super(breatheImplemenator);
    }

    @Override
    public void breatheProcess() {
        breatheImplemenator.breatheProcess();
    }
}
