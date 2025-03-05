package com.gang4.behavioral.state;

public class ClosedState implements AccountState {
    @Override
    public void deposit(BankAccount account, double amount) {
        System.out.println("Deposit failed! Account is CLOSED.");
    }

    @Override
    public void withdraw(BankAccount account, double amount) {
        System.out.println("Withdrawal failed! Account is CLOSED.");
    }
}