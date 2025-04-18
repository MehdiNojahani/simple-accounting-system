package com;

import com.Account.packages.Account;
import com.Transaction.packages.ExpenseTransaction;
import com.Transaction.packages.IncomeTransaction;
import com.Transaction.packages.Transaction;


public class TransactionFactory {

    public Transaction createTransactionFactory(int id, String type, double amount, Account account){

        if (type.equals("Income"))
            return new IncomeTransaction(id, type, amount, account);
        else if (type.equals("Expense"))
            return new ExpenseTransaction(id, type, amount, account);
        else
            return null;
    }
}
