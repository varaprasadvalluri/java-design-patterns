package com.gang4.structuralpattren.composite;

public class SavingsAccount implements Account {
    private final String accountNumber;
    private final double balance;

    public SavingsAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void showAccountDetails() {
        System.out.println("Savings Account: " + accountNumber + " | Balance: $" + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
