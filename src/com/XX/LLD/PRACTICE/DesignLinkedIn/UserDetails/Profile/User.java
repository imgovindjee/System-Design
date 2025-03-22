package com.XX.LLD.PRACTICE.DesignLinkedIn.UserDetails.Profile;

import com.XX.LLD.PRACTICE.DesignLinkedIn.Message;

import java.util.List;

public class User {

    private String userID;
    private String username;
    private String email;
    private String password;
    private Profile profile;
    private List<Connection> connectionList;
    private List<Message> inbox_messageList;
    private List<Message> sent_messageList;

    public User(String userID, String username, String email, String password, Profile profile, List<Connection> connectionList, List<Message> inbox_messageList, List<Message> sent_messageList) {
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.connectionList = connectionList;
        this.inbox_messageList = inbox_messageList;
        this.sent_messageList = sent_messageList;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public List<Message> getInbox_messageList() {
        return inbox_messageList;
    }

    public void setInbox_messageList(List<Message> inbox_messageList) {
        this.inbox_messageList = inbox_messageList;
    }

    public List<Message> getSent_messageList() {
        return sent_messageList;
    }

    public void setSent_messageList(List<Message> sent_messageList) {
        this.sent_messageList = sent_messageList;
    }
}
