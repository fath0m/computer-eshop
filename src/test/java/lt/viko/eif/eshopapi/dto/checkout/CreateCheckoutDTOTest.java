/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.checkout;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonas, Lukas, Eimantas, Karolis
 */
public class CreateCheckoutDTOTest {
    CreateCheckoutDTO instance = new CreateCheckoutDTO();
    public CreateCheckoutDTOTest() {
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
     * Test of getFirstName method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        String expResult = "FIRSTNAME";
        instance.setFirstName("FIRSTNAME");
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String expResult = "BIG";
        instance.setFirstName("BIG");
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastName method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        String expResult = "LASTNAME";
        instance.setLastName("LASTNAME");
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String expResult = "LASTNAME";
        instance.setLastName("LASTNAME");
        assertEquals(expResult, instance.getLastName());
    }

    /**
     * Test of getDeliveryAddress method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetDeliveryAddress() {
        System.out.println("getDeliveryAddress");
        String expResult = "JUSTINISKES";
        instance.setDeliveryAddress("JUSTINISKES");
        String result = instance.getDeliveryAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryAddress method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetDeliveryAddress() {
        System.out.println("setDeliveryAddress");
        String expResult = "JUSTINISKES";
        instance.setDeliveryAddress("JUSTINISKES");
        assertEquals(expResult, instance.getDeliveryAddress());
    }

    /**
     * Test of getDeliveryCity method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetDeliveryCity() {
        System.out.println("getDeliveryCity");
        String expResult = "vilnius";
        instance.setDeliveryCity("vilnius");
        String result = instance.getDeliveryCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryCity method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetDeliveryCity() {
        System.out.println("setDeliveryCity");
        String expResult = "vilnius";
        instance.setDeliveryCity("vilnius");
        assertEquals(expResult, instance.getDeliveryCity());
    }

    /**
     * Test of getDeliveryCountry method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetDeliveryCountry() {
        System.out.println("getDeliveryCountry");
        String expResult = "LIETUVA";
        instance.setDeliveryCountry("LIETUVA");
        String result = instance.getDeliveryCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryCountry method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetDeliveryCountry() {
        System.out.println("setDeliveryCountry");
        String expResult = "LIETUVA";
        instance.setDeliveryCountry("LIETUVA");
        assertEquals(expResult, instance.getDeliveryCountry());
    }

    /**
     * Test of getCardId method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetCardId() {
        System.out.println("getCardId");
        Long expResult = Long.valueOf(2);
        instance.setCardId(Long.valueOf(2));
        Long result = instance.getCardId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCardId method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetCardId() {
        System.out.println("setCardId");
        Long expResult = Long.valueOf(2);
        instance.setCardId(Long.valueOf(2));
        assertEquals(expResult, instance.getCardId());
    }
    
}
