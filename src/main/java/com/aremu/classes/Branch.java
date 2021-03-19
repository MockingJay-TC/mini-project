package com.aremu.classes;

import com.aremu.interfaces.IBranch;

import java.util.ArrayList;

//Branch class that implements the Interface IBranch
public class Branch implements IBranch {
    private String name;
    private ArrayList<Customer> customers;

//a constructor of the Branch class
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();

    }
// This return the name of the branch
    @Override
    public String getName() {
        return this.name;
    }

//    returns a list of customers
    @Override
    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

//    this method adds a new customer with the provided parameters
    @Override
    public boolean newCustomer(String customerName, double initialTransaction) {
//        condition statement that checks if customer is not null and if initialTransaction is more than 0;
        if (findCustomer(customerName) == null && !customerName.equals("") && initialTransaction > 0) {
            Customer customer = new Customer(customerName, initialTransaction);
//            add customer to the list of customers
            customers.add(customer);
            return true;
        }
        return false;
    }

//addCustomerTransaction method takes 2 parameters, customerName and transaction
    @Override
    public boolean addCustomerTransaction(String customerName, double transaction) {
        if (findCustomer(customerName) != null) {
            Customer customer = findCustomer(customerName);
            customer.addTransactions(transaction);
            return true;
        }


        return false;
    }
//this method  find a customer with the provided parameter, which is the customerName
    private Customer findCustomer(String customerName) {
//        a loop to check through the customers list whether the provided customer is present
        for (Customer customer : customers) {
//            condition that returns the customer when found
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
//Victor.Aremu