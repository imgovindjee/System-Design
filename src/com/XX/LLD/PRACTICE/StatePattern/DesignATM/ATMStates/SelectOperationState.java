package com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATMStates;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.Card;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.TransactionType;

public class SelectOperationState extends ATMState{

//    CONSTRUCTOR
    public SelectOperationState(){
        showOperations();
    }

    public void showOperations(){
        TransactionType.showAllTransactionTypes();
    }

    public void selectOperation(ATM atm, Card card, TransactionType transactionType) {
        System.out.println("Selected Operation is: "+transactionType.toString().toUpperCase());
        switch (transactionType){
            case CASH_WITHDRAWAL -> atm.setCurrentAtmState(new CashWithDrawalState());
            case BALANCE_CHECK -> atm.setCurrentAtmState(new CheckBalanceState());
            default -> {
                System.out.println("INVALID OPTION");
                exit(atm);
            }
        }
    }

    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentAtmState(new IdleState());
        System.out.println("EXITS COMPLETED");
    }

    public void returnCard(){
        System.out.println("Please Collect Your CARD");
    }
}
