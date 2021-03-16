package com.aremu.classes;

import com.aremu.classes.Branch;
import com.aremu.interfaces.IBank;

import java.util.ArrayList;

public class Bank implements IBank {
    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    @Override
    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            return this.branches.add(branch);
        }
        return false;
    }

    @Override
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);
            branch.newCustomer(customerName, initialTransaction);

        }
        return false;
    }

    @Override
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);
            branch.addCustomerTransaction(customerName, transaction);
            return true;
        }

        return false;
    }

    @Override
    public boolean listCustomers(String branchName, boolean printTransaction) {
        if (findBranch(branchName) != null) {
            if (printTransaction) {
                Branch branch = findBranch(branchName);
                ArrayList<Customer> allCustomers = branch.getCustomers();

                for (Customer customer : allCustomers) {
                    ArrayList<Double> allTransactions = customer.getTransactions();
                    for (double transaction : allTransactions) {
                        int count = 0;
                        count = allCustomers.indexOf(customer) + 1;
                        System.out.println("Customer Details  for Branch " + branchName);
                        System.out.println("Customer: " + (customer.getName()) + " [" + count + "] ");
                        System.out.println("Transactions");
                        System.out.println("Amount " + transaction);
                    }
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }
        return null;
    }
}
//Victor.Aremu