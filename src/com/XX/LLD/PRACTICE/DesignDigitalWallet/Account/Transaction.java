package com.XX.LLD.PRACTICE.DesignDigitalWallet.Account;

import com.XX.LLD.PRACTICE.DesignDigitalWallet.Account.Account;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Currency.Currency;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private String transactionID;
    private Account source_account;
    private Account destination_account;
    private BigDecimal amount;
    private Currency currency;
    private LocalDateTime timeStamp;

    public Transaction(String transactionID, Account source_account, Account destination_account, BigDecimal amount, Currency currency) {
        this.transactionID = transactionID;
        this.source_account = source_account;
        this.destination_account = destination_account;
        this.amount = amount;
        this.currency = currency;
        this.timeStamp = LocalDateTime.now();
    }

    public String getTransactionID() {
        return transactionID;
    }

    public Account getSource_account() {
        return source_account;
    }

    public Account getDestination_account() {
        return destination_account;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}
