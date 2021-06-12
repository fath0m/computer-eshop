/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.model;

import java.sql.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class PaymentTest {
    
    public PaymentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Payment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Payment instance = new Payment();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Payment.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Payment instance = new Payment();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheckout method, of class Payment.
     */
    @Test
    public void testGetCheckout() {
        System.out.println("getCheckout");
        Payment instance = new Payment();
        Checkout expResult = null;
        Checkout result = instance.getCheckout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCheckout method, of class Payment.
     */
    @Test
    public void testSetCheckout() {
        System.out.println("setCheckout");
        Checkout checkout = null;
        Payment instance = new Payment();
        instance.setCheckout(checkout);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmountPaid method, of class Payment.
     */
    @Test
    public void testGetAmountPaid() {
        System.out.println("getAmountPaid");
        Payment instance = new Payment();
        double expResult = 0.0;
        double result = instance.getAmountPaid();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmountPaid method, of class Payment.
     */
    @Test
    public void testSetAmountPaid() {
        System.out.println("setAmountPaid");
        double amountPaid = 0.0;
        Payment instance = new Payment();
        instance.setAmountPaid(amountPaid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaidAt method, of class Payment.
     */
    @Test
    public void testGetPaidAt() {
        System.out.println("getPaidAt");
        Payment instance = new Payment();
        Date expResult = null;
        Date result = instance.getPaidAt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaidAt method, of class Payment.
     */
    @Test
    public void testSetPaidAt() {
        System.out.println("setPaidAt");
        Date paidAt = null;
        Payment instance = new Payment();
        instance.setPaidAt(paidAt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
