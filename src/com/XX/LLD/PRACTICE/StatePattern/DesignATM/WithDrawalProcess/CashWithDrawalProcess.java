package com.XX.LLD.PRACTICE.StatePattern.DesignATM.WithDrawalProcess;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.ATM;

public abstract class CashWithDrawalProcess {

    CashWithDrawalProcess cashWithDrawalProcess;

    public CashWithDrawalProcess(CashWithDrawalProcess cashWithDrawalProcess) {
        this.cashWithDrawalProcess = cashWithDrawalProcess;
    }

    public void withDrawal(ATM atm, int rem_amount){
        if(cashWithDrawalProcess != null){
            cashWithDrawalProcess.withDrawal(atm, rem_amount);
        }
    }
}
