package com.AA.AllPattern.StructuralDesignPattern.Bridge.System;

import com.AA.AllPattern.StructuralDesignPattern.Bridge.SystemImplementor.BreatheImplemenator;

public class Tree extends LivingThings {

    public Tree(BreatheImplemenator breatheImplemenator) {
        super(breatheImplemenator);
    }

    @Override
    public void breatheProcess() {
        breatheImplemenator.breatheProcess();
    }
}
