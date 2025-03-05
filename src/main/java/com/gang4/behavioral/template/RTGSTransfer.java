package com.gang4.behavioral.template;

public class RTGSTransfer extends FundTransfer {
    @Override
    protected void authenticateUser() {
        System.out.println("Authenticating user via biometric for RTGS.");
    }

    @Override
    protected void executeTransfer(double amount) {
        System.out.println("Executing RTGS transfer of $" + amount);
    }
}