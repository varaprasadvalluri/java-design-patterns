package com.gang4.structuralpattren.proxy;

public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String accountNumber;
    private double balance;
    private boolean isAuthorized; // Security check

    public BankAccountProxy(String accountNumber, double balance, boolean isAuthorized) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isAuthorized = isAuthorized;
    }

    @Override
    public void withdraw(double amount) {
        if (!isAuthorized) {
            System.out.println("Access Denied: Unauthorized Transaction!");
            return;
        }

        if (realBankAccount == null) {
            realBankAccount = new RealBankAccount(accountNumber, balance);
        }

        System.out.println("Logging: Attempting to withdraw $" + amount);
        realBankAccount.withdraw(amount);
    }
}