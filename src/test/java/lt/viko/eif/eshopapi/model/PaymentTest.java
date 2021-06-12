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
    
    Payment instance = new Payment();
    

    
    @AfterEach
    public void tearDown() {
        instance = new Payment();
    }

    /**
     * Test of getId method, of class Payment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Long expResult = Long.valueOf(7);
        instance.setId(Long.valueOf(7));
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Payment.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long expResult = Long.valueOf(7);
        instance.setId(Long.valueOf(7));
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCheckout method, of class Payment.
     */
    @Test
    public void testGetCheckout() {
        System.out.println("getCheckout");
        Checkout checkout = new Checkout();
        checkout.setId(Long.valueOf(5));
        instance.setCheckout(checkout);
        Long expResult = Long.valueOf(5);
        Long result = instance.getCheckout().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCheckout method, of class Payment.
     */
    @Test
    public void testSetCheckout() {
        System.out.println("setCheckout");
        Checkout checkout = new Checkout();
        checkout.setId(Long.valueOf(5));
        instance.setCheckout(checkout);
        Long expResult = Long.valueOf(5);
        Long result = instance.getCheckout().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmountPaid method, of class Payment.
     */
    @Test
    public void testGetAmountPaid() {
        System.out.println("getAmountPaid");
        double expResult = 250.99;
        instance.setAmountPaid(250.99);
        double result = instance.getAmountPaid();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmountPaid method, of class Payment.
     */
    @Test
    public void testSetAmountPaid() {
        System.out.println("setAmountPaid");
        double expResult = 250.99;
        instance.setAmountPaid(250.99);
        double result = instance.getAmountPaid();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPaidAt method, of class Payment.
     */
    @Test
    public void testGetPaidAt() {
        System.out.println("getPaidAt");
        String str="2015-03-31";
        Date expResult = Date.valueOf(str);
        instance.setPaidAt(Date.valueOf(str));
        Date result = instance.getPaidAt();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPaidAt method, of class Payment.
     */
    @Test
    public void testSetPaidAt() {
        System.out.println("setPaidAt");
        String str="2015-03-31";
        Date expResult = Date.valueOf(str);
        instance.setPaidAt(Date.valueOf(str));
        Date result = instance.getPaidAt();
        assertEquals(expResult, result);
    }
    
}
