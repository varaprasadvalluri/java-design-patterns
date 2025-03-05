package com.gang4.behavioral.Interpreter;

public class TransactionTypeExpression implements Expression {
    private String type;

    public TransactionTypeExpression(String type) {
        this.type = type;
    }

    @Override
    public boolean interpret(TransactionContext context) {
        return context.getTransactionType().equalsIgnoreCase(type);
    }
}