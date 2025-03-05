package com.gang4.behavioral.observer;
//The Observer Pattern is a behavioral design pattern that defines a one-to-many
// dependency between objects so that when one object changes state, all its dependents
// (observers) are notified automatically.
public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create a Bank Account
        BankAccount account = new BankAccount("John Doe", 5000);

        // Create Observers
        Observer smsObserver = new SMSNotification();
        Observer emailObserver = new EmailNotification();
        Observer stockObserver = new StockMarketTracker();

        // Register Observers
        account.addObserver(smsObserver);
        account.addObserver(emailObserver);
        account.addObserver(stockObserver);

        // Perform Transactions
        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(5000); // Insufficient balance scenario
        //account.removeObserver(stockObserver);
    }
}
