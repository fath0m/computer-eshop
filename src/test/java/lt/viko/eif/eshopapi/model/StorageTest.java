/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.model;

import java.util.Set;
import lt.viko.eif.eshopapi.constant.SizeUnit;
import lt.viko.eif.eshopapi.constant.StorageType;
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
public class StorageTest {
    
    public StorageTest() {
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
     * Test of getId method, of class Storage.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Storage instance = new Storage();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Storage.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Storage instance = new Storage();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Storage.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Storage instance = new Storage();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Storage.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Storage instance = new Storage();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Storage.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Storage instance = new Storage();
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Storage.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amount = 0.0;
        Storage instance = new Storage();
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmountUnit method, of class Storage.
     */
    @Test
    public void testGetAmountUnit() {
        System.out.println("getAmountUnit");
        Storage instance = new Storage();
        SizeUnit expResult = null;
        SizeUnit result = instance.getAmountUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmountUnit method, of class Storage.
     */
    @Test
    public void testSetAmountUnit() {
        System.out.println("setAmountUnit");
        SizeUnit amountUnit = null;
        Storage instance = new Storage();
        instance.setAmountUnit(amountUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStorageType method, of class Storage.
     */
    @Test
    public void testGetStorageType() {
        System.out.println("getStorageType");
        Storage instance = new Storage();
        StorageType expResult = null;
        StorageType result = instance.getStorageType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStorageType method, of class Storage.
     */
    @Test
    public void testSetStorageType() {
        System.out.println("setStorageType");
        StorageType storageType = null;
        Storage instance = new Storage();
        instance.setStorageType(storageType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManufacturer method, of class Storage.
     */
    @Test
    public void testGetManufacturer() {
        System.out.println("getManufacturer");
        Storage instance = new Storage();
        Manufacturer expResult = null;
        Manufacturer result = instance.getManufacturer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManufacturer method, of class Storage.
     */
    @Test
    public void testSetManufacturer() {
        System.out.println("setManufacturer");
        Manufacturer manufacturer = null;
        Storage instance = new Storage();
        instance.setManufacturer(manufacturer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComputers method, of class Storage.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        Storage instance = new Storage();
        Set<Computer> expResult = null;
        Set<Computer> result = instance.getComputers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComputers method, of class Storage.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        Set<Computer> computers = null;
        Storage instance = new Storage();
        instance.setComputers(computers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
