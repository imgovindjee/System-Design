package com.XX.LLD.PRACTICE.StatePattern.DesignATM.WithDrawalProcess;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;

public class FiveHundredWithDrawalProcess extends CashWithDrawalProcess{

    public FiveHundredWithDrawalProcess(CashWithDrawalProcess cashWithDrawalProcess) {
        super(cashWithDrawalProcess);
    }

    public void withDrawal(ATM atm, int rem_amount){
        int amt_required = rem_amount / 500;
        int balance = rem_amount % 500;

        if (amt_required <= atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNote(amt_required);
        } else if(amt_required > atm.getNoOfFiveHundredNotes()) {
            atm.deductFiveHundredNote(atm.getNoOfFiveHundredNotes());
            balance = balance * (amt_required - atm.getNoOfFiveHundredNotes()) * 500;
        }

        if (balance != 0){
            super.withDrawal(atm, balance);
        }
    }
}
