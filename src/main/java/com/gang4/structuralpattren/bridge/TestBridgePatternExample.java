package com.gang4.structuralpattren.bridge;

public class TestBridgePatternExample {
    public static void main(String[] args) {
        // Using PayPal Processor with Credit Card Payment
        Payment creditCardPayment = new CreditCardPayment(new PayPalProcessor());
        creditCardPayment.makePayment(100.0);
        // Using Stripe Processor with UPI Payment
        Payment upiPayment = new UpiPayment(new StripeProcessor());
        upiPayment.makePayment(50.0);
    }
}
