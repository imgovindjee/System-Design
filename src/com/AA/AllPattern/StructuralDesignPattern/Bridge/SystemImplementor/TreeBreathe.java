package com.AA.AllPattern.StructuralDesignPattern.Bridge.SystemImplementor;

public class TreeBreathe implements BreatheImplemenator {
    @Override
    public void breatheProcess() {
        System.out.println("Breathe through Leaves"+
                "\nInhale CARBON DIOXIDE"+
                "\nExhale OXYGEN using Photosynthesis");
    }
}
