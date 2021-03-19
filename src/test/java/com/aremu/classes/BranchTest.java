package com.aremu.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    //    Created a variable called branch of type Branch
    Branch branch;

    @Before

    public void setUp() throws Exception {

//        instantiated the Branch class
        branch = new Branch("Derby Avenue");

//        added customer transaction to the branch
        branch.addCustomerTransaction("Victor", 700);

        branch.newCustomer("Victor", 690);
        branch.getCustomers();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
//    gets the name of a branch
    public void getName() {
        assertEquals("Derby Avenue", branch.getName());
    }

    @Test
    public void getCustomers() {
//        checks if the nam available in customers is equal to the customerName passed
        assertEquals("Victor", branch.getCustomers().get(0).getName());
    }

    @Test
    public void newCustomer() {
//        this test returns true because customerName doesn't and transaction is greater than 0
        assertTrue(branch.newCustomer("Lisa", 200));

//        this test returns false because customerName exists and transaction is lesser than 0
        assertFalse(branch.newCustomer("Victor", -270));
    }

    @Test
    public void addCustomerTransaction() {

//        this test returns true because customerName exists and transaction is greater than 0
        assertTrue(branch.addCustomerTransaction("Victor", 390));

//        this test returns false because customerName doesn't exist and transaction is lesser than 0
        assertFalse(branch.addCustomerTransaction("Daniel", -390));
    }
}
//Victor.Aremu