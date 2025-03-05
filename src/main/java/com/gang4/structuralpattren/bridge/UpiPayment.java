package com.gang4.structuralpattren.bridge;

public class UpiPayment extends Payment {
    public UpiPayment(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    void makePayment(double amount) {
        System.out.println("UPI Payment Initiated.");
        paymentProcessor.processPayment(amount);
    }
}