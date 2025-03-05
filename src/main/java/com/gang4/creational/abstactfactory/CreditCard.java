package com.gang4.creational.abstactfactory;

public class CreditCard implements CardService {
    @Override
    public void cardType() {
        System.out.println("This is a Credit Card.");
    }
}