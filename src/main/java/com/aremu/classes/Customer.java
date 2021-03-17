package com.aremu.classes;

import com.aremu.interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;


    public Customer(String name, double initialTransaction) {
        initialTransaction = initialTransaction < 0 ? 0 : initialTransaction;
        this.name = name;
//        instantiate the transactions arrayList
        this.transactions = new ArrayList<>();
        this.transactions.add(initialTransaction);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    @Override
    public void addTransactions(double transaction) {
        if (transaction > 0) {
            transactions.add(transaction);
        }
    }
}
//Victor.Aremu