package com.gang4.behavioral.chainofresponsibility;

public abstract class TransactionHandler {
    protected TransactionHandler nextHandler;

    public void setNextHandler(TransactionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleTransaction(double amount);
}