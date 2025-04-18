package com.Account.packages;

public class CashAccount extends Account {

    //Constructor
    public CashAccount(int id, String fullName, double balance) {
        super(id, fullName, balance);
    }

    @Override
    public void updateBalance(double amount) {
        this.balance += amount;
    }
}
