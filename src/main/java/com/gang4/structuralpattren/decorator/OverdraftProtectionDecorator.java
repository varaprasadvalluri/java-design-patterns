package com.gang4.structuralpattren.decorator;

// Concrete Decorator: Adds Overdraft Protection feature
public class OverdraftProtectionDecorator extends AccountDecorator {
    public OverdraftProtectionDecorator(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public void openAccount() {
        decoratedAccount.openAccount();
        addOverdraftProtection();
    }

    private void addOverdraftProtection() {
        System.out.println("Overdraft Protection Enabled for Account");
    }
}