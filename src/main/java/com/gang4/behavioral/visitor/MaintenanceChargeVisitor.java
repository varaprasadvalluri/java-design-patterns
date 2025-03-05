package com.gang4.behavioral.visitor;

public class MaintenanceChargeVisitor implements AccountVisitor {
    @Override
    public void visit(SavingsAccount account) {
        System.out.println("Applying maintenance charge of $5 for Savings Account.");
    }

    @Override
    public void visit(CurrentAccount account) {
        System.out.println("Applying maintenance charge of $10 for Current Account.");
    }

    @Override
    public void visit(LoanAccount account) {
        System.out.println("No maintenance charge for Loan Account.");
    }
}