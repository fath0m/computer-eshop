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
import org.junit.jupiter.api.AfterEach;

import static org.junit.Assert.*;

/**
 *
 * @author Jonas
 */
public class CreateMotherboardDTOTest {

    CreateMotherboardDTO instance = new CreateMotherboardDTO();
    public CreateMotherboardDTOTest() {
    }
    

    
    @AfterEach
    public void tearDown() {
        instance = new CreateMotherboardDTO();
    }

    /**
     * Test of getName method, of class CreateMotherboardDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Motherboard";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateMotherboardDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "MBoard";
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getManufacturerId method, of class CreateMotherboardDTO.
     */
    @Test
    public void testGetManufacturerId() {
        System.out.println("getManufacturerId");
        Long expResult = Long.valueOf(1);
        instance.setManufacturerId(expResult);
        Long result = instance.getManufacturerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturerId method, of class CreateMotherboardDTO.
     */
    @Test
    public void testSetManufacturerId() {
        System.out.println("setManufacturerId");
        Long manufacturerId = Long.valueOf(2);
        instance.setManufacturerId(manufacturerId);
        assertEquals(manufacturerId, instance.getManufacturerId());
    }
    
}
