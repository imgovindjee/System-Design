package com.XX.LLD.PRACTICE.DesignLinkedIn;

import com.XX.LLD.PRACTICE.DesignLinkedIn.UserDetails.Profile.User;

import java.sql.Timestamp;

public class Message {

    private String messageID;
    private User sender;
    private User receiver;
    private String content;
    private Timestamp timestamp;

    public Message(String messageID, User sender, User receiver, String content, Timestamp timestamp) {
        this.messageID = messageID;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getMessageID() {
        return messageID;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
