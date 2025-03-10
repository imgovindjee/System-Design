package com.XX.LLD.PRACTICE.DesignLinkedIn.Notification;

import com.XX.LLD.PRACTICE.DesignLinkedIn.UserDetails.Profile.User;

import java.sql.Timestamp;

public class Notification {

    private String notificationID;
    private User user;
    private NotificationType notificationType;
    private String content;
    private Timestamp timestamp;

    public Notification(String notificationID, User user, NotificationType notificationType, String content, Timestamp timestamp) {
        this.notificationID = notificationID;
        this.user = user;
        this.notificationType = notificationType;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(String notificationID) {
        this.notificationID = notificationID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
