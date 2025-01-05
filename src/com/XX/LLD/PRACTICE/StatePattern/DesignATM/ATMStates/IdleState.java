package com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATMStates;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.Card;

public class IdleState extends ATMState{

    public void insertCard(ATM atm, Card card){
        System.out.println("Card Inserted");
        atm.setCurrentAtmState(new HasCardState());
    }
}
