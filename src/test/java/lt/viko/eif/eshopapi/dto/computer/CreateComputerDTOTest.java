/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.computer;

import lt.viko.eif.eshopapi.constant.Currency;
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
public class CreateComputerDTOTest {
    
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
        CreateComputerDTO instance = new CreateComputerDTO();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CreateComputerDTO.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getPrice method, of class CreateComputerDTO.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        CreateComputerDTO instance = new CreateComputerDTO();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrice method, of class CreateComputerDTO.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setPrice(price);
        assertEquals(price, instance.getPrice());
    }

    /**
     * Test of getCurrency method, of class CreateComputerDTO.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("getCurrency");
        CreateComputerDTO instance = new CreateComputerDTO();
        Currency expResult = null;
        Currency result = instance.getCurrency();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCurrency method, of class CreateComputerDTO.
     */
    @Test
    public void testSetCurrency() {
        System.out.println("setCurrency");
        Currency currency = null;
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setCurrency(currency);
        assertEquals(currency, instance.getCurrency());
    }

    /**
     * Test of getStockQuantity method, of class CreateComputerDTO.
     */
    @Test
    public void testGetStockQuantity() {
        System.out.println("getStockQuantity");
        CreateComputerDTO instance = new CreateComputerDTO();
        int expResult = 0;
        int result = instance.getStockQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStockQuantity method, of class CreateComputerDTO.
     */
    @Test
    public void testSetStockQuantity() {
        System.out.println("setStockQuantity");
        int stockQuantity = 0;
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setStockQuantity(stockQuantity);
        assertEquals(stockQuantity, instance.getStockQuantity());
    }

    /**
     * Test of getManufacturerId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetManufacturerId() {
        System.out.println("getManufacturerId");
        CreateComputerDTO instance = new CreateComputerDTO();
        Long expResult = null;
        Long result = instance.getManufacturerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setManufacturerId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetManufacturerId() {
        System.out.println("setManufacturerId");
        Long manufacturerId = null;
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setManufacturerId(manufacturerId);
        assertEquals(manufacturerId, instance.getManufacturerId());
    }

    /**
     * Test of getProcessorId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetProcessorId() {
        System.out.println("getProcessorId");
        CreateComputerDTO instance = new CreateComputerDTO();
        Long expResult = null;
        Long result = instance.getProcessorId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProcessorId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetProcessorId() {
        System.out.println("setProcessorId");
        Long processorId = null;
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setProcessorId(processorId);
        assertEquals(processorId, instance.getProcessorId());
    }

    /**
     * Test of getGraphicsCardId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetGraphicsCardId() {
        System.out.println("getGraphicsCardId");
        CreateComputerDTO instance = new CreateComputerDTO();
        Long expResult = null;
        Long result = instance.getGraphicsCardId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGraphicsCardId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetGraphicsCardId() {
        System.out.println("setGraphicsCardId");
        Long graphicsCardId = null;
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setGraphicsCardId(graphicsCardId);
        assertEquals(graphicsCardId, instance.getGraphicsCardId());
    }

    /**
     * Test of getMemoryId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetMemoryId() {
        System.out.println("getMemoryId");
        CreateComputerDTO instance = new CreateComputerDTO();
        Long expResult = null;
        Long result = instance.getMemoryId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMemoryId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetMemoryId() {
        System.out.println("setMemoryId");
        Long memoryId = null;
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setMemoryId(memoryId);
        assertEquals(memoryId, instance.getMemoryId());
    }

    /**
     * Test of getStorageId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetStorageId() {
        System.out.println("getStorageId");
        CreateComputerDTO instance = new CreateComputerDTO();
        Long expResult = null;
        Long result = instance.getStorageId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStorageId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetStorageId() {
        System.out.println("setStorageId");
        Long storageId = null;
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setStorageId(storageId);
        assertEquals(storageId, instance.getStorageId());
    }

    /**
     * Test of getMotherboardId method, of class CreateComputerDTO.
     */
    @Test
    public void testGetMotherboardId() {
        System.out.println("getMotherboardId");
        CreateComputerDTO instance = new CreateComputerDTO();
        Long expResult = null;
        Long result = instance.getMotherboardId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMotherboardId method, of class CreateComputerDTO.
     */
    @Test
    public void testSetMotherboardId() {
        System.out.println("setMotherboardId");
        Long motherboardId = null;
        CreateComputerDTO instance = new CreateComputerDTO();
        instance.setMotherboardId(motherboardId);
        assertEquals(motherboardId, instance.getMotherboardId());
    }
    
}
