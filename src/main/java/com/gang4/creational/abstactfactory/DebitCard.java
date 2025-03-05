package com.gang4.creational.abstactfactory;

public class DebitCard implements CardService {
    @Override
    public void cardType() {
        System.out.println("This is a Debit Card.");
    }
}