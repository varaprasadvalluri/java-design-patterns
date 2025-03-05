package com.gang4.creational.builder;

public class BankAccount {
    private final String accountHolderName;
    private final String accountNumber;
    private final String accountType;
    private final double balance;
    private final double interestRate;

    // Private constructor to enforce object creation via Builder
    private BankAccount(BankAccountBuilder builder) {
        this.accountHolderName = builder.accountHolderName;
        this.accountNumber = builder.accountNumber;
        this.accountType = builder.accountType;
        this.balance = builder.balance;
        this.interestRate = builder.interestRate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

    // Builder Class
    public static class BankAccountBuilder {
        private String accountHolderName;
        private String accountNumber;
        private String accountType;
        private double balance;
        private double interestRate;

        public BankAccountBuilder setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
            return this;
        }

        public BankAccountBuilder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public BankAccountBuilder setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public BankAccountBuilder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public BankAccountBuilder setInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
