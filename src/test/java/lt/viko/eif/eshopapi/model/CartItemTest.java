/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.model;

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
public class CartItemTest {
    
    public CartItemTest() {
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
     * Test of getId method, of class CartItem.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CartItem instance = new CartItem();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class CartItem.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        CartItem instance = new CartItem();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComputer method, of class CartItem.
     */
    @Test
    public void testGetComputer() {
        System.out.println("getComputer");
        CartItem instance = new CartItem();
        Computer expResult = null;
        Computer result = instance.getComputer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComputer method, of class CartItem.
     */
    @Test
    public void testSetComputer() {
        System.out.println("setComputer");
        Computer computer = null;
        CartItem instance = new CartItem();
        instance.setComputer(computer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCart method, of class CartItem.
     */
    @Test
    public void testGetCart() {
        System.out.println("getCart");
        CartItem instance = new CartItem();
        Cart expResult = null;
        Cart result = instance.getCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCart method, of class CartItem.
     */
    @Test
    public void testSetCart() {
        System.out.println("setCart");
        Cart cart = null;
        CartItem instance = new CartItem();
        instance.setCart(cart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class CartItem.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        CartItem instance = new CartItem();
        Long expResult = null;
        Long result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class CartItem.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        Long quantity = null;
        CartItem instance = new CartItem();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
