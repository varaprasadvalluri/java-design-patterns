package com.gang4.structuralpattren.decorator;

 // Concrete Component: Basic Bank Account
public class SavingsAccount implements BankAccount {
    @Override
    public void openAccount() {
        System.out.println("Savings Account Opened");
    }
}
