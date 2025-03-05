package com.gang4.behavioral.mediator;

public interface BankingMediator {
    void sendMessage(String message, Service sender);

    void registerService(Service service);
}
