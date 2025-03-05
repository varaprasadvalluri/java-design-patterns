package com.gang4.creational.sington;

public class TransactionManager {
    private static TransactionManager instance;

    // Private constructor to prevent instantiation
    private TransactionManager() {
        System.out.println("Transaction Manager Initialized.");
    }

    // Public method to provide a single instance
    public static TransactionManager getInstance() {
        if (instance == null) {
            synchronized (TransactionManager.class) { // Thread-safe
                if (instance == null) {
                    instance = new TransactionManager();
                }
            }
        }
        return instance;
    }

    // Method to process a transaction
    public void processTransaction(String accountNumber, double amount) {
        System.out.println("Processing transaction of $" + amount + " for account: " + accountNumber);
    }
}
