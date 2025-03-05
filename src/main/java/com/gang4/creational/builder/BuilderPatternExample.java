package com.gang4.creational.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        // Create a Savings Account using Builder
        BankAccount savingsAccount = new BankAccount.BankAccountBuilder()
                .setAccountHolderName("test user")
                .setAccountNumber("1234567890")
                .setAccountType("SAVINGS")
                .setBalance(5000.0)
                .setInterestRate(3.5)
                .build();

        System.out.println(savingsAccount);

        // Create a Current Account using Builder
        BankAccount currentAccount = new BankAccount.BankAccountBuilder()
                .setAccountHolderName("varaprasad ")
                .setAccountNumber("999999999999")
                .setAccountType("CURRENT")
                .setBalance(20000.0)
                .build();

        System.out.println(currentAccount);
    }
}

