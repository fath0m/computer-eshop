/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.model;

import java.util.Set;
import lt.viko.eif.eshopapi.constant.FrequencyUnit;
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
public class ProcessorTest {
    
    public ProcessorTest() {
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
     * Test of getId method, of class Processor.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Processor instance = new Processor();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Processor.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Processor instance = new Processor();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Processor.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Processor instance = new Processor();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Processor.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Processor instance = new Processor();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoreAmount method, of class Processor.
     */
    @Test
    public void testGetCoreAmount() {
        System.out.println("getCoreAmount");
        Processor instance = new Processor();
        int expResult = 0;
        int result = instance.getCoreAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoreAmount method, of class Processor.
     */
    @Test
    public void testSetCoreAmount() {
        System.out.println("setCoreAmount");
        int coreAmount = 0;
        Processor instance = new Processor();
        instance.setCoreAmount(coreAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThreadAmount method, of class Processor.
     */
    @Test
    public void testGetThreadAmount() {
        System.out.println("getThreadAmount");
        Processor instance = new Processor();
        int expResult = 0;
        int result = instance.getThreadAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThreadAmount method, of class Processor.
     */
    @Test
    public void testSetThreadAmount() {
        System.out.println("setThreadAmount");
        int threadAmount = 0;
        Processor instance = new Processor();
        instance.setThreadAmount(threadAmount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequency method, of class Processor.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        Processor instance = new Processor();
        double expResult = 0.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrequency method, of class Processor.
     */
    @Test
    public void testSetFrequency() {
        System.out.println("setFrequency");
        double frequency = 0.0;
        Processor instance = new Processor();
        instance.setFrequency(frequency);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequencyUnit method, of class Processor.
     */
    @Test
    public void testGetFrequencyUnit() {
        System.out.println("getFrequencyUnit");
        Processor instance = new Processor();
        FrequencyUnit expResult = null;
        FrequencyUnit result = instance.getFrequencyUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrequencyUnit method, of class Processor.
     */
    @Test
    public void testSetFrequencyUnit() {
        System.out.println("setFrequencyUnit");
        FrequencyUnit frequencyUnit = null;
        Processor instance = new Processor();
        instance.setFrequencyUnit(frequencyUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManufacturer method, of class Processor.
     */
    @Test
    public void testGetManufacturer() {
        System.out.println("getManufacturer");
        Processor instance = new Processor();
        Manufacturer expResult = null;
        Manufacturer result = instance.getManufacturer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManufacturer method, of class Processor.
     */
    @Test
    public void testSetManufacturer() {
        System.out.println("setManufacturer");
        Manufacturer manufacturer = null;
        Processor instance = new Processor();
        instance.setManufacturer(manufacturer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComputers method, of class Processor.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        Processor instance = new Processor();
        Set<Computer> expResult = null;
        Set<Computer> result = instance.getComputers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComputers method, of class Processor.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        Set<Computer> computers = null;
        Processor instance = new Processor();
        instance.setComputers(computers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
