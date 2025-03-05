package com.gang4.behavioral.visitor;

public interface AccountVisitor {
    void visit(SavingsAccount account);
    void visit(CurrentAccount account);
    void visit(LoanAccount account);
}
