package com.aremu.classes;

import com.aremu.classes.Customer;
import com.aremu.interfaces.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {
    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        return null;
    }

    @Override
    public boolean newCustomer(String customerName, double initialTransaction) {
        return false;
    }

    @Override
    public boolean addCustomerTransaction(String customerName, double transaction) {
        return false;
    }

    @Override
    public void findCustomer(String customerName) {

    }
}
//Victor.Aremu