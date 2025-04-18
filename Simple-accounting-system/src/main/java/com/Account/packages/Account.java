package com.Account.packages;

import com.Transaction.packages.Transaction;

public abstract class Account {

    //account id
    protected int id;
    //account name
    protected String fullName;
    //account balance for calculate...
    protected double balance;

    public Account(int id, String fullName, double balance) {
        this.id = id;
        this.fullName = fullName;
        this.balance = balance;
    }

    //this method update amount to increase or decrease
    public abstract void updateBalance(double amount);


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
