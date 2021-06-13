/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.motherboard;

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
public class CreateMotherboardDTOTest {
    
    public CreateMotherboardDTOTest() {
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
     * Test of getName method, of class CreateMotherboardDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CreateMotherboardDTO instance = new CreateMotherboardDTO();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateMotherboardDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        CreateMotherboardDTO instance = new CreateMotherboardDTO();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getManufacturerId method, of class CreateMotherboardDTO.
     */
    @Test
    public void testGetManufacturerId() {
        System.out.println("getManufacturerId");
        CreateMotherboardDTO instance = new CreateMotherboardDTO();
        Long expResult = null;
        Long result = instance.getManufacturerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturerId method, of class CreateMotherboardDTO.
     */
    @Test
    public void testSetManufacturerId() {
        System.out.println("setManufacturerId");
        Long manufacturerId = null;
        CreateMotherboardDTO instance = new CreateMotherboardDTO();
        instance.setManufacturerId(manufacturerId);
        assertEquals(manufacturerId, instance.getManufacturerId());
    }
    
}
