package com.XX.LLD.PRACTICE.StatePattern.DesignATM.User;

public class UserBankAmount {

    int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withDrawalBalance(int amount) {
        balance = balance - amount;
    }
}
