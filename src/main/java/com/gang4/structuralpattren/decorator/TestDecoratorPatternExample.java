package com.gang4.structuralpattren.decorator;
//✅ Dynamically adds new features without modifying existing code
//✅ Follows Open-Closed Principle (OCP)
public class TestDecoratorPatternExample {
    public static void main(String[] args) {
        // Create a simple savings account
        BankAccount basicAccount = new SavingsAccount();

        System.out.println("=== Basic Account ===");
        basicAccount.openAccount();

        System.out.println("\n=== Account with SMS Notifications ===");
        BankAccount smsAccount = new SMSNotificationDecorator(new SavingsAccount());
        smsAccount.openAccount();

        System.out.println("\n=== Account with SMS Notifications and Overdraft Protection ===");
        BankAccount fullFeatureAccount = new OverdraftProtectionDecorator(new SMSNotificationDecorator(new SavingsAccount()));
        fullFeatureAccount.openAccount();
    }
}
