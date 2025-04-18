package com.Transaction.packages;

import com.Account.packages.Account;

public class IncomeTransaction extends Transaction{


    //Constructor
    public IncomeTransaction(int id, String type, double amount, Account account) {
        super(id, type, amount, account);
    }

    //Implement parent_class methods for income transaction
    @Override
    public void execute() {
        account.updateBalance(amount);
    }
}
