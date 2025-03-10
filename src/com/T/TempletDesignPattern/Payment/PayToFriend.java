package com.T.TempletDesignPattern.Payment;

import com.T.TempletDesignPattern.Payment.PaymentFlow;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
//        BUSINESS LOGIC
        System.out.println("------------------------------------------------" +
                "\nValidate logic of Pay To Friend");
    }

    @Override
    public void debitAmount() {
//        BUSINESS LOGIC
        System.out.println("------------------------------------------------" +
                "\nAmount debited for Pay To Friend");
    }

    @Override
    public void creditAmount() {
//        BUSINESS LOGIC
        System.out.println("------------------------------------------------" +
                "\nFull Amount credited from Pay To Friend");
    }

    @Override
    public void calculateFees() {
//        BUSINESS LOGIC
        System.out.println("------------------------------------------------" +
                "\n0% fee charge for Pay To Friend");
    }
}
