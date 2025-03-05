package com.gang4.behavioral.Iterator;

import java.util.List;

public class TransactionListIterator implements TransactionIterator {
    private List<Transaction> transactions;
    private int position = 0;

    public TransactionListIterator(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean hasNext() {
        return position < transactions.size();
    }

    @Override
    public Transaction next() {
        return transactions.get(position++);
    }
}