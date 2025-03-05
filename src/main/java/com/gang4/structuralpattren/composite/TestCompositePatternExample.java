package com.gang4.structuralpattren.composite;

public class TestCompositePatternExample {
    public static void main(String[] args) {
        // Create individual bank accounts
        Account savings = new SavingsAccount("SAV-12345", 5000.00);
        Account checking = new CurrentAccount("CHK-67890", 2500.00);
        // Create a customer and add accounts
        Customer customer = new Customer("John Doe");
        customer.addAccount(savings);
        customer.addAccount(checking);
        // Display customer details
        customer.showAccountDetails();
        System.out.println("Total Balance: $" + customer.getBalance());
    }
}
