package com.gang4.behavioral.template;

public abstract class FundTransfer {
    // Template method defining the skeleton of the transfer process
    public final void transfer(double amount) {
        authenticateUser();
        verifyFunds(amount);
        executeTransfer(amount);
        sendNotification();
    }

    protected abstract void authenticateUser();  // Varies for different transfer types
    protected abstract void executeTransfer(double amount); // Varies for different transfer types

    private void verifyFunds(double amount) {
        System.out.println("Verifying funds: $" + amount);
    }

    private void sendNotification() {
        System.out.println("Sending transaction notification.");
    }
}