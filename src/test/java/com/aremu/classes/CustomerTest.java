package com.aremu.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//created an object of type customer
public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
//        instantiating the customer class
        customer = new Customer("Victor", 800);
//        adding a transaction to transactions
        customer.addTransactions(400.0);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
//    gets the customerName and compares it to the given one
    public void getName() {
        assertEquals("Victor", customer.getName());
    }

    @Test
//    gets the first transaction and compares it to the expected
    public void getTransactions() {
        assertEquals(400.0, customer.getTransactions().get(1), 0.01);
    }

    @Test
    public void addTransactions() {
//        this gets the number of transactions that have been performed
        customer.addTransactions(200);
        assertEquals(3, customer.getTransactions().size());
    }
}
//Victor.Aremu