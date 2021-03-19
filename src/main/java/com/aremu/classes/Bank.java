//The name of my package
package com.aremu.classes;
//List of imports used in my Bank Class

import com.aremu.interfaces.IBank;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

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

//            after finding the branch, the parameters customerName and initialTransaction are then passed to the newCustomer method
            return branch.newCustomer(customerName, initialTransaction);

        } else {
            return false;
        }
    }

    //Overriding this method from the IBank interface
    @Override
//    the addCustomerTransaction takes 3 parameter, branchName, customerName and transaction.
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
//        condition to check if branchNme exits
        if (findBranch(branchName) != null) {
            Branch branch = findBranch(branchName);

//            if branchName is found in the list of branches, then a customerName and transaction can be added to the addCustomerTransaction method
            branch.addCustomerTransaction(customerName, transaction);
            return true;
        }

        return false;
    }

    //Overriding this method from the IBank interface
    @Override
//    listCustomers(), takes 2 parameters, branchName and printTransaction
    public boolean listCustomers(String branchName, boolean printTransaction) {

//        Condition statement that checks that value of branchName is not null
        if (findBranch(branchName) != null) {

//            created an object branch of type Branch which gives access to the methods of the branch class
            Branch branch = findBranch(branchName);

//            created a variable allCustomers of type Arraylist since it's value is an Object
            ArrayList<Customer> allCustomers = branch.getCustomers();

//            Print out statement "The title for print formatting which has the branch Name
            System.out.println("Customer Details  for Branch " + branchName);

//            condition to check  if i want the transactions of the customer to be printed or not
            if (printTransaction) {

//                this for loop is executed when printTransaction is true.
                for (Customer customer : allCustomers) {

//                   storing the object returned inside a variable allTransaction which is an ArrayList
                    ArrayList<Double> allTransactions = customer.getTransactions();

//                  indexOf to get the id of customer i'm returning in the loop when printing
                    int count = 0;
                    count = allCustomers.indexOf(customer) + 1;
                    System.out.println("Customer: " + (customer.getName()) + "[" + count + "] ");
                    System.out.println("Transactions");

//                    loops through all transactions of a customer and prints it out
                    for (double transaction : allTransactions) {
                        int loop = 0;
                        loop = allTransactions.indexOf(transaction) + 1;
                        System.out.println(" [" + loop + "] Amount " + transaction);
                    }
                }
//                this condition executes when print transaction is false
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

    //The findBranch method, takes 1 parameter which is the name of the branch to search
    private Branch findBranch(String branchName) {

//        a for loop that loops through the ArrayList of branches
        for (Branch branch : branches) {

//            the condition statement returns the branch if the branchName given is found in the ArrayList branches
            if (branch.getName().equalsIgnoreCase(branchName)) {

                return branch;
            }
        }
        return null;
    }
}
//Victor.Aremu