package com.gang4.behavioral.state;

public class NormalState implements AccountState {
    @Override
    public void deposit(BankAccount account, double amount) {
        account.balance += amount;
        System.out.println("Deposited $" + amount + ". New Balance: $" + account.balance);
    }

    @Override
    public void withdraw(BankAccount account, double amount) {
        if (account.balance >= amount) {
            account.balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New Balance: $" + account.balance);

            if (account.balance < 0) {
                account.setState(new OverdrawnState());
                System.out.println("Account is now OVERDRAWN!");
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}