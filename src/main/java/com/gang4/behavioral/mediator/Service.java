package com.gang4.behavioral.mediator;

public abstract class Service {
    protected BankingMediator mediator;
    protected String name;

    public Service(BankingMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.registerService(this);
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
