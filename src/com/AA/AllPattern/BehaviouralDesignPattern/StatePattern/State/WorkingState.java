package com.AA.AllPattern.BehaviouralDesignPattern.StatePattern.State;

import com.AA.AllPattern.BehaviouralDesignPattern.StatePattern.VendingMachine;

public class WorkingState implements VendingState {
    @Override
    public void insert(VendingMachine product) {
//        BUSINESS LOGIC
    }

    @Override
    public void dispenseItem(VendingMachine product) {
//        BUSINESS LOGIC
        System.out.println("Product Dispensed");
    }
}
