package com.X.SplitWiseDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class UserExpenseBalanceSheet {

    private Map<String, Balance> user_balance;
    private double totalYourExpense;
    private double totalPayment;
    private double totalYouOwe;
    private double totalYouGetBack;

    public UserExpenseBalanceSheet() {
        this.user_balance = new HashMap<>();
        this.totalYouGetBack = 0;
        this.totalYouOwe = 0;
        this.totalYourExpense = 0;
    }

    public Map<String, Balance> getUser_balance() {
        return user_balance;
    }

    public void setUser_balance(Map<String, Balance> user_balance) {
        this.user_balance = user_balance;
    }

    public double getTotalYourExpense() {
        return totalYourExpense;
    }

    public void setTotalYourExpense(double totalYourExpense) {
        this.totalYourExpense = totalYourExpense;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getTotalYouOwe() {
        return totalYouOwe;
    }

    public void setTotalYouOwe(double totalYouOwe) {
        this.totalYouOwe = totalYouOwe;
    }

    public double getTotalYouGetBack() {
        return totalYouGetBack;
    }

    public void setTotalYouGetBack(double totalYouGetBack) {
        this.totalYouGetBack = totalYouGetBack;
    }
}
