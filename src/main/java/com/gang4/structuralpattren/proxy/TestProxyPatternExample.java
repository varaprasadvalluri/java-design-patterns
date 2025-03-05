package com.gang4.structuralpattren.proxy;
//Adds Security Checks (Only authorized users can withdraw).
//🚀 Lazy Initialization (RealBankAccount is created only when needed).
//🚀 Logging (Tracks withdrawal attempts).
//🚀 Encapsulates Access Control (Restricts unauthorized transactions).
public class TestProxyPatternExample {
    public static void main(String[] args) {
        // Unauthorized access attempt
        BankAccount unauthorizedAccount = new BankAccountProxy("12345", 1000.00, false);
        unauthorizedAccount.withdraw(100); // Should deny access

        System.out.println("\n--- Authorized Access ---");

        // Authorized access
        BankAccount authorizedAccount = new BankAccountProxy("12345", 1000.00, true);
        authorizedAccount.withdraw(200); // Should allow withdrawal
    }
}
