package com.gang4.creational.factory;

public class BankAccountFactory {
    public static BankAccount createAccount(String type) {
        if (type.equalsIgnoreCase("SAVINGS")) {
            return new SavingsAccount();
        } else if (type.equalsIgnoreCase("CURRENT")) {
            return new CurrentAccount();
        } else if (type.equalsIgnoreCase("LOAN")) {
            return new LoanAccount();
        } else {
            throw new IllegalArgumentException("Invalid account type");
        }
    }
}
