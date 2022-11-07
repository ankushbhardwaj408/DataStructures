package com.ankush;

import java.util.Date;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date datecreated=new Date();

    public Transaction(char type,double amount,double balance,String description){
        this.amount=amount;
        this.balance=balance;
        this.type=type;
        this.description=description;
        this.datecreated=new Date();
    }
}
