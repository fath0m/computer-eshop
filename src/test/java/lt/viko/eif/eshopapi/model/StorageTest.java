/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.model;

import java.util.Set;
import lt.viko.eif.eshopapi.constant.SizeUnit;
import lt.viko.eif.eshopapi.constant.StorageType;
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
public class StorageTest {

    Storage instance = new Storage();

    public StorageTest() {
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
    /**
     * To create new instance after each test
     */

    @AfterEach
    public void tearDown() { instance = new Storage(); }

    /**
     * Test of getId method, of class Storage.
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
     * Test of setId method, of class Storage.
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
     * Test of getName method, of class Storage.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "STORAGE";
        instance.setName("STORAGE");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Storage.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String expResult = "STORAGE";
        instance.setName("STORAGE");
        String result = instance.getName();
        assertEquals(expResult,result);
    }

    /**
     * Test of getAmount method, of class Storage.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        double expResult = 500.0;
        instance.setAmount(500.0);
        double result = instance.getAmount();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAmount method, of class Storage.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double expResult = 200.0;
        instance.setAmount(200.0);
        double result = instance.getAmount();
        assertEquals(expResult,result);

    }

    /**
     * Test of getAmountUnit method, of class Storage.
     */
    @Test
    public void testGetAmountUnit() {
        System.out.println("getAmountUnit");
        SizeUnit expResult = SizeUnit.GIGABYTE;
        instance.setAmountUnit(SizeUnit.GIGABYTE);
        SizeUnit result = instance.getAmountUnit();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAmountUnit method, of class Storage.
     */
    @Test
    public void testSetAmountUnit() {
        System.out.println("setAmountUnit");
        SizeUnit expResult = SizeUnit.MEGABYTE;
        instance.setAmountUnit(SizeUnit.MEGABYTE);
        SizeUnit result = instance.getAmountUnit();
        assertEquals(expResult,result);
    }

    /**
     * Test of getStorageType method, of class Storage.
     */
    @Test
    public void testGetStorageType() {
        System.out.println("getStorageType");
        StorageType expResult = StorageType.SATA_SSD;
        instance.setStorageType(StorageType.SATA_SSD);
        StorageType result = instance.getStorageType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStorageType method, of class Storage.
     */
    @Test
    public void testSetStorageType() {
        System.out.println("setStorageType");
        StorageType expResult = StorageType.HDD;
        instance.setStorageType(StorageType.HDD);
        StorageType result = instance.getStorageType();
        assertEquals(expResult,result);
    }

    /**
     * Test of getManufacturer method, of class Storage.
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
     * Test of setManufacturer method, of class Storage.
     */
    @Test
    public void testSetManufacturer() {
        System.out.println("setManufacturer");
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(Long.valueOf(5));
        instance.setManufacturer(manufacturer);
        Long result = instance.getManufacturer().getId();
        assertEquals(Long.valueOf(5),result);
    }

    /**
     * Test of getComputers method, of class Storage.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        instance.setId(Long.valueOf(7));
        Computer computer = new Computer();
        computer.setStorage(instance);
        Long expResult = Long.valueOf(7);
        Long result = computer.getStorage().getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setComputers method, of class Storage.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        instance.setId(Long.valueOf(5));
        Computer computer = new Computer();
        computer.setStorage(instance);
        Long expResult = Long.valueOf(5);
        Long result = computer.getStorage().getId();
        assertEquals(expResult,result);

    }
    
}
