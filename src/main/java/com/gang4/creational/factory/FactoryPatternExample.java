package com.gang4.creational.factory;

public class FactoryPatternExample {
    public static void main(String[] args) {
        // Creating different bank accounts using Factory
        BankAccount savings = BankAccountFactory.createAccount("SAVINGS");
        savings.accountType();

        BankAccount current = BankAccountFactory.createAccount("CURRENT");
        current.accountType();

        BankAccount loan = BankAccountFactory.createAccount("LOAN");
        loan.accountType();
    }
}
