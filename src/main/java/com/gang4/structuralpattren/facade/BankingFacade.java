package com.gang4.structuralpattren.facade;

public class BankingFacade {
    private final AccountService accountService;
    private final FundTransferService fundTransferService;
    private final NotificationService notificationService;

    public BankingFacade() {
        this.accountService = new AccountService();
        this.fundTransferService = new FundTransferService();
        this.notificationService = new NotificationService();
    }

    public void transferMoney(String fromAccount, String toAccount, double amount) {
        if (accountService.isAccountActive(fromAccount) && accountService.isAccountActive(toAccount)) {
            fundTransferService.transfer(fromAccount, toAccount, amount);
            notificationService.sendNotification(fromAccount, "Debited $" + amount);
            notificationService.sendNotification(toAccount, "Credited $" + amount);
        } else {
            System.out.println("One or both accounts are inactive. Transfer failed.");
        }
    }
}
