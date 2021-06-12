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
    
    public MemoryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Memory.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Memory instance = new Memory();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Memory.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Memory instance = new Memory();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Memory.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Memory instance = new Memory();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Memory.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Memory instance = new Memory();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Memory.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Memory instance = new Memory();
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Memory.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amount = 0.0;
        Memory instance = new Memory();
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmountUnit method, of class Memory.
     */
    @Test
    public void testGetAmountUnit() {
        System.out.println("getAmountUnit");
        Memory instance = new Memory();
        SizeUnit expResult = null;
        SizeUnit result = instance.getAmountUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmountUnit method, of class Memory.
     */
    @Test
    public void testSetAmountUnit() {
        System.out.println("setAmountUnit");
        SizeUnit amountUnit = null;
        Memory instance = new Memory();
        instance.setAmountUnit(amountUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManufacturer method, of class Memory.
     */
    @Test
    public void testGetManufacturer() {
        System.out.println("getManufacturer");
        Memory instance = new Memory();
        Manufacturer expResult = null;
        Manufacturer result = instance.getManufacturer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManufacturer method, of class Memory.
     */
    @Test
    public void testSetManufacturer() {
        System.out.println("setManufacturer");
        Manufacturer manufacturer = null;
        Memory instance = new Memory();
        instance.setManufacturer(manufacturer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComputers method, of class Memory.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        Memory instance = new Memory();
        Set<Computer> expResult = null;
        Set<Computer> result = instance.getComputers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComputers method, of class Memory.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        Set<Computer> computers = null;
        Memory instance = new Memory();
        instance.setComputers(computers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
