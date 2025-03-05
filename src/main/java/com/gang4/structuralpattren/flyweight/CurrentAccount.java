package com.gang4.structuralpattren.flyweight;

public class CurrentAccount implements AccountType {
    private final double overdraftLimit = 1000;

    @Override
    public void showAccountDetails() {
        System.out.println("Current Account | Overdraft Limit: $" + overdraftLimit);
    }
}