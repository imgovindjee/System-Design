package com.AA.AllPattern.StructuralDesignPattern.Bridge.SystemImplementor;

public class WaterBreathe implements BreatheImplemenator {
    @Override
    public void breatheProcess() {
        System.out.println("Breathe through Gills"+
                "\nAbsorb OXYGEN from Water"+
                "\nExhale CARBON DIOXIDE");
    }
}
