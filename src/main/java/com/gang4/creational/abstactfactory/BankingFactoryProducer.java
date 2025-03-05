package com.gang4.creational.abstactfactory;

public class BankingFactoryProducer {
    public static BankingFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SAVINGS")) {
            return new SavingsBankingFactory();
        } else if (choice.equalsIgnoreCase("CURRENT")) {
            return new CurrentBankingFactory();
        } else {
            throw new IllegalArgumentException("Invalid Factory Type");
        }
    }
}
