package com.gang4.behavioral.chainofresponsibility;

public class BasicCheckHandler extends TransactionHandler {
    @Override
    public void handleTransaction(double amount) {
        if (amount <= 0) {
            System.out.println("Transaction failed: Invalid amount.");
        } else {
            System.out.println("Basic validation passed for $" + amount);
            if (nextHandler != null) {
                nextHandler.handleTransaction(amount);
            }
        }
    }
}