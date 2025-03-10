package com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATMStates;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.Card;
import com.XX.LLD.PRACTICE.StatePattern.DesignATM.WithDrawalProcess.*;

public class CashWithDrawalState extends ATMState{

    public CashWithDrawalState() {
        System.out.println("-------------------------------------------------" +
                "\nPlease Enter the withDrawal Amount\n" +
                "-----------------------------------------------");
    }

    public void cashWithDrawal(ATM atm, Card card, int withdrawal_amount_request) {
        System.out.println("Amount to be Withdraw:- "+withdrawal_amount_request);

        if(atm.getAtmBalance() < withdrawal_amount_request) {
            System.out.println("INSUFFICIENT FUND IN THE ATM MACHINE");
            exit(atm);
        } else if(card.getBankBalance() < withdrawal_amount_request) {
            System.out.println("INSUFFICIENT FUND IN YOUR BANK ACCOUNT");
            exit(atm);
        } else {
            card.deductBankBalance(withdrawal_amount_request);
            atm.deductATMBalance(withdrawal_amount_request);

//            USING CHAIN_OF_RESPONSIBILITIES
//            LOGIC FOR COLLECTING MONEY FROM THE ATM
//            WHILE WITHDRAWAL
            CashWithDrawalProcess cashWithDrawalProcess = new TwoThousandWithDrawalProcess(
                    new FiveHundredWithDrawalProcess(
                            new TwoHundredWithDrawalProcess(
                                    new OneHundredWithDrawalProcess(null)
                            )));
            cashWithDrawalProcess.withDrawal(atm, withdrawal_amount_request);
            exit(atm);
        }
    }

    public void exit(ATM atm){
        returnCard();
        atm.setCurrentAtmState(new IdleState());
        System.out.println("EXIT COMPLETED");
    }

    public void returnCard() {
        System.out.println("Please Collect Your Card");
    }
}
