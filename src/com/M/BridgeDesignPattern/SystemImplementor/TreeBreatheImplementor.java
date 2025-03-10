package com.M.BridgeDesignPattern.SystemImplementor;

public class TreeBreatheImplementor implements BreatheImpementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through Leaves"+
                "\nInhale CARBON DIOXIDE"+
                "\nExhale OXYGEN using Photosynthesis");
    }
}
