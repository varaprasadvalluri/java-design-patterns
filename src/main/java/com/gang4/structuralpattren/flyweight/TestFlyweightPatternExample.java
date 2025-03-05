package com.gang4.structuralpattren.flyweight;
//Savings and Current Account Types are shared (instead of creating duplicate objects).
// 🚀 Only account number and balance are unique (extrinsic state).
// 🚀 Reduces memory footprint when handling millions of accounts.
public class TestFlyweightPatternExample {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("12345", 5000.00, "SAVINGS");
        BankAccount acc2 = new BankAccount("67890", 7000.00, "SAVINGS");
        BankAccount acc3 = new BankAccount("54321", 3000.00, "CURRENT");

        acc1.showAccountInfo();
        acc2.showAccountInfo();
        acc3.showAccountInfo();
    }
}
