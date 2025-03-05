package com.gang4.structuralpattren.proxy;

public class RealBankAccount implements BankAccount {
    private String accountNumber;
    private double balance;

    public RealBankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
