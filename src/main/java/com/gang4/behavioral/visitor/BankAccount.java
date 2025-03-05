package com.gang4.behavioral.visitor;

public interface BankAccount {
    void accept(AccountVisitor visitor);
}
