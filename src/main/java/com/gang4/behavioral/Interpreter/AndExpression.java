package com.gang4.behavioral.Interpreter;

public class AndExpression implements Expression {
    private Expression expr1, expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(TransactionContext context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}