package com.gang4.structuralpattren.bridge;

public abstract class Payment {
    protected PaymentProcessor paymentProcessor;

    public Payment(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    abstract void makePayment(double amount);
}

