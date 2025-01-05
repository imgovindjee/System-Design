package com.M.BridgeDesignPattern.SystemImplementor;

public class LandBreatheImplementor implements BreatheImpementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through Nose"+
                "\nInhale OXYGEN form AIR"+
                "\nExhale CARBON DIOXIDE");
    }
}
