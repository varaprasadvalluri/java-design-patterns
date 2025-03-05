package com.gang4.behavioral.strategy;

public class LoanCalculator {
    private InterestStrategy interestStrategy;

    public void setInterestStrategy(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public double calculateInterest(double principal, int years) {
        if (interestStrategy == null) {
            throw new IllegalStateException("Interest strategy is not set.");
        }
        return interestStrategy.calculateInterest(principal, years);
    }
}
