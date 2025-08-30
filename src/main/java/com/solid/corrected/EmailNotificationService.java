package com.solid.corrected;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String type, String recipient, String message) {
        System.out.println("Email enviado a " + recipient + ": " + message);
    }
}
