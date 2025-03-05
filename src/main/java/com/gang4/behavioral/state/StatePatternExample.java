package com.gang4.behavioral.state;
//The State Pattern is a behavioral design pattern that allows an object to change its
// behavior when its internal state changes. It helps in avoiding long if-else or
// switch statements by encapsulating state-specific behavior in separate classes.
public class StatePatternExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(200);  // Normal State
        account.withdraw(800); // Goes into Overdrawn State
        account.withdraw(100); // Denied because account is Overdrawn
        account.deposit(500);  // Back to Normal State
        account.closeAccount(); // Moves to Closed State
        account.deposit(100);  // Denied because account is Closed
    }
}
