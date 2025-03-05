package com.gang4.structuralpattren.decorator;

// Decorator: Base class for additional features
public abstract class AccountDecorator implements BankAccount {
    protected BankAccount decoratedAccount;

    public AccountDecorator(BankAccount decoratedAccount) {
        this.decoratedAccount = decoratedAccount;
    }

    @Override
    public void openAccount() {
        decoratedAccount.openAccount();
    }
}