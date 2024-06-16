package com.thinkConstructive.userservice;

public class Notifications {
    private String notificationId;
    private String notificationDescription;

    public Notifications(String notificationId, String notificationDescription) {
        this.notificationId = notificationId;
        this.notificationDescription = notificationDescription;
    }

    public Notifications() {
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationDescription() {
        return notificationDescription;
    }

    public void setNotificationDescription(String notificationDescription) {
        this.notificationDescription = notificationDescription;
    }
}
