package com.gang4.behavioral.visitor;

public class RewardCalculationVisitor implements AccountVisitor {
    @Override
    public void visit(SavingsAccount account) {
        System.out.println("Adding 2% reward for Savings Account with balance: $" + account.getBalance());
    }

    @Override
    public void visit(CurrentAccount account) {
        System.out.println("Adding 1% reward for Current Account with balance: $" + account.getBalance());
    }

    @Override
    public void visit(LoanAccount account) {
        System.out.println("No rewards for Loan Account with outstanding loan: $" + account.getLoanAmount());
    }
}
