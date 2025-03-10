package com.T.TempletDesignPattern.Payment;


public class PayToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
//        BUSINESS LOGIC
        System.out.println("------------------------------------------------" +
                "\nValidate logic of Pay To Merchant");
    }

    @Override
    public void debitAmount() {
//        BUSINESS LOGIC
        System.out.println("------------------------------------------------" +
                "\nAmount Debit for Pay To Merchant");
    }

    @Override
    public void calculateFees() {
//        BUSINESS LOGIC
        System.out.println("------------------------------------------------" +
                "\n10% fee charged for Pay To Merchant");

    }

    @Override
    public void creditAmount() {
//        BUSINESS LOGIC
        System.out.println("------------------------------------------------" +
                "\nFull Amount credited from Pay To Merchant");
    }
}
