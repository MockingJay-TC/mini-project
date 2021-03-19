//The name of my package
package com.aremu.classes;
//List of imports used in my Bank Class

import com.aremu.interfaces.IBank;

import java.util.ArrayList;

//Creating my Bank class which implements IBank
public class Bank implements IBank {
    //    Declaring the fields of the class wth private Access modifiers
//    Declaring name as type String
    private String name;
    //    Declaring branches as type Branch which is an ArrayList
    private ArrayList<Branch> branches;

    //Creating a Constructor of the Class i'm in
    public Bank(String name) {
//        this keyword, referring to the fields in the class
        this.name = name;
        this.branches = new ArrayList<>();
    }

    //Overriding this method from the IBank interface
    @Override
//    The method addBranch(), takes name of branch to add, it first check if it's in the list of branches, if it's not, it add, else returns false
    public boolean addBranch(String branchName) {
//        Condition to check if branch exists and branch not equal to an empty string
        if (findBranch(branchName) == null && !branchName.equals("")) {
            Branch branch = new Branch(branchName);
            return this.branches.add(branch);
        }
        return false;
    }

    //Overriding this method from the IBank interface
    @Override
//    The addCustomer(), takes 3 parameters,
//    branchName = the branch to add a customer
//    customerName, initialTransaction = the name of customer and initial Deposit
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
//        this condition check is the branch exits before adding a customer to the branch
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);
            return branch.newCustomer(customerName, initialTransaction);

        } else {
            return false;
        }
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
            Branch branch = findBranch(branchName);
            ArrayList<Customer> allCustomers = branch.getCustomers();
            System.out.println("Customer Details  for Branch " + branchName);
            if (printTransaction) {
                for (Customer customer : allCustomers) {
                    ArrayList<Double> allTransactions = customer.getTransactions();
                    int count = 0;
                    count = allCustomers.indexOf(customer) + 1;
                    System.out.println("Customer: " + (customer.getName()) + "[" + count + "] ");
                    System.out.println("Transactions");
                    for (double transaction : allTransactions) {
                        int loop = 0;
                        loop = allTransactions.indexOf(transaction) + 1;
                        System.out.println(" [" + loop + "] Amount " + transaction);
                    }
                }
            } else {
                for (Customer customer : allCustomers) {
                    int count = 0;
                    count = allCustomers.indexOf(customer) + 1;
                    System.out.println("Customer: " + (customer.getName()) + "[" + count + "] ");

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