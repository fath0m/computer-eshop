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
 * @author Jonas, Eimantas
 */
public class CreateProcessorDTOTest {

    CreateProcessorDTO instance = new CreateProcessorDTO();

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
        String expResult = "name";
        instance.setName("name");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "name";
        instance.setName("name");
        assertEquals(expResult, instance.getName());
    }

    /**
     * Test of getCoreAmount method, of class CreateProcessorDTO.
     */
    @Test
    public void testGetCoreAmount() {
        System.out.println("getCoreAmount");
        int expResult = 1;
        instance.setCoreAmount(1);
        int result = instance.getCoreAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCoreAmount method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetCoreAmount() {
        System.out.println("setCoreAmount");
        int coreAmount = 1;
        instance.setCoreAmount(1);
        assertEquals(coreAmount, instance.getCoreAmount());
    }

    /**
     * Test of getThreadAmount method, of class CreateProcessorDTO.
     */
    @Test
    public void testGetThreadAmount() {
        System.out.println("getThreadAmount");
        int expResult = 1;
        instance.setThreadAmount(1);
        int result = instance.getThreadAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setThreadAmount method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetThreadAmount() {
        System.out.println("setThreadAmount");
        int expResult = 1;
        instance.setThreadAmount(1);
        assertEquals(expResult, instance.getThreadAmount());
    }

    /**
     * Test of getFrequency method, of class CreateProcessorDTO.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        double expResult = 1.0;
        instance.setFrequency(1.0);
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setFrequency method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetFrequency() {
        System.out.println("setFrequency");
        double expResult = 1.0;

        instance.setFrequency(1.0);
        double result = instance.getFrequency();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of getManufacturerId method, of class CreateProcessorDTO.
     */
    @Test
    public void testGetManufacturerId() {
        System.out.println("getManufacturerId");
        Long expResult = Long.valueOf(1);
        instance.setManufacturerId(Long.valueOf(1));
        Long result = instance.getManufacturerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturerId method, of class CreateProcessorDTO.
     */
    @Test
    public void testSetManufacturerId() {
        System.out.println("setManufacturerId");
        Long expResult = Long.valueOf(1);

        instance.setManufacturerId(Long.valueOf(1));
        assertEquals(expResult, instance.getManufacturerId());
    }
    
}
