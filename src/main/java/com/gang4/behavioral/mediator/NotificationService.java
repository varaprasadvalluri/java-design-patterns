package com.gang4.behavioral.mediator;

public class NotificationService extends Service {
    public NotificationService(BankingMediator mediator) {
        super(mediator, "NotificationService");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("[NotificationService] Sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("[NotificationService] Received message: " + message);
    }
}