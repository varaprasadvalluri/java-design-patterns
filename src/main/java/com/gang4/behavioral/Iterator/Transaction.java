package com.gang4.behavioral.Iterator;

public class Transaction {
    private String transactionId;
    private String type;
    private double amount;

    public Transaction(String transactionId, String type, double amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction[ID=" + transactionId + ", Type=" + type + ", Amount=$" + amount + "]";
    }
}
