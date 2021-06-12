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
    Manufacturer instance = new Manufacturer();
    public ManufacturerTest() {
    }
    
    @AfterEach
    public void tearDown() {
        instance = new Manufacturer();
    }

    /**
     * Test of getId method, of class Manufacturer.
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
     * Test of setId method, of class Manufacturer.
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
     * Test of getName method, of class Manufacturer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "MANUFACTURER";
        instance.setName("MANUFACTURER");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Manufacturer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "MANUFACTURER";
        instance.setName("MANUFACTURER");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCountry method, of class Manufacturer.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        String expResult = "LITHUANIA";
        instance.setCountry("LITHUANIA");
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCountry method, of class Manufacturer.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String expResult = "LITHUANIA";
        instance.setCountry("LITHUANIA");
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWebsite method, of class Manufacturer.
     */
    @Test
    public void testGetWebsite() {
        System.out.println("getWebsite");
        String expResult = "www.website.com";
        instance.setWebsite("www.website.com");
        String result = instance.getWebsite();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWebsite method, of class Manufacturer.
     */
    @Test
    public void testSetWebsite() {
        System.out.println("setWebsite");
        String expResult = "www.website.com";
        instance.setWebsite("www.website.com");
        String result = instance.getWebsite();
        assertEquals(expResult, result);
    }

    /**
     * Test of getComputers method, of class Manufacturer.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        instance.setId(Long.valueOf(7));
        Computer computer = new Computer();
        computer.setManufacturer(instance);
        Long expResult = Long.valueOf(7);
        Long result = computer.getManufacturer().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComputers method, of class Manufacturer.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        instance.setId(Long.valueOf(7));
        Computer computer = new Computer();
        computer.setManufacturer(instance);
        Long expResult = Long.valueOf(7);
        Long result = computer.getManufacturer().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGraphicsCards method, of class Manufacturer.
     */
    @Test
    public void testGetGraphicsCards() {
        System.out.println("getGraphicsCards");
        instance.setId(Long.valueOf(7));
        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setManufacturer(instance);
        Long expResult = Long.valueOf(7);
        Long result = graphicsCard.getManufacturer().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGraphicsCards method, of class Manufacturer.
     */
    @Test
    public void testSetGraphicsCards() {
        System.out.println("setGraphicsCards");
        instance.setId(Long.valueOf(5));
        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setManufacturer(instance);
        Long expResult = Long.valueOf(5);
        Long result = graphicsCard.getManufacturer().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMemories method, of class Manufacturer.
     */
    @Test
    public void testGetMemories() {
        System.out.println("getMemories");
        instance.setId(Long.valueOf(7));
        Memory memory = new Memory();
        memory.setManufacturer(instance);
        Long expResult = Long.valueOf(7);
        Long result = memory.getManufacturer().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMemories method, of class Manufacturer.
     */
    @Test
    public void testSetMemories() {
        System.out.println("setMemories");
        instance.setId(Long.valueOf(7));
        Memory memory = new Memory();
        memory.setManufacturer(instance);
        Long expResult = Long.valueOf(7);
        Long result = memory.getManufacturer().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProcessors method, of class Manufacturer.
     */
    @Test
    public void testGetProcessors() {
        System.out.println("getProcessors");
        instance.setId(Long.valueOf(7));
        Processor processor = new Processor();
        processor.setManufacturer(instance);
        Long expResult = Long.valueOf(7);
        Long result = processor.getManufacturer().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProcessors method, of class Manufacturer.
     */
    @Test
    public void testSetProcessors() {
        System.out.println("setProcessors");
        instance.setId(Long.valueOf(7));
        Processor processor = new Processor();
        processor.setManufacturer(instance);
        Long expResult = Long.valueOf(7);
        Long result = processor.getManufacturer().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStorages method, of class Manufacturer.
     */
    @Test
    public void testGetStorages() {
        instance.setId(Long.valueOf(7));
        Storage storage = new Storage();
        storage.setManufacturer(instance);
        Long expResult = Long.valueOf(7);
        Long result = storage.getManufacturer().getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStorages method, of class Manufacturer.
     */
    @Test
    public void testSetStorages() {
        System.out.println("setStorages");
        instance.setId(Long.valueOf(7));
        Storage storage = new Storage();
        storage.setManufacturer(instance);
        Long expResult = Long.valueOf(7);
        Long result = storage.getManufacturer().getId();
        assertEquals(expResult, result);
    }
    
}
