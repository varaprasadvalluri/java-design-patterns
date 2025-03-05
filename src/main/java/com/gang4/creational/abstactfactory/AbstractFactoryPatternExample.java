package com.gang4.creational.abstactfactory;
//Encapsulation – Hides complex object creation logic.
//✅ Consistency – Ensures related objects (accounts & cards) are created together.
//✅ Scalability – Easily extendable to add new bank products (like Fixed Deposit, Loan Account).
public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        // Get Savings Banking Factory
        BankingFactory savingsFactory = BankingFactoryProducer.getFactory("SAVINGS");
        BankAccount savingsAccount = savingsFactory.createBankAccount();
        CardService debitCard = savingsFactory.createCardService();

        savingsAccount.accountType();
        debitCard.cardType();

        // Get Current Banking Factory
        BankingFactory currentFactory = BankingFactoryProducer.getFactory("CURRENT");
        BankAccount currentAccount = currentFactory.createBankAccount();
        CardService creditCard = currentFactory.createCardService();

        currentAccount.accountType();
        creditCard.cardType();
    }
}
