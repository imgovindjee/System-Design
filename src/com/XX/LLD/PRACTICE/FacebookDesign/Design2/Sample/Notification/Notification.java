package com.XX.LLD.PRACTICE.FacebookDesign.Design2.Sample.Notification;

import java.sql.Timestamp;

public class Notification {

    private String notificationID;
    private String userID;
    private NotificationType notificationType;
    private String content;
    private Timestamp timestamp;

    public Notification(String notificationID, String userID, NotificationType notificationType, String content, Timestamp timestamp) {
        this.notificationID = notificationID;
        this.userID = userID;
        this.notificationType = notificationType;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getNotificationID() {
        return notificationID;
    }

    public String getUserID() {
        return userID;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
