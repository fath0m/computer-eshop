/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.processor;

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
public class CreateProcessorDTOTest {
    
    public CreateProcessorDTOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class CreateProcessorDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CreateProcessorDTO instance = new CreateProcessorDTO();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        CreateProcessorDTO instance = new CreateProcessorDTO();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getCoreAmount method, of class CreateProcessorDTO.
     */
    @Test
    public void testGetCoreAmount() {
        System.out.println("getCoreAmount");
        CreateProcessorDTO instance = new CreateProcessorDTO();
        int expResult = 0;
        int result = instance.getCoreAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoreAmount method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetCoreAmount() {
        System.out.println("setCoreAmount");
        int coreAmount = 0;
        CreateProcessorDTO instance = new CreateProcessorDTO();
        instance.setCoreAmount(coreAmount);
        assertEquals(coreAmount, instance.getCoreAmount());
    }

    /**
     * Test of getThreadAmount method, of class CreateProcessorDTO.
     */
    @Test
    public void testGetThreadAmount() {
        System.out.println("getThreadAmount");
        CreateProcessorDTO instance = new CreateProcessorDTO();
        int expResult = 0;
        int result = instance.getThreadAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setThreadAmount method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetThreadAmount() {
        System.out.println("setThreadAmount");
        int threadAmount = 0;
        CreateProcessorDTO instance = new CreateProcessorDTO();
        instance.setThreadAmount(threadAmount);
        assertEquals(threadAmount, instance.getThreadAmount());
    }

    /**
     * Test of getFrequency method, of class CreateProcessorDTO.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        CreateProcessorDTO instance = new CreateProcessorDTO();
        double expResult = 0.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFrequency method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetFrequency() {
        System.out.println("setFrequency");
        double frequency = 0.0;
        CreateProcessorDTO instance = new CreateProcessorDTO();
        instance.setFrequency(frequency);
        assertEquals(frequency, instance.getFrequency());
    }

    /**
     * Test of getManufacturerId method, of class CreateProcessorDTO.
     */
    @Test
    public void testGetManufacturerId() {
        System.out.println("getManufacturerId");
        CreateProcessorDTO instance = new CreateProcessorDTO();
        Long expResult = null;
        Long result = instance.getManufacturerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturerId method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetManufacturerId() {
        System.out.println("setManufacturerId");
        Long manufacturerId = null;
        CreateProcessorDTO instance = new CreateProcessorDTO();
        instance.setManufacturerId(manufacturerId);
        assertEquals(manufacturerId, instance.getManufacturerId());
    }
    
}
