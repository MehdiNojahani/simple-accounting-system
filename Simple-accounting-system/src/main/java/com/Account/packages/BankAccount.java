package com.Account.packages;

public class BankAccount extends Account{


    //Constructor
    public BankAccount(int id, String fullName, double balance){
        super(id, fullName, balance);
    }


    @Override
    public void updateBalance(double amount) {
        this.balance += amount;
    }

}
