package com.aremu.classes;

import com.aremu.classes.Branch;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }


    public boolean addBranch(String name){
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        return false;
    }
    public void findBranch(String branchName){

    }
    public boolean listCustomers(String branchName){
        return false;
    }
}
//Victor.Aremu