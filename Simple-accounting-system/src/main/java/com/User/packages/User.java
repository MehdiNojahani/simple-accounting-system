package com.User.packages;

/*
This class
 */

import com.Account.packages.Account;
import com.Transaction.packages.Transaction;
import com.TransactionFactory;

public class User {


    //two attribute for users :
    //id and full name user
    private int id;
    private String fullName;

    //create  TransactionFactory class object
    private TransactionFactory factory = new TransactionFactory();

    //this method oop logic support and transactionFactory method class same and reference to method
    public Transaction createTransactionFactory(int id, String type, double amount, Account account){

        return factory.createTransactionFactory(id, type, amount, account);
    }


    //class constructor :
    public User() {
    }
    public User(int id, String fullName) {
        setId(id);
        setFullName(fullName);
    }


    // Getter and Setter Method instance variable :
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



}
