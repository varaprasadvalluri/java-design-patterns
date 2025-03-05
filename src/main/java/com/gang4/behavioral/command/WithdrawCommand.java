package com.gang4.behavioral.command;

public class WithdrawCommand implements BankCommand {
    private BankAccount account;
    private double amount;

    public WithdrawCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }
}
