package com.gang4.behavioral.Interpreter;

public interface Expression {
    boolean interpret(TransactionContext context);
}
