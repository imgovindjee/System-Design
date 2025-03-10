package com.XX.LLD.PRACTICE.WhatsappDesign;

import java.time.LocalDateTime;
import java.util.List;

public class Message {

    private String messageID;
    private User sender;
    private List<User> receivers;
    private String content;
    private LocalDateTime timeStamp;
    private boolean isEncrypted;
    private boolean isDelivered;
    private boolean isRead;

    public Message(String messageID, User sender, List<User> receivers, String content) {
        this.messageID = messageID;
        this.sender = sender;
        this.receivers = receivers;
        this.content = content;
        this.timeStamp = LocalDateTime.now();
        this.isEncrypted = false;
        this.isDelivered = false;
        this.isRead = false;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public List<User> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<User> receivers) {
        this.receivers = receivers;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }

    public void setEncrypted(boolean encrypted) {
        isEncrypted = encrypted;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
