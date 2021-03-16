package com.aremu.classes;


import com.aremu.interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;


    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ArrayList<Double> getTransactions() {
        return null;
    }

    @Override
    public void addTransactions(double Transaction) {

    }
}
