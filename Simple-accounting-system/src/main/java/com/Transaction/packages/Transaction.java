package com.Transaction.packages;

import com.Account.packages.Account;

import java.time.LocalDate;

public abstract class Transaction {

    //transaction id
    protected int id;
    //type of transaction(expense or income)
    protected String type;
    //Add or subtract amount from account
    protected double amount;
    //date of transaction
    protected LocalDate date;
    //Account of transaction
    protected Account account;


    //Constructor


    public Transaction(int id, String type, double amount, LocalDate date, Account account) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public Transaction() {
    }

    //Getter and Setter method


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //this method transaction(expense or income) implement by sub_classes
    public abstract void execute();


}
