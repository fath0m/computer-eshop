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
    CartItem instance = new CartItem();
    public CartItemTest() {
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
        Long expResult = Long.valueOf(1);
        instance.setId(Long.valueOf(1));
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class CartItem.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long expResult = Long.valueOf(1);
        instance.setId(Long.valueOf(1));
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getComputer method, of class CartItem.
     */
    @Test
    public void testGetComputer() {
        System.out.println("getComputer");
        Computer computer = new Computer();
        computer.setId(Long.valueOf(7));
        instance.setComputer(computer);
        Long result = instance.getComputer().getId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setComputer method, of class CartItem.
     */
    @Test
    public void testSetComputer() {
        System.out.println("setComputer");
        Computer computer = new Computer();
        computer.setId(Long.valueOf(8));
        instance.setComputer(computer);
        Long result = instance.getComputer().getId();
        assertEquals(Long.valueOf(8), result);
    }

    /**
     * Test of getCart method, of class CartItem.
     */
    @Test
    public void testGetCart() {
        System.out.println("getCart");
        Cart cart = new Cart();
        cart.setId(Long.valueOf(7));
        instance.setCart(cart);
        Long result = instance.getCart().getId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setCart method, of class CartItem.
     */
    @Test
    public void testSetCart() {
        System.out.println("setCart");
        Cart cart = new Cart();
        cart.setId(Long.valueOf(7));
        instance.setCart(cart);
        Long result = instance.getCart().getId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of getQuantity method, of class CartItem.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Long expResult = Long.valueOf(1);
        instance.setQuantity(Long.valueOf(1));
        Long result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class CartItem.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        Long expResult = Long.valueOf(1);
        instance.setQuantity(Long.valueOf(1));
        Long result = instance.getQuantity();
        assertEquals(expResult, result);
    }
    
}
