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

    Checkout instance = new Checkout();
    @AfterEach
    public void tearDown() {
        instance = new Checkout();
    }

    /**
     * Test of getId method, of class Checkout.
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
     * Test of setId method, of class Checkout.
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
     * Test of getFirstName method, of class Checkout.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        String expResult = "Karolis";
        instance.setFirstName("Karolis");
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Checkout.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String expResult = "Karolis";
        instance.setFirstName("Karolis");
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastName method, of class Checkout.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        String expResult = "Pigaga";
        instance.setLastName("Pigaga");
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Checkout.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String expResult = "Pigaga";
        instance.setLastName("Pigaga");
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeliveryAddress method, of class Checkout.
     */
    @Test
    public void testGetDeliveryAddress() {
        System.out.println("getDeliveryAddress");
        String expResult = "Test gatve 92";
        instance.setDeliveryAddress("Test gatve 92");
        String result = instance.getDeliveryAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryAddress method, of class Checkout.
     */
    @Test
    public void testSetDeliveryAddress() {
        System.out.println("setDeliveryAddress");
        String expResult = "Test gatve 92";
        instance.setDeliveryAddress("Test gatve 92");
        String result = instance.getDeliveryAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeliveryCity method, of class Checkout.
     */
    @Test
    public void testGetDeliveryCity() {
        System.out.println("getDeliveryCity");
        String expResult = "Vilnius";
        instance.setDeliveryCity("Vilnius");
        String result = instance.getDeliveryCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryCity method, of class Checkout.
     */
    @Test
    public void testSetDeliveryCity() {
        System.out.println("setDeliveryCity");
        String expResult = "Vilnius";
        instance.setDeliveryCity("Vilnius");
        String result = instance.getDeliveryCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeliveryCountry method, of class Checkout.
     */
    @Test
    public void testGetDeliveryCountry() {
        System.out.println("getDeliveryCountry");
        String expResult = "Lietuva";
        instance.setDeliveryCountry("Lietuva");
        String result = instance.getDeliveryCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryCountry method, of class Checkout.
     */
    @Test
    public void testSetDeliveryCountry() {
        System.out.println("setDeliveryCountry");
        String expResult = "Lietuva";
        instance.setDeliveryCountry("Lietuva");
        String result = instance.getDeliveryCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPaidOut method, of class Checkout.
     */
    @Test
    public void testIsPaidOut() {
        System.out.println("isPaidOut");
        boolean expResult = true;
        instance.setPaidOut(true);
        boolean result = instance.isPaidOut();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPaidOut method, of class Checkout.
     */
    @Test
    public void testSetPaidOut() {
        System.out.println("setPaidOut");
        boolean expResult = true;
        instance.setPaidOut(true);
        boolean result = instance.isPaidOut();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrency method, of class Checkout.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("getCurrency");
        Currency expResult = Currency.EUR;
        instance.setCurrency(Currency.EUR);
        Currency result = instance.getCurrency();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCurrency method, of class Checkout.
     */
    @Test
    public void testSetCurrency() {
        System.out.println("setCurrency");
        Currency expResult = Currency.EUR;
        instance.setCurrency(Currency.EUR);
        Currency result = instance.getCurrency();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCart method, of class Checkout.
     */
    @Test
    public void testGetCart() {
        System.out.println("getCart");
        Checkout instance = new Checkout();
        Cart cart = new Cart();
        cart.setId(Long.valueOf(7));
        instance.setCart(cart);
        Long expResult = Long.valueOf(7);
        Long result = instance.getCart().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCart method, of class Checkout.
     */
    @Test
    public void testSetCart() {
        System.out.println("setCart");
        Checkout instance = new Checkout();
        Cart cart = new Cart();
        cart.setId(Long.valueOf(7));
        instance.setCart(cart);
        Long expResult = Long.valueOf(7);
        Long result = instance.getCart().getId();
        assertEquals(expResult, result);
    }
    
}
