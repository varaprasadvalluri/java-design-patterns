package com.gang4.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class VisitorPatternExample {
    public static void main(String[] args) {
        List<BankAccount> accounts = Arrays.asList(
                new SavingsAccount(5000),
                new CurrentAccount(12000),
                new LoanAccount(25000)
        );

        AccountVisitor maintenanceChargeVisitor = new MaintenanceChargeVisitor();
        AccountVisitor rewardCalculationVisitor = new RewardCalculationVisitor();

        System.out.println("=== Applying Maintenance Charges ===");
        for (BankAccount account : accounts) {
            account.accept(maintenanceChargeVisitor);
        }

        System.out.println("\n=== Calculating Rewards ===");
        for (BankAccount account : accounts) {
            account.accept(rewardCalculationVisitor);
        }
    }
}
