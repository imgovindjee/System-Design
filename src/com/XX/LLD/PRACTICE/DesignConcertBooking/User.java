package com.XX.LLD.PRACTICE.DesignConcertBooking;

public class User {

    private String userName;
    private String email;
    private String userID;

    public User(String userName, String email, String userID) {
        this.userName = userName;
        this.email = email;
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
}
