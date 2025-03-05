package com.gang4.creational.factory;

public class LoanAccount implements BankAccount {
    @Override
    public void accountType() {
        System.out.println("This is a Loan Account.");
    }
}