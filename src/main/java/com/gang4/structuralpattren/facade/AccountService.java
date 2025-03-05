package com.gang4.structuralpattren.facade;

public class AccountService {
    public boolean isAccountActive(String accountNumber) {
        System.out.println("Checking if account " + accountNumber + " is active...");
        return true; // Assume it's always active for simplicity
    }
}
