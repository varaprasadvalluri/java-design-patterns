package com.gang4.structuralpattren.flyweight;

public class SavingsAccount implements AccountType {
    private final double interestRate = 4.5;

    @Override
    public void showAccountDetails() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}
