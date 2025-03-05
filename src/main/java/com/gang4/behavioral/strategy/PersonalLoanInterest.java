package com.gang4.behavioral.strategy;

public class PersonalLoanInterest implements InterestStrategy {
    @Override
    public double calculateInterest(double principal, int years) {
        double rate = 10.5; // 10.5% annual interest
        return (principal * rate * years) / 100;
    }
}