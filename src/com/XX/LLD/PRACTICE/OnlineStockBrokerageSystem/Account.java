package com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem;

import com.XX.LLD.PRACTICE.OnlineStockBrokerageSystem.Exceptions.InsufficientFundExceptions;

public class Account {

    private String accountID;
    private User user;
    private double balance;
    private Portfolio portfolio;

    public Account(String accountID, User user, double balance) {
        this.accountID = accountID;
        this.user = user;
        this.balance = balance;
        this.portfolio = new Portfolio(this);
    }

    public synchronized  void deposit(double amount){
        balance += amount;
    }

    public synchronized void withdrawal(double amount){
        if (balance >= amount){
            balance -= amount;
        } else
            throw new InsufficientFundExceptions("Insufficient Funds in the account");
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
