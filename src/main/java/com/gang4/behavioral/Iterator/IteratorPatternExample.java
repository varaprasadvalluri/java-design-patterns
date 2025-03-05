package com.gang4.behavioral.Iterator;
//🚀 Encapsulates collection traversal – Hides internal implementation of the transaction list.
//🚀 Supports different iteration strategies – Can implement reverse iteration, filtering, etc. easily.
//🚀 Decouples collection from iteration logic – We can change how transactions are stored without affecting how they are accessed.
//🚀 Simplifies complex data structures – Works well for linked lists, trees, and graphs.
public class IteratorPatternExample {
    public static void main(String[] args) {
        // Create Transaction History
        TransactionHistory history = new TransactionHistory();

        // Add Transactions
        history.addTransaction(new Transaction("TXN001", "DEPOSIT", 5000));
        history.addTransaction(new Transaction("TXN002", "WITHDRAWAL", 2000));
        history.addTransaction(new Transaction("TXN003", "TRANSFER", 1000));

        // Get Iterator
        TransactionIterator iterator = history.createIterator();

        // Iterate Over Transactions
        System.out.println("Bank Transactions:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
