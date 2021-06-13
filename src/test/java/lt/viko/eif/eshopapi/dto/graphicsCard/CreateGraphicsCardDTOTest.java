/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.graphicsCard;

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
public class CreateGraphicsCardDTOTest {

    CreateGraphicsCardDTO instance = new CreateGraphicsCardDTO();
    public CreateGraphicsCardDTOTest() {
    }

    @AfterEach
    public void tearDown() {
        instance = new CreateGraphicsCardDTO();
    }

    /**
     * Test of getName method, of class CreateGraphicsCardDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "DTOTEST";
        instance.setName("DTOTEST");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateGraphicsCardDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "SETDTO";
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getManufacturer_id method, of class CreateGraphicsCardDTO.
     */
    @Test
    public void testGetManufacturer_id() {
        System.out.println("getManufacturer_id");
        Long expResult = Long.valueOf(1);
        instance.setManufacturer_id(Long.valueOf(1));
        Long result = instance.getManufacturer_id();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturer_id method, of class CreateGraphicsCardDTO.
     */
    @Test
    public void testSetManufacturer_id() {
        System.out.println("setManufacturer_id");
        Long manufacturer_id = Long.valueOf(2);
        instance.setManufacturer_id(manufacturer_id);
        assertEquals(manufacturer_id, instance.getManufacturer_id());
    }
    
}
