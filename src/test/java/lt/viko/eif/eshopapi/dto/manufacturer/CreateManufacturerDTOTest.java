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
    
    CreateManufacturerDTO instance = new CreateManufacturerDTO();
    
    @After
    public void tearDown() {
        instance = new CreateManufacturerDTO();
    }

    /**
     * Test of getName method, of class CreateManufacturerDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Manufacturer";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateManufacturerDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Test";
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getCountry method, of class CreateManufacturerDTO.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        String expResult = "Lithuania";
        instance.setCountry(expResult);
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCountry method, of class CreateManufacturerDTO.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "USA";
        instance.setCountry(country);
        assertEquals(country, instance.getCountry());
    }

    /**
     * Test of getWebsite method, of class CreateManufacturerDTO.
     */
    @Test
    public void testGetWebsite() {
        System.out.println("getWebsite");
        String expResult = "www.test.com";
        instance.setWebsite(expResult);
        String result = instance.getWebsite();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWebsite method, of class CreateManufacturerDTO.
     */
    @Test
    public void testSetWebsite() {
        System.out.println("setWebsite");
        String website = "www.test2.com";
        instance.setWebsite(website);
        assertEquals(website, instance.getWebsite());
    }
    
}
