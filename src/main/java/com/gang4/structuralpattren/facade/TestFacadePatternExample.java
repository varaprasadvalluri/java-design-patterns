package com.gang4.structuralpattren.facade;
//✅ Hides complexity by exposing a simplified interface
public class TestFacadePatternExample {
    public static void main(String[] args) {
        // Using the Facade
        BankingFacade bankingFacade = new BankingFacade();
        // Performing a money transfer
        bankingFacade.transferMoney("12345", "67890", 500.00);
    }
}
