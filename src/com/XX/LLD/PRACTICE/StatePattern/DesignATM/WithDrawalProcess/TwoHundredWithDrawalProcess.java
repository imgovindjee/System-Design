package com.XX.LLD.PRACTICE.StatePattern.DesignATM.WithDrawalProcess;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;

public class TwoHundredWithDrawalProcess extends CashWithDrawalProcess{

    public TwoHundredWithDrawalProcess(CashWithDrawalProcess cashWithDrawalProcess) {
        super(cashWithDrawalProcess);
    }

    public void withDrawal(ATM atm, int rem_amount){
        int required_amount = rem_amount / 200;
        int balance = rem_amount % 200;

        if(required_amount <= atm.getNoOfTwoHundredNotes()) {
            atm.deductTwoHundredNote(required_amount);
        } else if(required_amount > atm.getNoOfTwoHundredNotes()){
            atm.deductTwoHundredNote(atm.getNoOfTwoHundredNotes());
            balance += (required_amount - atm.getNoOfTwoHundredNotes()) * 200;
        }

        if (balance != 0){
            super.withDrawal(atm, balance);
        }
    }
}
