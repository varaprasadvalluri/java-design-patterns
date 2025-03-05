package com.gang4.behavioral.state;

public interface AccountState {
    void deposit(BankAccount account, double amount);
    void withdraw(BankAccount account, double amount);
}
