package com.AA.AllPattern.StructuralDesignPattern.Facade.EG2HiddingSystemComplexity.ComplexSystem;

public class ACInternalUnits {
    public void acceptUserONCmd() {
        System.out.println("AC ON");
//        BUSINESS LOGIC HERE
    }

    public void acceptUserOFFCmd() {
        System.out.println("AC OFF");
//        BUSINESS LOGIC HERE
    }

    public void acceptUserTemperatureCmd() {
        System.out.println("Temperature Setup");
//        BUSINESS LOGIC HERE
    }
}
