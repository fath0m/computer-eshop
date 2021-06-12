/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.model;

import java.util.Set;
import lt.viko.eif.eshopapi.constant.SizeUnit;
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
public class MemoryTest {
    Memory instance = new Memory();
    
    public MemoryTest() {
    }
    
    @AfterEach
    public void tearDown() {
        instance = new Memory();
    }

    /**
     * Test of getId method, of class Memory.
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
     * Test of setId method, of class Memory.
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
     * Test of getName method, of class Memory.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Memory";
        instance.setName("Memory");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Memory.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "Memory";
        instance.setName("Memory");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmount method, of class Memory.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        double expResult = 500.0;
        instance.setAmount(500.0);
        double result = instance.getAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmount method, of class Memory.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double expResult = 200.0;
        instance.setAmount(200.0);
        double result = instance.getAmount();
        assertEquals(expResult,result);
    }

    /**
     * Test of getAmountUnit method, of class Memory.
     */
    @Test
    public void testGetAmountUnit() {
        System.out.println("getAmountUnit");
        SizeUnit expResult = SizeUnit.GIGABYTE;
        instance.setAmountUnit(SizeUnit.GIGABYTE);
        SizeUnit result = instance.getAmountUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmountUnit method, of class Memory.
     */
    @Test
    public void testSetAmountUnit() {
        System.out.println("setAmountUnit");
        SizeUnit expResult = SizeUnit.MEGABYTE;
        instance.setAmountUnit(SizeUnit.MEGABYTE);
        SizeUnit result = instance.getAmountUnit();
        assertEquals(expResult,result);
    }

    /**
     * Test of getManufacturer method, of class Memory.
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
     * Test of setManufacturer method, of class Memory.
     */
    @Test
    public void testSetManufacturer() {
        System.out.println("setManufacturer");
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(Long.valueOf(5));
        instance.setManufacturer(manufacturer);
        Long result = instance.getManufacturer().getId();
        assertEquals(Long.valueOf(5), result);
    }

    /**
     * Test of getComputers method, of class Memory.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        instance.setId(Long.valueOf(7));
        Computer computer = new Computer();
        computer.setMemory(instance);
        Long expResult = Long.valueOf(7);
        Long result = computer.getMemory().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComputers method, of class Memory.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        instance.setId(Long.valueOf(5));
        Computer computer = new Computer();
        computer.setMemory(instance);
        Long expResult = Long.valueOf(5);
        Long result = computer.getMemory().getId();
        assertEquals(expResult, result);
    }
    
}
