package com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATMStates;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.Card;

public class CheckBalanceState extends ATMState{

    public CheckBalanceState() {}

    public void displayBalance(ATM atm, Card card) {
        System.out.println("Your Balance is: "+card.getBankBalance());
        exit(atm);
    }

    public void exit(ATM atm){
        returnCard();
        atm.setCurrentAtmState(new IdleState());
        System.out.println("EXIT COMPLETED");
    }

    public void returnCard() {
        System.out.println("Please collect your Card");
    }
}
