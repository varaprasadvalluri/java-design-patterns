package com.gang4.structuralpattren.adaptor;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void processPayment(double amount) {
        payPalAPI.makeTransaction(amount);  // Adapting the method
    }
}
