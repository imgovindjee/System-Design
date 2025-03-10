package com.AA.AllPattern.BehaviouralDesignPattern.StatePattern.State;

import com.AA.AllPattern.BehaviouralDesignPattern.StatePattern.VendingMachine;

public class IdleState implements VendingState {
    @Override
    public void insert(VendingMachine product) {
//        BUSINESS LOGIC
        System.out.println("Coin Inserted");
        product.setMachineState(new WorkingState());
    }

    @Override
    public void dispenseItem(VendingMachine product) {
//        BUSINESS LOGIC
    }
}
