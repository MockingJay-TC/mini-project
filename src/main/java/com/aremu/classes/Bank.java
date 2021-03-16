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
    public boolean addBranch(String name) {
        return false;
    }

    @Override
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        return false;
    }

    @Override
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        return false;
    }

    @Override
    public boolean listCustomers(String branchName) {
        return false;
    }

    private void findBranch(String branchName) {

    }

}
//Victor.Aremu