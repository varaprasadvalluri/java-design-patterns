package com.gang4.behavioral.Interpreter;
//🚀 Evaluates complex financial rules dynamically.
//🚀 Easily extendable – New rules can be added without modifying existing code.
//🚀 Decouples logic from implementation – No hardcoded conditions in transaction processing.
//🚀 Useful for fraud detection, interest calculations, and transaction approvals.
public class InterpreterPatternExample {
    public static void main(String[] args) {
        // Transaction Context
        TransactionContext transaction = new TransactionContext(7000, "WITHDRAWAL", 3000);

        // Define Expressions
        Expression balanceCheck = new BalanceExpression(5000);
        Expression transactionTypeCheck = new TransactionTypeExpression("WITHDRAWAL");
        Expression amountCheck = new TransactionAmountExpression(2000);

        // Create Combined Rules
        Expression rule1 = new AndExpression(balanceCheck, transactionTypeCheck);
        Expression rule2 = new OrExpression(balanceCheck, amountCheck);

        // Evaluate Rules
        System.out.println("Rule 1 (BALANCE > 5000 AND TRANSACTION_TYPE == 'WITHDRAWAL'): " + rule1.interpret(transaction));
        System.out.println("Rule 2 (BALANCE > 5000 OR TRANSACTION_AMOUNT > 2000): " + rule2.interpret(transaction));
    }
}
