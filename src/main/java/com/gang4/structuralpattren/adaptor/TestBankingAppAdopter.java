package com.gang4.structuralpattren.adaptor;

public class TestBankingAppAdopter {
    public static void main(String[] args) {
        // Using PayPal via Adapter
        PayPalAPI payPalAPI = new PayPalAPI();
        PaymentProcessor paymentProcessor = new PayPalAdapter(payPalAPI);

        // Processing Payment
        paymentProcessor.processPayment(200.50);
    }
}
