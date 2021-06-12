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
public class GraphicsCardTest {
    
    public GraphicsCardTest() {
    }

    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class GraphicsCard.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        GraphicsCard instance = new GraphicsCard();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class GraphicsCard.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        GraphicsCard instance = new GraphicsCard();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class GraphicsCard.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        GraphicsCard instance = new GraphicsCard();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class GraphicsCard.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        GraphicsCard instance = new GraphicsCard();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManufacturer method, of class GraphicsCard.
     */
    @Test
    public void testGetManufacturer() {
        System.out.println("getManufacturer");
        GraphicsCard instance = new GraphicsCard();
        Manufacturer expResult = null;
        Manufacturer result = instance.getManufacturer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setManufacturer method, of class GraphicsCard.
     */
    @Test
    public void testSetManufacturer() {
        System.out.println("setManufacturer");
        Manufacturer manufacturer = null;
        GraphicsCard instance = new GraphicsCard();
        instance.setManufacturer(manufacturer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComputers method, of class GraphicsCard.
     */
    @Test
    public void testGetComputers() {
        System.out.println("getComputers");
        GraphicsCard instance = new GraphicsCard();
        Set<Computer> expResult = null;
        Set<Computer> result = instance.getComputers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComputers method, of class GraphicsCard.
     */
    @Test
    public void testSetComputers() {
        System.out.println("setComputers");
        Set<Computer> computers = null;
        GraphicsCard instance = new GraphicsCard();
        instance.setComputers(computers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
