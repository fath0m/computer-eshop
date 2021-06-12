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
public class ManufacturerTest {
    
    public ManufacturerTest() {
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
     * Test of getId method, of class Manufacturer.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Manufacturer instance = new Manufacturer();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Manufacturer.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Manufacturer instance = new Manufacturer();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Manufacturer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Manufacturer instance = new Manufacturer();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Manufacturer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Manufacturer instance = new Manufacturer();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class Manufacturer.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Manufacturer instance = new Manufacturer();
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class Manufacturer.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        Manufacturer instance = new Manufacturer();
        instance.setCountry(country);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWebsite method, of class Manufacturer.
     */
    @Test
    public void testGetWebsite() {
        System.out.println("getWebsite");
        Manufacturer instance = new Manufacturer();
        String expResult = "";
        String result = instance.getWebsite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWebsite method, of class Manufacturer.
     */
    @Test
    public void testSetWebsite() {
        System.out.println("setWebsite");
        String website = "";
        Manufacturer instance = new Manufacturer();
        instance.setWebsite(website);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComputers method, of class Manufacturer.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        Manufacturer instance = new Manufacturer();
        Set<Computer> expResult = null;
        Set<Computer> result = instance.getComputers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComputers method, of class Manufacturer.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        Set<Computer> computers = null;
        Manufacturer instance = new Manufacturer();
        instance.setComputers(computers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGraphicsCards method, of class Manufacturer.
     */
    @Test
    public void testGetGraphicsCards() {
        System.out.println("getGraphicsCards");
        Manufacturer instance = new Manufacturer();
        Set<GraphicsCard> expResult = null;
        Set<GraphicsCard> result = instance.getGraphicsCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGraphicsCards method, of class Manufacturer.
     */
    @Test
    public void testSetGraphicsCards() {
        System.out.println("setGraphicsCards");
        Set<GraphicsCard> graphicsCards = null;
        Manufacturer instance = new Manufacturer();
        instance.setGraphicsCards(graphicsCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMemories method, of class Manufacturer.
     */
    @Test
    public void testGetMemories() {
        System.out.println("getMemories");
        Manufacturer instance = new Manufacturer();
        Set<Memory> expResult = null;
        Set<Memory> result = instance.getMemories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemories method, of class Manufacturer.
     */
    @Test
    public void testSetMemories() {
        System.out.println("setMemories");
        Set<Memory> memories = null;
        Manufacturer instance = new Manufacturer();
        instance.setMemories(memories);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProcessors method, of class Manufacturer.
     */
    @Test
    public void testGetProcessors() {
        System.out.println("getProcessors");
        Manufacturer instance = new Manufacturer();
        Set<Processor> expResult = null;
        Set<Processor> result = instance.getProcessors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProcessors method, of class Manufacturer.
     */
    @Test
    public void testSetProcessors() {
        System.out.println("setProcessors");
        Set<Processor> processors = null;
        Manufacturer instance = new Manufacturer();
        instance.setProcessors(processors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStorages method, of class Manufacturer.
     */
    @Test
    public void testGetStorages() {
        System.out.println("getStorages");
        Manufacturer instance = new Manufacturer();
        Set<Storage> expResult = null;
        Set<Storage> result = instance.getStorages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStorages method, of class Manufacturer.
     */
    @Test
    public void testSetStorages() {
        System.out.println("setStorages");
        Set<Storage> storages = null;
        Manufacturer instance = new Manufacturer();
        instance.setStorages(storages);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
