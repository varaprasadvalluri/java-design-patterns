package com.gang4.structuralpattren.decorator;

 // Concrete Decorator: Adds SMS Notification feature
public class SMSNotificationDecorator extends AccountDecorator {
    public SMSNotificationDecorator(BankAccount decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public void openAccount() {
        decoratedAccount.openAccount();
        addSMSNotification();
    }

    private void addSMSNotification() {
        System.out.println("SMS Notifications Enabled for Account");
    }
}
