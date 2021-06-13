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
public class UpdateCheckoutDTOTest {
    
    public UpdateCheckoutDTOTest() {
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
     * Test of isPaidOut method, of class UpdateCheckoutDTO.
     */
    @Test
    public void testIsPaidOut() {
        System.out.println("isPaidOut");
        UpdateCheckoutDTO instance = new UpdateCheckoutDTO();
        boolean expResult = false;
        boolean result = instance.isPaidOut();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPaidOut method, of class UpdateCheckoutDTO.
     */
    @Test
    public void testSetPaidOut() {
        System.out.println("setPaidOut");
        boolean paidOut = false;
        UpdateCheckoutDTO instance = new UpdateCheckoutDTO();
        instance.setPaidOut(paidOut);
        assertEquals(paidOut, instance.isPaidOut());
    }
    
}
