package com.gang4.creational.sington;

public class SingletonBankingExample {
    public static void main(String[] args) {
        // Get the single instance of Transaction Manager
        TransactionManager txnManager1 = TransactionManager.getInstance();
        txnManager1.processTransaction("ACC12345", 500);

        // Get another instance (It will return the same instance)
        TransactionManager txnManager2 = TransactionManager.getInstance();
        txnManager2.processTransaction("ACC67890", 1000);

        // Verify both instances are the same
        System.out.println("Are both transaction managers the same? " + (txnManager1 == txnManager2));
    }
}
