package com.gang4.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class TransactionInvoker {
    private List<BankCommand> transactionQueue = new ArrayList<>();

    public void addTransaction(BankCommand command) {
        transactionQueue.add(command);
    }

    public void processTransactions() {
        for (BankCommand command : transactionQueue) {
            command.execute();
        }
        transactionQueue.clear();
    }
}
