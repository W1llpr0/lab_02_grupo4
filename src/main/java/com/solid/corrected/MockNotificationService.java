package com.solid.corrected;

public class MockNotificationService implements NotificationService {
    @Override
    public void sendNotification(String type, String recipient, String message) {
        System.out.println("MockNotification: " + type + " a " + recipient + ": " + message);
    }
}
