package com.XX.LLD.PRACTICE.DesignOrderManagementSystem.Payment;

public class Payment {

    PaymentMode paymentMode;

//    CONSTRUCTOR
    public Payment(PaymentMode paymentMode){
        this.paymentMode = paymentMode;
    }

    public boolean makePayment() {
        return paymentMode.makePayment();
    }
}
