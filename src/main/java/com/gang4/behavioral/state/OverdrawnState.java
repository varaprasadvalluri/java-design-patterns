package com.gang4.behavioral.state;

public class OverdrawnState implements AccountState {
    @Override
    public void deposit(BankAccount account, double amount) {
        account.balance += amount;
        System.out.println("Deposited $" + amount + ". New Balance: $" + account.balance);

        if (account.balance >= 0) {
            account.setState(new NormalState());
            System.out.println("Account is now in NORMAL state.");
        }
    }

    @Override
    public void withdraw(BankAccount account, double amount) {
        System.out.println("Withdrawal denied! Account is OVERDRAWN. Please deposit funds first.");
    }
}