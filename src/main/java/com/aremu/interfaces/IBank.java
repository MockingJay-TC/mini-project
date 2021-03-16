package com.aremu.interfaces;

public interface IBank {
    boolean addBranch(String name);

    boolean addCustomer(String branchName, String customerName, double initialTransaction);

    boolean addCustomerTransaction(String branchName, String customerName, double transaction);

    boolean listCustomers(String branchName);
}
