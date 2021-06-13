/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.memory;

import lt.viko.eif.eshopapi.model.Manufacturer;
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
public class CreateMemoryDTOTest {

    CreateMemoryDTO instance = new CreateMemoryDTO();
    public CreateMemoryDTOTest() {
    }
    

    
    @AfterEach
    public void tearDown() {
        instance = new CreateMemoryDTO();
    }

    /**
     * Test of getName method, of class CreateMemoryDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "MemTest";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateMemoryDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "TestMem";
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getAmount method, of class CreateMemoryDTO.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        double expResult = 250.0;
        instance.setAmount(expResult);
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAmount method, of class CreateMemoryDTO.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amount = 270.0;
        instance.setAmount(amount);
        assertEquals(amount, instance.getAmount(), 0.0);
    }

    /**
     * Test of getManufacturerId method, of class CreateMemoryDTO.
     */
    @Test
    public void testGetManufacturerId() {
        System.out.println("getManufacturerId");
        instance.setManufacturerId(Long.valueOf(1));
        Long expResult = Long.valueOf(1);
        Long result = instance.getManufacturerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturerId method, of class CreateMemoryDTO.
     */
    @Test
    public void testSetManufacturerId() {
        System.out.println("setManufacturerId");
        instance.setManufacturerId(Long.valueOf(2));
        Long manufacturerId = (Long.valueOf(2));
        instance.setManufacturerId(manufacturerId);
        assertEquals(manufacturerId, instance.getManufacturerId());
    }
    
}
