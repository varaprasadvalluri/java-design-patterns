package com.gang4.behavioral.template;

public class NEFTTransfer extends FundTransfer {
    @Override
    protected void authenticateUser() {
        System.out.println("Authenticating user via OTP for NEFT.");
    }

    @Override
    protected void executeTransfer(double amount) {
        System.out.println("Executing NEFT transfer of $" + amount);
    }
}