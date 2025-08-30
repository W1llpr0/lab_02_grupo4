package com.solid.corrected;


public class SMSNotificationService implements NotificationService {
    
    @Override
    public void sendNotification(String recipient, String subject, String message) {
        System.out.println("=== SMS NOTIFICATION ===");
        System.out.println("To: " + recipient);
        System.out.println("Message: " + message);
        System.out.println("=======================");
        

    }
}
