package com.gang4.behavioral.state;

public class BankAccount {
    private AccountState state;
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.state = new NormalState();
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        state.deposit(this, amount);
    }

    public void withdraw(double amount) {
        state.withdraw(this, amount);
    }

    public void closeAccount() {
        state = new ClosedState();
        System.out.println("Account is now CLOSED!");
    }

    public double getBalance() {
        return balance;
    }
}
