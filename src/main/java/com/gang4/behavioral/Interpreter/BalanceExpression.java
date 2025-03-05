package com.gang4.behavioral.Interpreter;

public class BalanceExpression implements Expression {
    private double amount;

    public BalanceExpression(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean interpret(TransactionContext context) {
        return context.getBalance() > amount;
    }
}