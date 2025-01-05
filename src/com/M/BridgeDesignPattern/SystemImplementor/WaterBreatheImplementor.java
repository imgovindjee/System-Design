package com.M.BridgeDesignPattern.SystemImplementor;

public class WaterBreatheImplementor implements BreatheImpementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through Gills"+
                "\nAbsorb OXYGEN from Water"+
                "\nExhale CARBON DIOXIDE");
    }
}
