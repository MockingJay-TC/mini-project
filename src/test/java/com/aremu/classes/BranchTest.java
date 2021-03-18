package com.aremu.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;

    @Before
    public void setUp() throws Exception {
        branch = new Branch("Derby Avenue");
        branch.addCustomerTransaction("Victor", 700);
        branch.newCustomer("Victor", 690);
        branch.getCustomers();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        assertEquals("Derby Avenue", branch.getName());
    }

    @Test
    public void getCustomers() {
        assertEquals("Victor", branch.getCustomers().get(0).getName());
//        System.out.println(branch.getCustomers().get(0).getName());
    }

    @Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("Lisa", 200));
        assertFalse(branch.newCustomer("Victor", 270));
    }

    @Test
    public void addCustomerTransaction() {
        assertTrue(branch.addCustomerTransaction("Victor", 390));
        assertFalse(branch.addCustomerTransaction("Daniel", -390));
    }
}
//Victor.Aremu