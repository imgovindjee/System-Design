package com.XX.LLD.PRACTICE.DesignAirlineManagemnetSystem.Payment;

public class PaymentProcessor {

    private static PaymentProcessor paymentProcessor;

    private PaymentProcessor(){}

    public static synchronized PaymentProcessor getInstance() {
        if (paymentProcessor == null){
            paymentProcessor = new PaymentProcessor();
        }
        return paymentProcessor;
    }

    public void processPayment(Payment payment){
        payment.processPayment();
    }
}
