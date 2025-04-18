package com.Account.packages;

public class BankAccount extends Account{

    @Override
    public void updateBalance(double amount) {
        this.balance += amount;
    }
}
