/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.computer;

import lt.viko.eif.eshopapi.constant.Currency;
import lt.viko.eif.eshopapi.model.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Lukas, Karolis, Eimantas, Jonas
 */
public class CreateComputerDTOTest {
    CreateComputerDTO instance = new CreateComputerDTO();
    public CreateComputerDTOTest() {
    }
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class CreateComputerDTO.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "ALIENWARE";
        instance.setName("ALIENWARE");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateComputerDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "ALIENWARE";
        instance.setName("ALIENWARE");
        assertEquals(expResult, instance.getName());
    }

    /**
     * Test of getPrice method, of class CreateComputerDTO.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 900.0;
        instance.setPrice(900.0);
        double result = instance.getPrice();
        assertEquals(expResult, result,0.0 );
    }

    /**
     * Test of setPrice method, of class CreateComputerDTO.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double expResult = 900.0;
        instance.setPrice(900.0);
        assertEquals(expResult, instance.getPrice(), 0.0);
    }

    /**
     * Test of getCurrency method, of class CreateComputerDTO.
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
     * Test of setCurrency method, of class CreateComputerDTO.
     */
    @Test
    public void testSetCurrency() {
        System.out.println("setCurrency");
        Currency expResult = Currency.EUR;
        instance.setCurrency(Currency.EUR);
        assertEquals(expResult, instance.getCurrency());
    }

    /**
     * Test of getStockQuantity method, of class CreateComputerDTO.
     */
    @Test
    public void testGetStockQuantity() {
        System.out.println("getStockQuantity");
        int expResult = 3;
        instance.setStockQuantity(3);
        int result = instance.getStockQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStockQuantity method, of class CreateComputerDTO.
     */
    @Test
    public void testSetStockQuantity() {
        System.out.println("setStockQuantity");
        int expResult = 2;
        instance.setStockQuantity(2);
        assertEquals(expResult, instance.getStockQuantity());
    }

    /**
     * Test of getManufacturerId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetManufacturerId() {
        System.out.println("getManufacturerId");
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(Long.valueOf(7));
        instance.setManufacturerId(manufacturer.getId());
        Long result = instance.getManufacturerId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setManufacturerId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetManufacturerId() {
        System.out.println("setManufacturerId");
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(Long.valueOf(7));
        instance.setManufacturerId(manufacturer.getId());
        Long result = instance.getManufacturerId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of getProcessorId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetProcessorId() {
        System.out.println("getProcessorId");
        Processor processor = new Processor();
        processor.setId(Long.valueOf(7));
        instance.setProcessorId(processor.getId());
        Long result = instance.getProcessorId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setProcessorId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetProcessorId() {
        System.out.println("setProcessorId");
        Processor processor = new Processor();
        processor.setId(Long.valueOf(7));
        instance.setProcessorId(processor.getId());
        Long result = instance.getProcessorId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of getGraphicsCardId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetGraphicsCardId() {
        System.out.println("getGraphicsCardId");
        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setId(Long.valueOf(7));
        instance.setGraphicsCardId(graphicsCard.getId());
        Long result = instance.getGraphicsCardId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setGraphicsCardId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetGraphicsCardId() {
        System.out.println("setGraphicsCardId");
        GraphicsCard graphicsCard = new GraphicsCard();
        graphicsCard.setId(Long.valueOf(7));
        instance.setGraphicsCardId(graphicsCard.getId());
        Long result = instance.getGraphicsCardId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of getMemoryId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetMemoryId() {
        System.out.println("getMemoryId");
        Memory memory = new Memory();
        memory.setId(Long.valueOf(7));
        instance.setMemoryId(memory.getId());
        Long result = instance.getMemoryId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setMemoryId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetMemoryId() {
        System.out.println("setMemoryId");
        Memory memory = new Memory();
        memory.setId(Long.valueOf(7));
        instance.setMemoryId(memory.getId());
        Long result = instance.getMemoryId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of getStorageId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetStorageId() {
        System.out.println("getStorageId");
        Storage storage = new Storage();
        storage.setId(Long.valueOf(7));
        instance.setStorageId(storage.getId());
        Long result = instance.getStorageId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setStorageId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetStorageId() {
        System.out.println("setStorageId");
        Storage storage = new Storage();
        storage.setId(Long.valueOf(7));
        instance.setStorageId(storage.getId());
        Long result = instance.getStorageId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of getMotherboardId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetMotherboardId() {
        System.out.println("getMotherboardId");
        Motherboard motherboard = new Motherboard();
        motherboard.setId(Long.valueOf(7));
        instance.setMotherboardId(motherboard.getId());
        Long result = instance.getMotherboardId();
        assertEquals(Long.valueOf(7), result);
    }

    /**
     * Test of setMotherboardId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetMotherboardId() {
        System.out.println("setMotherboardId");
        Motherboard motherboard = new Motherboard();
        motherboard.setId(Long.valueOf(7));
        instance.setMotherboardId(motherboard.getId());
        Long result = instance.getMotherboardId();
        assertEquals(Long.valueOf(7), result);
    }
    
}
