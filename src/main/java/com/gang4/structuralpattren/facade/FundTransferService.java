package com.gang4.structuralpattren.facade;

public class FundTransferService {
    public void transfer(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferring $" + amount + " from " + fromAccount + " to " + toAccount);
    }
}
