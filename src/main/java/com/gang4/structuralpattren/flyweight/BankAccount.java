package com.gang4.structuralpattren.flyweight;

public class BankAccount {
    private final String accountNumber;
    private final double balance;
    private final AccountType accountType; // Shared Flyweight object

    public BankAccount(String accountNumber, double balance, String type) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = AccountTypeFactory.getAccountType(type);
    }

    public void showAccountInfo() {
        System.out.println("Account Number: " + accountNumber + " | Balance: $" + balance);
        accountType.showAccountDetails();
    }
}
