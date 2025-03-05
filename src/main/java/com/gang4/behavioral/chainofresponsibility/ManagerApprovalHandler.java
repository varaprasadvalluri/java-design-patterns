package com.gang4.behavioral.chainofresponsibility;

public class ManagerApprovalHandler extends TransactionHandler {
    @Override
    public void handleTransaction(double amount) {
        if (amount > 5000) {
            System.out.println("Manager approval required for $" + amount);
        }
        if (nextHandler != null) {
            nextHandler.handleTransaction(amount);
        }
    }
}
