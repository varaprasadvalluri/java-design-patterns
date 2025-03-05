package com.gang4.behavioral.strategy;

public class CarLoanInterest implements InterestStrategy {
    @Override
    public double calculateInterest(double principal, int years) {
        double rate = 7.5; // 7.5% annual interest
        return (principal * rate * years) / 100;
    }
}
