/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.storage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.function.LongFunction;

import static org.junit.Assert.*;

/**
 *
 * @author Jonas, Eimantas
 */
public class CreateStorageDTOTest {

    CreateStorageDTO instance = new CreateStorageDTO();
    public CreateStorageDTOTest() {
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
     * Test of getName method, of class CreateStorageDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "name";
        instance.setName("name");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateStorageDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "name";
        instance.setName("name");
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getAmount method, of class CreateStorageDTO.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        double expResult = 1.0;
        instance.setAmount( 1.0 );
        double result = instance.getAmount();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of setAmount method, of class CreateStorageDTO.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amount = 1.0;
        instance.setAmount(amount);
        assertEquals(amount, instance.getAmount(),0.0);
    }

    /**
     * Test of getManufacturerId method, of class CreateStorageDTO.
     */
    @Test
    public void testGetManufacturerId() {
        System.out.println("getManufacturerId");
        Long expResult = Long.valueOf(1);
        instance.setManufacturerId(Long.valueOf(1));
        Long result = instance.getManufacturerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturerId method, of class CreateStorageDTO.
     */
    @Test
    public void testSetManufacturerId() {
        System.out.println("setManufacturerId");
        Long manufacturerId = Long.valueOf(1);

        instance.setManufacturerId(Long.valueOf(1));
        assertEquals(manufacturerId, instance.getManufacturerId());
    }
    
}
