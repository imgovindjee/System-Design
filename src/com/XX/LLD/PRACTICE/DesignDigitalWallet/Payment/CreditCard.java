package com.XX.LLD.PRACTICE.DesignDigitalWallet.Payment;

import com.XX.LLD.PRACTICE.DesignDigitalWallet.Currency.Currency;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Payment.PaymentMethod;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.User;

import java.math.BigDecimal;

public class CreditCard extends PaymentMethod {

    private String cardNumber;
    private String expire_date;
    private String cvv;

    public CreditCard(String paymentID, User user, String cardNumber, String expire_date, String cvv) {
        super(paymentID, user);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expire_date = expire_date;
    }

    @Override
    public boolean processPayment(BigDecimal amount, Currency currency) {
        return true;
    }
}
