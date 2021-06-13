/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.payment;

import java.sql.Date;
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
public class CreatePaymentDTOTest {

    public CreatePaymentDTOTest() {
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
     * Test of getCheckOutId method, of class CreatePaymentDTO.
     */
    @Test
    public void testGetCheckOutId() {
        System.out.println("getCheckOutId");
        CreatePaymentDTO instance = new CreatePaymentDTO();
        Long expResult = null;
        Long result = instance.getCheckOutId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCheckOutId method, of class CreatePaymentDTO.
     */
    @Test
    public void testSetCheckOutId() {
        System.out.println("setCheckOutId");
        Long checkOutId = null;
        CreatePaymentDTO instance = new CreatePaymentDTO();
        instance.setCheckOutId(checkOutId);
        assertEquals(checkOutId, instance.getCheckOutId());
    }

    /**
     * Test of getAmountPaid method, of class CreatePaymentDTO.
     */
    @Test
    public void testGetAmountPaid() {
        System.out.println("getAmountPaid");
        CreatePaymentDTO instance = new CreatePaymentDTO();
        double expResult = 0.0;
        double result = instance.getAmountPaid();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAmountPaid method, of class CreatePaymentDTO.
     */
    @Test
    public void testSetAmountPaid() {
        System.out.println("setAmountPaid");
        double amountPaid = 0.0;
        CreatePaymentDTO instance = new CreatePaymentDTO();
        instance.setAmountPaid(amountPaid);

        assertEquals(amountPaid, instance.getAmountPaid());
    }

    /**
     * Test of getPaidAt method, of class CreatePaymentDTO.
     */
    @Test
    public void testGetPaidAt() {
        System.out.println("getPaidAt");
        CreatePaymentDTO instance = new CreatePaymentDTO();
        Date expResult = null;
        Date result = instance.getPaidAt();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPaidAt method, of class CreatePaymentDTO.
     */
    @Test
    public void testSetPaidAt() {
        System.out.println("setPaidAt");
        Date paidAt = null;
        CreatePaymentDTO instance = new CreatePaymentDTO();
        instance.setPaidAt(paidAt);
        assertEquals(paidAt, instance.getPaidAt());
    }

}
