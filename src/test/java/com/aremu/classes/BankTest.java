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
        bank.addBranch("Assakae");
        bank.addCustomer("Derby Avenue", "Victor", 900.0);
        bank.addCustomerTransaction("Assakae", "Victor", 700);
        bank.listCustomers("Derby Avenue", false);

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
        assertTrue(bank.addCustomer("Derby Avenue", "Thomas", 700));
        assertFalse(bank.addCustomer("Derby Avenue", "Victor", -23));
    }

    @Test
    public void addCustomerTransaction() {
        assertTrue(bank.addCustomerTransaction("Assakae", "Victor", 600));
        assertFalse(bank.addCustomerTransaction("Whindo", "Lash", -600));
    }

    @Test
    public void listCustomers() {
        assertTrue(bank.listCustomers("Derby Avenue",  false));
        assertFalse(bank.listCustomers("Assakae",  false));
    }
}
//Victor.Aremu