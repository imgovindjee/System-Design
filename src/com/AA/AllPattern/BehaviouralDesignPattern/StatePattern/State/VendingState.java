package com.AA.AllPattern.BehaviouralDesignPattern.StatePattern.State;

import com.AA.AllPattern.BehaviouralDesignPattern.StatePattern.VendingMachine;

public interface VendingState {
    public void insert(VendingMachine product);
    public void dispenseItem(VendingMachine product);
}
