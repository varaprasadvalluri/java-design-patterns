package com.gang4.structuralpattren.composite;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Account {
    private final String customerName;
    private final List<Account> accounts = new ArrayList<>();

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public void showAccountDetails() {
        System.out.println("Customer: " + customerName);
        for (Account acc : accounts) {
            acc.showAccountDetails();
        }
    }

    @Override
    public double getBalance() {
        double totalBalance = 0;
        for (Account acc : accounts) {
            totalBalance += acc.getBalance();
        }
        return totalBalance;
    }
}