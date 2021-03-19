package com.aremu.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    //    created a field of type Bank
    private Bank bank;

    @Before
    public void setUp() throws Exception {
//        instantiated the Bank class
        bank = new Bank("PhoenixMJ");

//        added two branches
        bank.addBranch("Derby Avenue");
        bank.addBranch("Assakae");

//adding a customer to the stated branch
        bank.addCustomer("Derby Avenue", "Victor", 900.0);


        bank.addCustomerTransaction("Assakae", "Victor", 700);
        bank.listCustomers("Derby Avenue", false);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addBranch() {
//      Testing the addBranch method, returns true since branch does not exist
        assertTrue(bank.addBranch("Assakae Branch"));

//       This test returns false because the branch i'm adding already exits
        assertFalse(bank.addBranch("Derby Avenue"));
    }

    @Test
    public void addCustomer() {
//        this method checks if the branch is present, and passes the customer as newCustomer with initialTransaction
//        this method returns true because branch is present, customerName is not null and initialTransaction is greater than 0
        assertTrue(bank.addCustomer("Derby Avenue", "Thomas", 700));

//        this test returns false because the initialTransaction is less than 0
        assertFalse(bank.addCustomer("Derby Avenue", "Victor", -23));

//        this test returns false because the branchName does not Exist
        assertFalse(bank.addCustomer("Whindo", "Victor", -23));
    }

    @Test
    public void addCustomerTransaction() {
//    the addCustomerTransaction takes 3 parameter, branchName, customerName and transaction.
//        this test returns true because branchName exists, customerName exists and transaction is greater 0
        assertTrue(bank.addCustomerTransaction("Assakae", "Victor", 600));

//        this test returns false because branchName does not exist, customerName does not exist and transaction is lesser than 0
        assertFalse(bank.addCustomerTransaction("Whindo", "Lash", -600));


    }

    @Test
    public void listCustomers() {
//        listCustomers(), takes 2 parameters, branchName and printTransaction
//        this test returns true since branch name exists, so it lists all customers and their transactions
        assertTrue(bank.listCustomers("Derby Avenue", true));

//        this test returns true since branch name exists, so it lists all customers without transactions
        assertTrue(bank.listCustomers("Derby Avenue", false));

//        this test returns false because the branchName does not exist
        assertFalse(bank.listCustomers("Whindo", true));

//        this test also returns false
        assertFalse(bank.listCustomers("Whindo", false));
    }
}
//Victor.Aremu