package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Payment;

public class Payment {

    private final String paymentID;
    private final String paymentMethod;
    private final double amount;
    private PaymentStatus paymentStatus;

    public Payment(String paymentID, String paymentMethod, double amount) {
        this.paymentID = paymentID;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public String getPaymentID() {
        return paymentID;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public double getAmount() {
        return amount;
    }
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void processPayment() {
//        PAYMENT LOGIC HERE
        paymentStatus = PaymentStatus.COMPLETED;
    }
}
