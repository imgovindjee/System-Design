package com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATMStates;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.Card;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card){
        System.out.println("OOPS!! Something Went wrong, please try again");
    }

    public void authenticatePin(ATM atm, Card card, int pinCode) {
        System.out.println("OOPS!! Something Went wrong, please try again");
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("OOPS!! Something Went wrong, please try again");
    }

    public void cashWithDrawal(ATM atm, Card card, int withdrawalAmount){
        System.out.println("OOPS!! Something Went wrong, please try again");
    }

    public void displayBalance(ATM atm, Card card){
        System.out.println("OOPS!! Something Went wrong, please try again");
    }

    public void returnCard(){
        System.out.println("OOPS!! Something Went wrong, please try again");
    }

    public void exit(ATM atm){
        System.out.println("OOPS!! Something Went wrong, please try again");
    }
}
