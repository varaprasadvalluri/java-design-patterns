package com.gang4.creational.abstactfactory;

public interface BankingFactory {
    BankAccount createBankAccount();
    CardService createCardService();
}
