package com.aremu.classes;

import com.aremu.interfaces.ICustomer;

import java.util.ArrayList;

//The class customer implements ICustomer
public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;


    public Customer(String name, double initialTransaction) {
//        condition statement to check if transaction is greater than 0
        initialTransaction = initialTransaction < 0 ? 0 : initialTransaction;
        this.name = name;
    //    instantiate the transactions arrayList
        this.transactions = new ArrayList<>();
//        adds initialTransaction into the list transactions
        this.transactions.add(initialTransaction);
    }

    @Override
    public String getName() {
        return this.name;
    }

//    getTransactions method,
    @Override
//    Return all the list of transactions
    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }
//the addTransactions method
    @Override
    public void addTransactions(double transaction) {
//        check is transaction is more than 0 before adding it to the list of transactions
        if (transaction > 0) {
            transactions.add(transaction);
        }
    }
}
//Victor.Aremu