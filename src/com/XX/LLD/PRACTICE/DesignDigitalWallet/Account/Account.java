package com.XX.LLD.PRACTICE.DesignDigitalWallet.Account;

import com.XX.LLD.PRACTICE.DesignDigitalWallet.Currency.Currency;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.Exceptions.InsufficientFundExceptions;
import com.XX.LLD.PRACTICE.DesignDigitalWallet.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account  {

    private String accountID;
    private User user;
    private String accountNumber;
    private Currency currency;
    private BigDecimal balance;
    private List<Transaction> transactionList;

    public Account(String accountID, User user, String accountNumber, Currency currency) {
        this.accountID = accountID;
        this.user = user;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = BigDecimal.ZERO;
        this.transactionList = new ArrayList<>();
    }

    public String getAccountID() {
        return accountID;
    }

    public User getUser() {
        return user;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }



    public synchronized void deposit(BigDecimal amount){
        balance = balance.add(amount);
    }

    public synchronized void withdraw(BigDecimal amount){
        if (balance.compareTo(amount) >= 0){
            balance = balance.subtract(amount);
            System.out.println("-----------------------------------------");
            System.out.println("Amount Withdrawal: "+amount);
            System.out.println("Remaining Amount: "+balance);
            System.out.println();
        } else {
            throw new InsufficientFundExceptions("Insufficient fund in the account");
        }
    }

    public synchronized void addTransaction(Transaction transaction){
        transactionList.add(transaction);
    }
}
