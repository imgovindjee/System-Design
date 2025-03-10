package com.XX.LLD.PRACTICE.DesignDigitalWallet;

import com.XX.LLD.PRACTICE.DesignDigitalWallet.Account.Account;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userID;
    private String username;
    private String email;
    private String password;
    private List<Account> accountList;

    public User(String userID, String username, String email, String password) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.password = password;
        this.accountList = new ArrayList<>();
    }

    public void addAccount(Account account){
        accountList.add(account);
    }

    public void removeAccount(Account account){
        accountList.remove(account);
    }

    public String  getUserID(){
        return userID;
    }
}
