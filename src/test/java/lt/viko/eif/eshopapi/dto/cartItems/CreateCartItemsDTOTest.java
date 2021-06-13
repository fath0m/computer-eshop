/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.cartItems;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonas, Karolis, Eimantas, Lukas
 */
public class CreateCartItemsDTOTest {

    CreateCartItemsDTO instance = new CreateCartItemsDTO();

    public CreateCartItemsDTOTest() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getComputerId method, of class CreateCartItemsDTO.
     */
    @Test
    public void testGetComputerId() {
        System.out.println("getComputerId");
        Long expResult = Long.valueOf(4);
        instance.setComputerId(Long.valueOf(4));
        Long result = instance.getComputerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComputerId method, of class CreateCartItemsDTO.
     */
    @Test
    public void testSetComputerId() {
        System.out.println("setComputerId");
        Long computerId = Long.valueOf(2);
        instance.setComputerId(Long.valueOf(2));
        Long result = instance.getComputerId();
        assertEquals(computerId, result);
    }

    /**
     * Test of getCartId method, of class CreateCartItemsDTO.
     */
    @Test
    public void testGetCartId() {
        System.out.println("getCartId");
        Long expResult = Long.valueOf(2);
        instance.setComputerId(Long.valueOf(2));
        assertEquals(expResult, instance.getComputerId());
    }

    /**
     * Test of setCartId method, of class CreateCartItemsDTO.
     */
    @Test
    public void testSetCartId() {
        System.out.println("setCartId");
        Long expResult = Long.valueOf(2);
        instance.setCartId(Long.valueOf(2));
        Long result = instance.getCartId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getQuantity method, of class CreateCartItemsDTO.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Long expResult = Long.valueOf(3);
        instance.setQuantity(Long.valueOf(3));
        Long result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class CreateCartItemsDTO.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        Long expResult = Long.valueOf(2);
        instance.setQuantity(Long.valueOf(2));
        Long result = instance.getQuantity();
        assertEquals(expResult, result);
    }
    
}
