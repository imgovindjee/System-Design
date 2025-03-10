package com.XX.LLD.PRACTICE.StatePattern.DesignATM.WithDrawalProcess;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;

public class TwoThousandWithDrawalProcess extends CashWithDrawalProcess{

    public TwoThousandWithDrawalProcess(CashWithDrawalProcess cashWithDrawalProcess) {
        super(cashWithDrawalProcess);
    }

    public void withDrawal(ATM atm, int rem_amount){
        int required_amount = rem_amount / 500;
        int balance = rem_amount % 500;

        if(required_amount <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNote(required_amount);
        } else if(required_amount > atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNote(atm.getNoOfFiveHundredNotes());
            balance += (required_amount - atm.getNoOfFiveHundredNotes()) * 500;
        }

        if(balance != 0){
            super.withDrawal(atm, balance);
        }
    }
}
