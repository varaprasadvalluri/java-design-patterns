package com.gang4.behavioral.Interpreter;

public class TransactionAmountExpression implements Expression {
    private double amount;

    public TransactionAmountExpression(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean interpret(TransactionContext context) {
        return context.getTransactionAmount() > amount;
    }
}
