package com.Transaction.packages;

import java.time.LocalDate;

public abstract class Transaction {

    int id;
    String type;
    double amount;
    LocalDate date;
    Account account;

    public abstract void execute();
}
