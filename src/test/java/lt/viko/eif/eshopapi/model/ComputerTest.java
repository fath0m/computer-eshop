/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.model;

import lt.viko.eif.eshopapi.constant.Currency;
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
public class ComputerTest {
    
    public ComputerTest() {
    }

    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Computer.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Computer instance = new Computer();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Computer.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Computer instance = new Computer();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Computer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Computer instance = new Computer();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Computer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Computer instance = new Computer();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Computer.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Computer instance = new Computer();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Computer.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        Computer instance = new Computer();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrency method, of class Computer.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("getCurrency");
        Computer instance = new Computer();
        Currency expResult = null;
        Currency result = instance.getCurrency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrency method, of class Computer.
     */
    @Test
    public void testSetCurrency() {
        System.out.println("setCurrency");
        Currency currency = null;
        Computer instance = new Computer();
        instance.setCurrency(currency);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManufacturer method, of class Computer.
     */
    @Test
    public void testGetManufacturer() {
        System.out.println("getManufacturer");
        Computer instance = new Computer();
        Manufacturer expResult = null;
        Manufacturer result = instance.getManufacturer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManufacturer method, of class Computer.
     */
    @Test
    public void testSetManufacturer() {
        System.out.println("setManufacturer");
        Manufacturer manufacturer = null;
        Computer instance = new Computer();
        instance.setManufacturer(manufacturer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProcessor method, of class Computer.
     */
    @Test
    public void testGetProcessor() {
        System.out.println("getProcessor");
        Computer instance = new Computer();
        Processor expResult = null;
        Processor result = instance.getProcessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProcessor method, of class Computer.
     */
    @Test
    public void testSetProcessor() {
        System.out.println("setProcessor");
        Processor processor = null;
        Computer instance = new Computer();
        instance.setProcessor(processor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGraphicsCard method, of class Computer.
     */
    @Test
    public void testGetGraphicsCard() {
        System.out.println("getGraphicsCard");
        Computer instance = new Computer();
        GraphicsCard expResult = null;
        GraphicsCard result = instance.getGraphicsCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGraphicsCard method, of class Computer.
     */
    @Test
    public void testSetGraphicsCard() {
        System.out.println("setGraphicsCard");
        GraphicsCard graphicsCard = null;
        Computer instance = new Computer();
        instance.setGraphicsCard(graphicsCard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMemory method, of class Computer.
     */
    @Test
    public void testGetMemory() {
        System.out.println("getMemory");
        Computer instance = new Computer();
        Memory expResult = null;
        Memory result = instance.getMemory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemory method, of class Computer.
     */
    @Test
    public void testSetMemory() {
        System.out.println("setMemory");
        Memory memory = null;
        Computer instance = new Computer();
        instance.setMemory(memory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStorage method, of class Computer.
     */
    @Test
    public void testGetStorage() {
        System.out.println("getStorage");
        Computer instance = new Computer();
        Storage expResult = null;
        Storage result = instance.getStorage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStorage method, of class Computer.
     */
    @Test
    public void testSetStorage() {
        System.out.println("setStorage");
        Storage storage = null;
        Computer instance = new Computer();
        instance.setStorage(storage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotherboard method, of class Computer.
     */
    @Test
    public void testGetMotherboard() {
        System.out.println("getMotherboard");
        Computer instance = new Computer();
        Motherboard expResult = null;
        Motherboard result = instance.getMotherboard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMotherboard method, of class Computer.
     */
    @Test
    public void testSetMotherboard() {
        System.out.println("setMotherboard");
        Motherboard motherboard = null;
        Computer instance = new Computer();
        instance.setMotherboard(motherboard);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStockQuantity method, of class Computer.
     */
    @Test
    public void testGetStockQuantity() {
        System.out.println("getStockQuantity");
        Computer instance = new Computer();
        int expResult = 0;
        int result = instance.getStockQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStockQuantity method, of class Computer.
     */
    @Test
    public void testSetStockQuantity() {
        System.out.println("setStockQuantity");
        int stockQuantity = 0;
        Computer instance = new Computer();
        instance.setStockQuantity(stockQuantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
