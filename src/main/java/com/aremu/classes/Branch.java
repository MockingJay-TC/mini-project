package com.aremu.classes;

import com.aremu.classes.Customer;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        return false;
    }
    public void findCustomer(String customerName){

    }
}


//Victor.Aremu