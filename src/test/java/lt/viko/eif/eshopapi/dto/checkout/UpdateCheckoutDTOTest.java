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
public class UpdateCheckoutDTOTest {
    UpdateCheckoutDTO instance = new UpdateCheckoutDTO();
    public UpdateCheckoutDTOTest() {
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
        boolean expResult = true;
        instance.setPaidOut(true);
        boolean result = instance.isPaidOut();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPaidOut method, of class UpdateCheckoutDTO.
     */
    @Test
    public void testSetPaidOut() {
        System.out.println("setPaidOut");
        boolean expResult = true;
        instance.setPaidOut(true);
        assertEquals(expResult, instance.isPaidOut());
    }
    
}
