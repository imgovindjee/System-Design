package com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATMStates;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.Card;

public class HasCardState extends ATMState {

    public HasCardState(){
        System.out.println("-------------------------------------------------" +
                "\nEnter Your Card PIN-NUMBER\n" +
                "-----------------------------------------------");
    }

    public void authenticatePin(ATM atm, Card card, int pin) {
        if(card.isPinCorrect(pin)) {
            atm.setCurrentAtmState(new SelectOperationState());
        } else {
            System.out.println("--------------------------------------------------------------" +
                    "\nINVALID PIN NUMBER\n" +
                    "----------------------------------------------------------");
            exit(atm);
        }
    }
}
