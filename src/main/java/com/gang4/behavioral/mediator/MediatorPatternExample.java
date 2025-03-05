package com.gang4.behavioral.mediator;
//🚀 Decouples components – Services don’t depend on each other directly.
//🚀 Centralized communication – The Mediator handles message passing.
//🚀 Easier maintenance – Adding new services (e.g., Fraud Detection) doesn’t require modifying existing services.
//🚀 Improves scalability – More services can be added without increasing dependencies.

//
//Description -
//        1. This design pattern is needed when we don't want to expose one functionality to end user. that's why we craete one mediator that interacts with the end user and finally communicates with the main system


public class MediatorPatternExample {

    public static void main(String[] args) {
        // Create Mediator
        BankingNotificationMediator mediator = new BankingNotificationMediator();

        // Create Services
        AccountService accountService = new AccountService(mediator);
        LoanService loanService = new LoanService(mediator);
        NotificationService notificationService = new NotificationService(mediator);

        // Simulate communication
        accountService.sendMessage("New account created for customer.");
        loanService.sendMessage("Loan approved for customer.");
        notificationService.sendMessage("Transaction alert sent to customer.");
    }
}
