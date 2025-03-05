package com.gang4.behavioral.chainofresponsibility;

public class DirectorApprovalHandler extends TransactionHandler {
    @Override
    public void handleTransaction(double amount) {
        if (amount > 10000) {
            System.out.println("Director approval required for $" + amount);
        }
        System.out.println("Transaction of $" + amount + " processed successfully.");
    }
}