/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.memory;

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
public class CreateMemoryDTOTest {
    
    public CreateMemoryDTOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class CreateMemoryDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CreateMemoryDTO instance = new CreateMemoryDTO();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateMemoryDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        CreateMemoryDTO instance = new CreateMemoryDTO();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getAmount method, of class CreateMemoryDTO.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        CreateMemoryDTO instance = new CreateMemoryDTO();
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAmount method, of class CreateMemoryDTO.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amount = 0.0;
        CreateMemoryDTO instance = new CreateMemoryDTO();
        instance.setAmount(amount);
        assertEquals(amount, instance.getAmount());
    }

    /**
     * Test of getManufacturerId method, of class CreateMemoryDTO.
     */
    @Test
    public void testGetManufacturerId() {
        System.out.println("getManufacturerId");
        CreateMemoryDTO instance = new CreateMemoryDTO();
        Long expResult = null;
        Long result = instance.getManufacturerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturerId method, of class CreateMemoryDTO.
     */
    @Test
    public void testSetManufacturerId() {
        System.out.println("setManufacturerId");
        Long manufacturerId = null;
        CreateMemoryDTO instance = new CreateMemoryDTO();
        instance.setManufacturerId(manufacturerId);
        assertEquals(manufacturerId, instance.getManufacturerId());
    }
    
}
