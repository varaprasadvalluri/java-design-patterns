package com.gang4.structuralpattren.bridge;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Credit Card Payment Initiated.");
        paymentProcessor.processPayment(amount);
    }
}

