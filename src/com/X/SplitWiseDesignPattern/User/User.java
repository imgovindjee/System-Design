package com.X.SplitWiseDesignPattern.User;

import com.X.SplitWiseDesignPattern.UserExpenseBalanceSheet;

public class User {

    private String userID;
    private String userName;
    private UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String userID, String userName) {
        this.userID = userID;
        this.userName = userName;
        this.userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserExpenseBalanceSheet(UserExpenseBalanceSheet userExpenseBalanceSheet) {
        this.userExpenseBalanceSheet = userExpenseBalanceSheet;
    }
}
