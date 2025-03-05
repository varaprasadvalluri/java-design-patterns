package com.gang4.behavioral.observer;

public class StockMarketTracker implements Observer {
    @Override
    public void update(String message) {
        System.out.println("[Stock Market Tracker] " + message);
    }
}