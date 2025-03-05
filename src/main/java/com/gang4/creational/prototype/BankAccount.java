package com.gang4.creational.prototype;

public class BankAccount implements Prototype {
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, String accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Implement clone() method
    @Override
    public Prototype clone() {
        return new BankAccount(accountHolderName, accountNumber, accountType, balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                '}';
    }

    // Setter for updating cloned object
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
