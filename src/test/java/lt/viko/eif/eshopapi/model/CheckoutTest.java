/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.model;

import lt.viko.eif.eshopapi.constant.Currency;
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
public class CheckoutTest {
    
    public CheckoutTest() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Checkout.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Checkout instance = new Checkout();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Checkout.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Checkout instance = new Checkout();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Checkout.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Checkout instance = new Checkout();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Checkout.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Checkout instance = new Checkout();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Checkout.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Checkout instance = new Checkout();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Checkout.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Checkout instance = new Checkout();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryAddress method, of class Checkout.
     */
    @Test
    public void testGetDeliveryAddress() {
        System.out.println("getDeliveryAddress");
        Checkout instance = new Checkout();
        String expResult = "";
        String result = instance.getDeliveryAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveryAddress method, of class Checkout.
     */
    @Test
    public void testSetDeliveryAddress() {
        System.out.println("setDeliveryAddress");
        String deliveryAddress = "";
        Checkout instance = new Checkout();
        instance.setDeliveryAddress(deliveryAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryCity method, of class Checkout.
     */
    @Test
    public void testGetDeliveryCity() {
        System.out.println("getDeliveryCity");
        Checkout instance = new Checkout();
        String expResult = "";
        String result = instance.getDeliveryCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveryCity method, of class Checkout.
     */
    @Test
    public void testSetDeliveryCity() {
        System.out.println("setDeliveryCity");
        String deliveryCity = "";
        Checkout instance = new Checkout();
        instance.setDeliveryCity(deliveryCity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeliveryCountry method, of class Checkout.
     */
    @Test
    public void testGetDeliveryCountry() {
        System.out.println("getDeliveryCountry");
        Checkout instance = new Checkout();
        String expResult = "";
        String result = instance.getDeliveryCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveryCountry method, of class Checkout.
     */
    @Test
    public void testSetDeliveryCountry() {
        System.out.println("setDeliveryCountry");
        String deliveryCountry = "";
        Checkout instance = new Checkout();
        instance.setDeliveryCountry(deliveryCountry);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPaidOut method, of class Checkout.
     */
    @Test
    public void testIsPaidOut() {
        System.out.println("isPaidOut");
        Checkout instance = new Checkout();
        boolean expResult = false;
        boolean result = instance.isPaidOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaidOut method, of class Checkout.
     */
    @Test
    public void testSetPaidOut() {
        System.out.println("setPaidOut");
        boolean paidOut = false;
        Checkout instance = new Checkout();
        instance.setPaidOut(paidOut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrency method, of class Checkout.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("getCurrency");
        Checkout instance = new Checkout();
        Currency expResult = null;
        Currency result = instance.getCurrency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrency method, of class Checkout.
     */
    @Test
    public void testSetCurrency() {
        System.out.println("setCurrency");
        Currency currency = null;
        Checkout instance = new Checkout();
        instance.setCurrency(currency);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCart method, of class Checkout.
     */
    @Test
    public void testGetCart() {
        System.out.println("getCart");
        Checkout instance = new Checkout();
        Cart expResult = null;
        Cart result = instance.getCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCart method, of class Checkout.
     */
    @Test
    public void testSetCart() {
        System.out.println("setCart");
        Cart cart = null;
        Checkout instance = new Checkout();
        instance.setCart(cart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
