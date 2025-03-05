package com.gang4.behavioral.visitor;

public class CurrentAccount implements BankAccount {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visit(this);
    }
}