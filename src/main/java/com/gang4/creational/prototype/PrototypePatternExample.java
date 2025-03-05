package com.gang4.creational.prototype;

public class PrototypePatternExample {
    public static void main(String[] args) {
        // Create an original account
        BankAccount originalAccount = new BankAccount("Test user", "1234567890", "SAVINGS", 5000.0);
        System.out.println("Original Account: " + originalAccount);

        // Clone the account and modify details
        BankAccount clonedAccount = (BankAccount) originalAccount.clone();
        clonedAccount.setAccountNumber("9876543210");

        System.out.println("Cloned Account: " + clonedAccount);
    }
}

