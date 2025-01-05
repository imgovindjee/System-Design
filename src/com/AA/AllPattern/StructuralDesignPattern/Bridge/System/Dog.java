package com.AA.AllPattern.StructuralDesignPattern.Bridge.System;

import com.AA.AllPattern.StructuralDesignPattern.Bridge.SystemImplementor.BreatheImplemenator;

public class Dog extends LivingThings{

    public Dog(BreatheImplemenator breatheImplemenator) {
        super(breatheImplemenator);
    }

    @Override
    public void breatheProcess() {
        breatheImplemenator.breatheProcess();
    }
}
