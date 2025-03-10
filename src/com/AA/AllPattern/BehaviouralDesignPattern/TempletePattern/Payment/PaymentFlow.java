package com.AA.AllPattern.BehaviouralDesignPattern.TempletePattern.Payment;

public abstract class PaymentFlow {
    abstract public void validateRequest();
    abstract public void debitAmount();
    abstract public void calculateFees();
    abstract public void creditAmount();

    //    TEMPLATE THAT DEFINES THE ORDER OF FLOW (EXECUTION ON THE ABOVE METHOD OR TASK)
    public void sendMoney() {
//        step-1
        validateRequest();
//        step-2
        debitAmount();
//        step-3
        calculateFees();
//        step-4
        creditAmount();
    }
}
