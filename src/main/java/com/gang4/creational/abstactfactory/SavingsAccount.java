package com.gang4.creational.abstactfactory;

public class SavingsAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Savings Account.");
    }
}