package com.gang4.behavioral.mediator;

public class AccountService extends Service {
    public AccountService(BankingMediator mediator) {
        super(mediator, "AccountService");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("[AccountService] Sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("[AccountService] Received message: " + message);
    }
}