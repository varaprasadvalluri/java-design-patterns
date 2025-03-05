package com.gang4.structuralpattren.facade;

public class NotificationService {
    public void sendNotification(String accountNumber, String message) {
        System.out.println("Sending notification to account " + accountNumber + ": " + message);
    }
}
