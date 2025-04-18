package com.Transaction.packages;

import com.Account.packages.Account;

import java.time.LocalDate;

public class ExpenseTransaction extends Transaction{


    //Constructor
    public ExpenseTransaction(int id, String type, double amount, Account account) {
        super(id, type, amount, account);
    }

    //Implement parent_class methods for expense transaction
    @Override
    public void execute() {
        account.updateBalance(-amount);
    }
}
