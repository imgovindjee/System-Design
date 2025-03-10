package com.AA.AllPattern.BehaviouralDesignPattern.StatePattern;

import com.AA.AllPattern.BehaviouralDesignPattern.StatePattern.State.VendingState;

public class VendingMachine {
    VendingState vendingMachineState;

//    GETTER & SETTER
    public VendingState getMachineState() {
        return vendingMachineState;
    }

    public void setMachineState(VendingState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }
}
