package com;

import com.Account.packages.Account;
import com.Transaction.packages.ExpenseTransaction;
import com.Transaction.packages.IncomeTransaction;
import com.Transaction.packages.Transaction;


public class TransactionFactory {

    public static Transaction createTransactionFactory(int id, String type, double amount, Account account){

        if (type.trim().toLowerCase().equals("Income"))
            return new IncomeTransaction();
        else if (type.trim().toLowerCase().equals("Expense"))
            return new ExpenseTransaction();
        else
            return null;
    }
}
