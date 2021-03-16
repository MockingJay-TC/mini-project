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
        return this.name;
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    @Override
    public boolean newCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialTransaction);
            customers.add(customer);
            return true;
        }
        return false;
    }

    @Override
    public boolean addCustomerTransaction(String customerName, double transaction) {
            if(findCustomer(customerName) != null ){
                Customer customer = new Customer();
                customer.getTransactions();
                return true;
            }


        return false;
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer: customers){
            if (customer.getName().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        return null;
    }
}
//Victor.Aremu