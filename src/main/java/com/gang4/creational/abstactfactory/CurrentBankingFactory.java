package com.gang4.creational.abstactfactory;

public class CurrentBankingFactory implements BankingFactory {
    @Override
    public BankAccount createBankAccount() {
        return new CurrentAccount();
    }

    @Override
    public CardService createCardService() {
        return new CreditCard();
    }
}