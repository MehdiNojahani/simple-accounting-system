package com.Account.packages;

public class CashAccount extends Account {
    @Override
    public void updateBalance(double amount) {
        this.balance += amount;
    }
}
