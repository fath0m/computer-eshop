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
 * @author Jonas
 */
public class CreateCheckoutDTOTest {
    
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
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        instance.setFirstName(firstName);
        assertEquals(firstName, instance.getFirstName());
    }

    /**
     * Test of getLastName method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        instance.setLastName(lastName);
        assertEquals(lastName, instance.getLastName());
    }

    /**
     * Test of getDeliveryAddress method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetDeliveryAddress() {
        System.out.println("getDeliveryAddress");
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        String expResult = "";
        String result = instance.getDeliveryAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryAddress method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetDeliveryAddress() {
        System.out.println("setDeliveryAddress");
        String deliveryAddress = "";
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        instance.setDeliveryAddress(deliveryAddress);
        assertEquals(deliveryAddress, instance.getDeliveryAddress());
    }

    /**
     * Test of getDeliveryCity method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetDeliveryCity() {
        System.out.println("getDeliveryCity");
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        String expResult = "";
        String result = instance.getDeliveryCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryCity method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetDeliveryCity() {
        System.out.println("setDeliveryCity");
        String deliveryCity = "";
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        instance.setDeliveryCity(deliveryCity);
        assertEquals(deliveryCity, instance.getDeliveryCity());
    }

    /**
     * Test of getDeliveryCountry method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetDeliveryCountry() {
        System.out.println("getDeliveryCountry");
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        String expResult = "";
        String result = instance.getDeliveryCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDeliveryCountry method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetDeliveryCountry() {
        System.out.println("setDeliveryCountry");
        String deliveryCountry = "";
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        instance.setDeliveryCountry(deliveryCountry);
        assertEquals(deliveryCountry, instance.getDeliveryCountry());
    }

    /**
     * Test of getCardId method, of class CreateCheckoutDTO.
     */
    @Test
    public void testGetCardId() {
        System.out.println("getCardId");
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        Long expResult = null;
        Long result = instance.getCardId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCardId method, of class CreateCheckoutDTO.
     */
    @Test
    public void testSetCardId() {
        System.out.println("setCardId");
        Long cardId = null;
        CreateCheckoutDTO instance = new CreateCheckoutDTO();
        instance.setCardId(cardId);
        assertEquals(cardId, instance.getCardId());
    }
    
}
