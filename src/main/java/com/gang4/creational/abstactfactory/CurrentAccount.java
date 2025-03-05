package com.gang4.creational.abstactfactory;

public class CurrentAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Current Account.");
    }
}