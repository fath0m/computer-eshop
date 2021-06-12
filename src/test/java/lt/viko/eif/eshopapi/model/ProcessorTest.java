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
    
    Processor instance = new Processor();
    
    @AfterEach
    public void tearDown() { instance = new Processor(); }

    /**
     * Test of getId method, of class Processor.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Long expResult = Long.valueOf(7);
        instance.setId(Long.valueOf(7));
        Long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Processor.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long expResult = Long.valueOf(7);
        instance.setId(Long.valueOf(7));
        Long result = instance.getId();
        assertEquals(expResult,result);
    }

    /**
     * Test of getName method, of class Processor.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "TESTPROC";
        instance.setName("TESTPROC");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Processor.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "TESTPROC";
        instance.setName("TESTPROC");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoreAmount method, of class Processor.
     */
    @Test
    public void testGetCoreAmount() {
        System.out.println("getCoreAmount");
        int expResult = 8;
        instance.setCoreAmount(8);
        int result = instance.getCoreAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoreAmount method, of class Processor.
     */
    @Test
    public void testSetCoreAmount() {
        System.out.println("setCoreAmount");
        int expResult = 8;
        instance.setCoreAmount(8);
        int result = instance.getCoreAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getThreadAmount method, of class Processor.
     */
    @Test
    public void testGetThreadAmount() {
        System.out.println("getThreadAmount");
        int expResult = 5;
        instance.setThreadAmount(5);
        int result = instance.getThreadAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setThreadAmount method, of class Processor.
     */
    @Test
    public void testSetThreadAmount() {
        System.out.println("setThreadAmount");
        int expResult = 5;
        instance.setThreadAmount(5);
        int result = instance.getThreadAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFrequency method, of class Processor.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        double expResult = 2.5;
        instance.setFrequency(2.5);
        double result = instance.getFrequency();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFrequency method, of class Processor.
     */
    @Test
    public void testSetFrequency() {
        System.out.println("setFrequency");
        double expResult = 2.5;
        instance.setFrequency(2.5);
        double result = instance.getFrequency();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFrequencyUnit method, of class Processor.
     */
    @Test
    public void testGetFrequencyUnit() {
        System.out.println("getFrequencyUnit");
        FrequencyUnit expResult = FrequencyUnit.GIGAHERTZ;
        instance.setFrequencyUnit(FrequencyUnit.GIGAHERTZ);
        FrequencyUnit result = instance.getFrequencyUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFrequencyUnit method, of class Processor.
     */
    @Test
    public void testSetFrequencyUnit() {
        System.out.println("setFrequencyUnit");
        FrequencyUnit expResult = FrequencyUnit.GIGAHERTZ;
        instance.setFrequencyUnit(FrequencyUnit.GIGAHERTZ);
        FrequencyUnit result = instance.getFrequencyUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getManufacturer method, of class Processor.
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
     * Test of setManufacturer method, of class Processor.
     */
    @Test
    public void testSetManufacturer() {
        System.out.println("setManufacturer");
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(Long.valueOf(7));
        instance.setManufacturer(manufacturer);
        Long result = instance.getManufacturer().getId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of getComputers method, of class Processor.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        instance.setId(Long.valueOf(7));
        Computer computer = new Computer();
        computer.setProcessor(instance);
        Long expResult = Long.valueOf(7);
        Long result = computer.getProcessor().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComputers method, of class Processor.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        instance.setId(Long.valueOf(7));
        Computer computer = new Computer();
        computer.setProcessor(instance);
        Long expResult = Long.valueOf(7);
        Long result = computer.getProcessor().getId();
        assertEquals(expResult, result);
    }
    
}
