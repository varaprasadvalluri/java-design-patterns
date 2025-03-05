package com.gang4.behavioral.chainofresponsibility;
//Decouples validation & approval logic from transaction processing.
//🚀 Flexible – Can add/remove handlers dynamically without modifying existing code.
//🚀 Scalable – Easily extends to include more approval levels (e.g., CEO approval for $50,000+).
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Create Handlers
        TransactionHandler basicCheck = new BasicCheckHandler();
        TransactionHandler managerApproval = new ManagerApprovalHandler();
        TransactionHandler directorApproval = new DirectorApprovalHandler();

        // Set up the chain
        basicCheck.setNextHandler(managerApproval);
        managerApproval.setNextHandler(directorApproval);

        // Test transactions
        System.out.println("Transaction 1: $1,000");
        basicCheck.handleTransaction(1000);

        System.out.println("\nTransaction 2: $7,000");
        basicCheck.handleTransaction(7000);

        System.out.println("\nTransaction 3: $15,000");
        basicCheck.handleTransaction(15000);
    }
}
