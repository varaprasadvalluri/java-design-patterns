package com.gang4.behavioral.Interpreter;

public class TransactionContext {
    private double balance;
    private String transactionType;
    private double transactionAmount;

    public TransactionContext(double balance, String transactionType, double transactionAmount) {
        this.balance = balance;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }

    public double getBalance() {
        return balance;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
}
