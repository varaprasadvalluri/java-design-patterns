package com.gang4.behavioral.strategy;

public class HomeLoanInterest implements InterestStrategy {
    @Override
    public double calculateInterest(double principal, int years) {
        double rate = 6.5; // 6.5% annual interest
        return (principal * rate * years) / 100;
    }
}
