package com.gang4.creational.abstactfactory;

public class SavingsBankingFactory implements BankingFactory {
    @Override
    public BankAccount createBankAccount() {
        return new SavingsAccount();
    }

    @Override
    public CardService createCardService() {
        return new DebitCard();
    }
}
