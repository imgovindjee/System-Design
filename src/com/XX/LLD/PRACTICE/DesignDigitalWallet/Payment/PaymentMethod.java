package com.XX.LLD.PRACTICE.DesignDigitalWallet.Payment;

import com.XX.LLD.PRACTICE.DesignDigitalWallet.Currency.Currency;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.User;

import java.math.BigDecimal;

public abstract class PaymentMethod {

    protected String paymentID;
    protected User user;

    public PaymentMethod(String paymentID, User user) {
        this.paymentID = paymentID;
        this.user = user;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public User getUser() {
        return user;
    }

    public abstract boolean processPayment(BigDecimal amount, Currency currency);
}
