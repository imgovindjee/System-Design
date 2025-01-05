package com.A.SOLID.I.InterfaceSegmentedPrinciple.Solution;

public class Chef implements ChefInterface{
    @Override
    public void cookFood() {
        System.out.println("Food cooked");
    }

    @Override
    public void decideMenu() {
        System.out.println("Menu decided");
    }
}
