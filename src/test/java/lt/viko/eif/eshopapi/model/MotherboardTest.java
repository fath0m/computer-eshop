/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.model;

import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
public class MotherboardTest {
    Motherboard instance = new Motherboard();
    
    public MotherboardTest() {
    }
    
    @AfterEach
    public void tearDown() {
        instance = new Motherboard();
    }

    /**
     * Test of getId method, of class Motherboard.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Long expResult = Long.valueOf(1);
        instance.setId(Long.valueOf(1));
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Motherboard.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long expResult = Long.valueOf(1);
        instance.setId(Long.valueOf(1));
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Motherboard.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "MOTHERBOARD";
        instance.setName("MOTHERBOARD");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Motherboard.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "MOTHERBOARD";
        instance.setName("MOTHERBOARD");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getManufacturer method, of class Motherboard.
     */
    @Test
    public void testGetManufacturer() {
        System.out.println("getManufacturer");
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(Long.valueOf(7));
        instance.setManufacturer(manufacturer);
        Long result = instance.getManufacturer().getId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setManufacturer method, of class Motherboard.
     */
    @Test
    public void testSetManufacturer() {
        System.out.println("setManufacturer");
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(Long.valueOf(5));
        instance.setManufacturer(manufacturer);
        Long result = instance.getManufacturer().getId();
        assertEquals(Long.valueOf(5),result);
    }

    /**
     * Test of getComputers method, of class Motherboard.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        instance.setId(Long.valueOf(7));
        Computer computer = new Computer();
        computer.setMotherboard(instance);
        Long expResult = Long.valueOf(7);
        Long result = computer.getMotherboard().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComputers method, of class Motherboard.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        instance.setId(Long.valueOf(7));
        Computer computer = new Computer();
        computer.setMotherboard(instance);
        Long expResult = Long.valueOf(7);
        Long result = computer.getMotherboard().getId();
        assertEquals(expResult, result);
    }
    
}
