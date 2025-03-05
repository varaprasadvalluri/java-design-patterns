package com.gang4.behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory implements TransactionCollection {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public TransactionIterator createIterator() {
        return new TransactionListIterator(transactions);
    }
}