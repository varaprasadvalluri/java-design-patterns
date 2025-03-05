package com.gang4.behavioral.template;

public class IMPSTransfer extends FundTransfer {
    @Override
    protected void authenticateUser() {
        System.out.println("Authenticating user via mobile PIN for IMPS.");
    }

    @Override
    protected void executeTransfer(double amount) {
        System.out.println("Executing IMPS transfer of $" + amount);
    }
}
