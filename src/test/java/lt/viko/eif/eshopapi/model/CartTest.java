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
    
    Cart instance = new Cart();
    
    @AfterEach
    public void tearDown() {
        instance = new Cart();
    }

    /**
     * Test of getId method, of class Cart.
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
     * Test of setId method, of class Cart.
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
     * Test of isCheckedOut method, of class Cart.
     */
    @Test
    public void testIsCheckedOut() {
        System.out.println("isCheckedOut");
        boolean expResult = true;
        instance.setCheckedOut(true);
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCheckedOut method, of class Cart.
     */
    @Test
    public void testSetCheckedOut() {
        System.out.println("setCheckedOut");
        boolean expResult = true;
        instance.setCheckedOut(true);
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
    }
    
}
