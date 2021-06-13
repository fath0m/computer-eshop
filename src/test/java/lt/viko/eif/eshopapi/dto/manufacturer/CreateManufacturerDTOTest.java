/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.manufacturer;

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
public class CreateManufacturerDTOTest {
    
    public CreateManufacturerDTOTest() {
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
     * Test of getName method, of class CreateManufacturerDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CreateManufacturerDTO instance = new CreateManufacturerDTO();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateManufacturerDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        CreateManufacturerDTO instance = new CreateManufacturerDTO();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getCountry method, of class CreateManufacturerDTO.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        CreateManufacturerDTO instance = new CreateManufacturerDTO();
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCountry method, of class CreateManufacturerDTO.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        CreateManufacturerDTO instance = new CreateManufacturerDTO();
        instance.setCountry(country);
        assertEquals(country, instance.getCountry());
    }

    /**
     * Test of getWebsite method, of class CreateManufacturerDTO.
     */
    @Test
    public void testGetWebsite() {
        System.out.println("getWebsite");
        CreateManufacturerDTO instance = new CreateManufacturerDTO();
        String expResult = "";
        String result = instance.getWebsite();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWebsite method, of class CreateManufacturerDTO.
     */
    @Test
    public void testSetWebsite() {
        System.out.println("setWebsite");
        String website = "";
        CreateManufacturerDTO instance = new CreateManufacturerDTO();
        instance.setWebsite(website);
        assertEquals(website, instance.getWebsite());
    }
    
}
