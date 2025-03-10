package com.AA.AllPattern.StructuralDesignPattern.Bridge.SystemImplementor;

public class LandBreathe implements BreatheImplemenator {
    @Override
    public void breatheProcess() {
        System.out.println("Breathe through Nose"+
                "\nInhale OXYGEN form AIR"+
                "\nExhale CARBON DIOXIDE");
    }
}
