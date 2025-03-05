package com.gang4.behavioral.mediator;

public class LoanService extends Service {
    public LoanService(BankingMediator mediator) {
        super(mediator, "LoanService");
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("[LoanService] Sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("[LoanService] Received message: " + message);
    }
}