package com.gang4.behavioral.strategy;
//✅ When you have multiple ways to perform a task (loan interest calculation, payment processing, fraud detection, etc.).
//✅ When you want to avoid if-else or switch-case statements for selecting an algorithm.
//✅ When you need to dynamically change behaviors without modifying existing code.
//🚀 Encapsulation of Algorithms – Interest calculation logic is separated from the main processing logic.
//🚀 Open-Closed Principle – New loan types can be added without modifying existing code.
//🚀 Runtime Behavior Change – The loan type can be dynamically selected at runtime.

public class StrategyPatternExample {
    public static void main(String[] args) {
        LoanCalculator loanCalculator = new LoanCalculator();

        // Home Loan Interest Calculation
        loanCalculator.setInterestStrategy(new HomeLoanInterest());
        System.out.println("Home Loan Interest: $" + loanCalculator.calculateInterest(100000, 10));

        // Car Loan Interest Calculation
        loanCalculator.setInterestStrategy(new CarLoanInterest());
        System.out.println("Car Loan Interest: $" + loanCalculator.calculateInterest(50000, 5));

        // Personal Loan Interest Calculation
        loanCalculator.setInterestStrategy(new PersonalLoanInterest());
        System.out.println("Personal Loan Interest: $" + loanCalculator.calculateInterest(20000, 3));
    }
}
