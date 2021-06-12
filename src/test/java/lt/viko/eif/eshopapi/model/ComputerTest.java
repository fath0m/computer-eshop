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
    Computer instance = new Computer();
    public ComputerTest() {
    }

    
    @AfterEach
    public void tearDown() {
        instance = new Computer();
    }

    /**
     * Test of getId method, of class Computer.
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
     * Test of setId method, of class Computer.
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
     * Test of getName method, of class Computer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "COMPUTER";
        instance.setName("COMPUTER");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Computer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "COMPUTER";
        instance.setName("COMPUTER");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Computer.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 200.0;
        instance.setPrice(200.0);
        double result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class Computer.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double expResult = 300.0;
        instance.setPrice(300.0);
        double result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrency method, of class Computer.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("getCurrency");
        Currency expResult = Currency.EUR;
        instance.setCurrency(Currency.EUR);
        Currency result = instance.getCurrency();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCurrency method, of class Computer.
     */
    @Test
    public void testSetCurrency() {
        System.out.println("setCurrency");
        Currency expResult = Currency.EUR;
        instance.setCurrency(Currency.EUR);
        Currency result = instance.getCurrency();
        assertEquals(expResult, result);
    }

    /**
     * Test of getManufacturer method, of class Computer.
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
     * Test of setManufacturer method, of class Computer.
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
     * Test of getProcessor method, of class Computer.
     */
    @Test
    public void testGetProcessor() {
        System.out.println("getProcessor");
        Processor processor = new Processor();
        processor.setId(Long.valueOf(7));
        instance.setProcessor(processor);
        Long result = instance.getProcessor().getId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setProcessor method, of class Computer.
     */
    @Test
    public void testSetProcessor() {
        System.out.println("setProcessor");
        Processor processor = new Processor();
        processor.setId(Long.valueOf(8));
        instance.setProcessor(processor);
        Long result = instance.getProcessor().getId();
        assertEquals(Long.valueOf(8), result);
    }

    /**
     * Test of getGraphicsCard method, of class Computer.
     */
    @Test
    public void testGetGraphicsCard() {
        System.out.println("getGraphicsCard");
        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setId(Long.valueOf(8));
        instance.setGraphicsCard(graphicsCard);
        Long result = instance.getGraphicsCard().getId();
        assertEquals(Long.valueOf(8), result);
    }

    /**
     * Test of setGraphicsCard method, of class Computer.
     */
    @Test
    public void testSetGraphicsCard() {
        System.out.println("setGraphicsCard");
        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setId(Long.valueOf(8));
        instance.setGraphicsCard(graphicsCard);
        Long result = instance.getGraphicsCard().getId();
        assertEquals(Long.valueOf(8), result);
    }

    /**
     * Test of getMemory method, of class Computer.
     */
    @Test
    public void testGetMemory() {
        System.out.println("getMemory");
        Memory memory = new Memory();
        memory.setId(Long.valueOf(8));
        instance.setMemory(memory);
        Long result = instance.getMemory().getId();
        assertEquals(Long.valueOf(8), result);
    }

    /**
     * Test of setMemory method, of class Computer.
     */
    @Test
    public void testSetMemory() {
        System.out.println("setMemory");
        Memory memory = new Memory();
        memory.setId(Long.valueOf(9));
        instance.setMemory(memory);
        Long result = instance.getMemory().getId();
        assertEquals(Long.valueOf(9), result);
    }

    /**
     * Test of getStorage method, of class Computer.
     */
    @Test
    public void testGetStorage() {
        System.out.println("getStorage");
        Storage storage = new Storage();
        storage.setId(Long.valueOf(9));
        instance.setStorage(storage);
        Long result = instance.getStorage().getId();
        assertEquals(Long.valueOf(9), result);
    }

    /**
     * Test of setStorage method, of class Computer.
     */
    @Test
    public void testSetStorage() {
        System.out.println("setStorage");
        Storage storage = new Storage();
        storage.setId(Long.valueOf(9));
        instance.setStorage(storage);
        Long result = instance.getStorage().getId();
        assertEquals(Long.valueOf(9), result);
    }

    /**
     * Test of getMotherboard method, of class Computer.
     */
    @Test
    public void testGetMotherboard() {
        System.out.println("getMotherboard");
        Motherboard motherboard = new Motherboard();
        motherboard.setId(Long.valueOf(9));
        instance.setMotherboard(motherboard);
        Long result = instance.getMotherboard().getId();
        assertEquals(Long.valueOf(9), result);
    }

    /**
     * Test of setMotherboard method, of class Computer.
     */
    @Test
    public void testSetMotherboard() {
        System.out.println("setMotherboard");
        Motherboard motherboard = new Motherboard();
        motherboard.setId(Long.valueOf(10));
        instance.setMotherboard(motherboard);
        Long result = instance.getMotherboard().getId();
        assertEquals(Long.valueOf(10), result);
    }

    /**
     * Test of getStockQuantity method, of class Computer.
     */
    @Test
    public void testGetStockQuantity() {
        System.out.println("getStockQuantity");
        int expResult = 2;
        instance.setStockQuantity(2);
        int result = instance.getStockQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStockQuantity method, of class Computer.
     */
    @Test
    public void testSetStockQuantity() {
        System.out.println("setStockQuantity");
        int expResult = 3;
        instance.setStockQuantity(3);
        int result = instance.getStockQuantity();
        assertEquals(expResult, result);
    }
    
}
