package com.Report.packages;

import com.Account.packages.Account;
import com.Transaction.packages.Transaction;

import java.util.List;


// this class for report transaction and account summary and display :
public class ReportGenerator {


    //report transaction list method:
    public static void generateTransactionReport(List<Transaction> transactions){

        System.out.println("-- $$  Transaction Report $$ -- :");

        for (Transaction t:transactions) {
            System.out.println("id : " + t.getId());
            System.out.println("type : " + t.getType());
            System.out.println("account : " + t.getAccount().getFullName());
            System.out.println("amount : " + t.getAmount());
            System.out.println("date : " + t.getDate());
            System.out.println("------------------------------------------------------------");
        }
    }

    //Account Summary method
    public static void generateAccountSummary(Account account){
        System.out.println("-- $$ Account Summary  $$ -- :");

        System.out.println("Account id :" + account.getId());
        System.out.println("Account Name :" + account.getFullName());
        System.out.println("Account  :" + account.getId());
        System.out.println("Account id :" + account.getBalance());

        System.out.println("------------------------------------------------------------");
    }
}
