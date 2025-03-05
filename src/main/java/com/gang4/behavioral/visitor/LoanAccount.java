package com.gang4.behavioral.visitor;

public class LoanAccount implements BankAccount {
    private double loanAmount;

    public LoanAccount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    @Override
    public void accept(AccountVisitor visitor) {
        visitor.visit(this);
    }
}