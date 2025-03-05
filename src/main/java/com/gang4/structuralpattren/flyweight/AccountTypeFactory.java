package com.gang4.structuralpattren.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AccountTypeFactory {
    private static final Map<String, AccountType> accountTypes = new HashMap<>();

    public static AccountType getAccountType(String type) {
        if (!accountTypes.containsKey(type)) {
            switch (type) {
                case "SAVINGS":
                    accountTypes.put(type, new SavingsAccount());
                    break;
                case "CURRENT":
                    accountTypes.put(type, new CurrentAccount());
                    break;
                default:
                    throw new IllegalArgumentException("Invalid account type");
            }
        }
        return accountTypes.get(type);
    }
}
