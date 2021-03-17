package com.aremu.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank("PhoenixMJ");
        bank.addBranch("Derby Avenue");
        bank.addCustomer("Derby Avenue", "Victor", 900.0);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addBranch() {
        assertTrue(bank.addBranch("Assakae Branch"));
        assertFalse(bank.addBranch("Derby Avenue"));
    }

    @Test
    public void addCustomer() {
    }

    @Test
    public void addCustomerTransaction() {
    }

    @Test
    public void listCustomers() {
    }
}