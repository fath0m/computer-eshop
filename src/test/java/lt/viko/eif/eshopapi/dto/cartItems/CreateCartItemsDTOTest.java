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
 * @author Jonas
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
        Long expResult = Long.valueOf(1);
        instance.setCartId(Long.valueOf(1));
        Long result = instance.getComputerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComputerId method, of class CreateCartItemsDTO.
     */
    @Test
    public void testSetComputerId() {
        System.out.println("setComputerId");
        Long computerId = null;
        CreateCartItemsDTO instance = new CreateCartItemsDTO();
        instance.setComputerId(computerId);
        assertEquals(computerId, instance.getComputerId());
    }

    /**
     * Test of getCartId method, of class CreateCartItemsDTO.
     */
    @Test
    public void testGetCartId() {
        System.out.println("getCartId");
        CreateCartItemsDTO instance = new CreateCartItemsDTO();
        Long expResult = null;
        Long result = instance.getCartId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCartId method, of class CreateCartItemsDTO.
     */
    @Test
    public void testSetCartId() {
        System.out.println("setCartId");
        Long cartId = null;
        CreateCartItemsDTO instance = new CreateCartItemsDTO();
        instance.setCartId(cartId);
        assertEquals(cartId, instance.getCartId());
    }

    /**
     * Test of getQuantity method, of class CreateCartItemsDTO.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        CreateCartItemsDTO instance = new CreateCartItemsDTO();
        Long expResult = null;
        Long result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class CreateCartItemsDTO.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        Long quantity = null;
        CreateCartItemsDTO instance = new CreateCartItemsDTO();
        instance.setQuantity(quantity);
        assertEquals(quantity, instance.getQuantity());
    }
    
}
