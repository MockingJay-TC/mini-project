package com.aremu.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Victor", 800);
        customer.addTransactions(400.0);
        customer.getTransactions();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        assertEquals("Victor", customer.getName());
    }

    @Test
    public void getTransactions() {
        assertEquals(400.0, customer.getTransactions());
    }

    @Test
    public void addTransactions() {
//        assertEquals(customer.addTransactions("victor"));
    }
}
//Victor.Aremu