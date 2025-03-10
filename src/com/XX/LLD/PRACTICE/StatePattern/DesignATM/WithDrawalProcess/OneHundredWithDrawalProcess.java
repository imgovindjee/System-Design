package com.XX.LLD.PRACTICE.StatePattern.DesignATM.WithDrawalProcess;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;

public class OneHundredWithDrawalProcess extends CashWithDrawalProcess{

    public OneHundredWithDrawalProcess(CashWithDrawalProcess cashWithDrawalProcess) {
        super(cashWithDrawalProcess);
    }

    public void withDrawal(ATM atm, int rem_amount){
        int required_amount = rem_amount / 100;
        int balance = rem_amount % 100;

        if(required_amount <= atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNote(required_amount);
        } else if(required_amount > atm.getNoOfOneHundredNotes()) {
            atm.deductOneHundredNote(atm.getNoOfOneHundredNotes());
            balance += (required_amount - atm.getNoOfTwoHundredNotes()) * 100;
        }

        if(balance != 0){
            super.withDrawal(atm, balance);
        }
    }
}
