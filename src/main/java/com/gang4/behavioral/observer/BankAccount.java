package com.gang4.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private String accountHolder;
        private double balance;

    public BankAccount(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        @Override
        public void addObserver(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void removeObserver(Observer observer) {
            observers.remove(observer);
            notifyObservers("removed observred ");
        }

        @Override
        public void notifyObservers(String message) {
            for (Observer observer : observers) {
                observer.update(message);
            }
        }

        public void deposit(double amount) {
            balance += amount;
            notifyObservers("Deposit of $" + amount + " made. New Balance: $" + balance);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                notifyObservers("Withdrawal of $" + amount + " made. New Balance: $" + balance);
            } else {
                notifyObservers("Insufficient balance for withdrawal of $" + amount);
            }
        }

        public double getBalance() {
            return balance;
        }
}
