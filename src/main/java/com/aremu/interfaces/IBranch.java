package com.aremu.interfaces;

import com.aremu.classes.Customer;

import java.util.ArrayList;

public interface IBranch {

    String getName();

    ArrayList<Customer> getCustomers();

    boolean newCustomer(String customerName, double initialTransaction);

    boolean addCustomerTransaction(String customerName, double transaction);

    void findCustomer(String customerName);
}
