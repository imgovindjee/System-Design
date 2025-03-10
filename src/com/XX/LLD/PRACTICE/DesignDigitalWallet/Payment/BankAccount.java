package com.XX.LLD.PRACTICE.DesignDigitalWallet.Payment;

import com.XX.LLD.PRACTICE.DesignDigitalWallet.Currency.Currency;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Payment.PaymentMethod;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.User;

import java.math.BigDecimal;

public class BankAccount extends PaymentMethod {

    private String accountNumber;
    private String routingNumber;

    public BankAccount(String paymentID, User user, String accountNumber, String routingNumber) {
        super(paymentID, user);
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    @Override
    public boolean processPayment(BigDecimal amount, Currency currency) {
        return true;
    }
}
