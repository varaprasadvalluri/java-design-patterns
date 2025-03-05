package com.gang4.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class BankingNotificationMediator implements BankingMediator {
    private List<Service> services = new ArrayList<>();

    public void registerService(Service service) {
        services.add(service);
    }

    @Override
    public void sendMessage(String message, Service sender) {
        for (Service service : services) {
            if (service != sender) { // Prevent sending message back to sender
                service.receiveMessage(message);
            }
        }
    }
}