package com.gang4.structuralpattren.composite;

public class CurrentAccount implements Account {
    private final String accountNumber;
    private final double balance;

    public CurrentAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void showAccountDetails() {
        System.out.println("Current Account: " + accountNumber + " | Balance: $" + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }
}