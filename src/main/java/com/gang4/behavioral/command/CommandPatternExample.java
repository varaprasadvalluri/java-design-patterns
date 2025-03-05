package com.gang4.behavioral.command;
//🚀 Decouples request senders and receivers (Invoker manages execution).
//🚀 Supports undo/redo (extend with an undo() method).
//🚀 Allows queuing & batch processing (transactions are stored and executed later).
//🚀 Easier to add new operations without modifying existing code.
public class CommandPatternExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 5000);

        // Create Commands
        BankCommand deposit = new DepositCommand(account, 1000);
        BankCommand withdraw = new WithdrawCommand(account, 2000);

        // Invoker (Transaction Manager)
        TransactionInvoker transactionManager = new TransactionInvoker();
        transactionManager.addTransaction(deposit);
        transactionManager.addTransaction(withdraw);

        // Execute all transactions
        System.out.println("Processing transactions...");
        transactionManager.processTransactions();
    }
}
