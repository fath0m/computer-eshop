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
public class CartTest {
    
    public CartTest() {
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
     * Test of getId method, of class Cart.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Cart instance = new Cart();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Cart.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Cart instance = new Cart();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCheckedOut method, of class Cart.
     */
    @Test
    public void testIsCheckedOut() {
        System.out.println("isCheckedOut");
        Cart instance = new Cart();
        boolean expResult = false;
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCheckedOut method, of class Cart.
     */
    @Test
    public void testSetCheckedOut() {
        System.out.println("setCheckedOut");
        boolean checkedOut = false;
        Cart instance = new Cart();
        instance.setCheckedOut(checkedOut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
