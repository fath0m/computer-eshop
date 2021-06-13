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

    CreatePaymentDTO instance = new CreatePaymentDTO();

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

        Long expResult = Long.valueOf(1);
        instance.setCheckOutId(Long.valueOf(1));
        Long result = instance.getCheckOutId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCheckOutId method, of class CreatePaymentDTO.
     */
    @Test
    public void testSetCheckOutId() {
        System.out.println("setCheckOutId");
        Long checkOutId = Long.valueOf(1);

        instance.setCheckOutId(Long.valueOf(1));
        assertEquals(checkOutId, instance.getCheckOutId());
    }

    /**
     * Test of getAmountPaid method, of class CreatePaymentDTO.
     */
    @Test
    public void testGetAmountPaid() {
        System.out.println("getAmountPaid");

        double expResult = 1.0;
        instance.setAmountPaid(1.0);
        double result = instance.getAmountPaid();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAmountPaid method, of class CreatePaymentDTO.
     */
    @Test
    public void testSetAmountPaid() {
        System.out.println("setAmountPaid");
        double amountPaid = 1.0;

        instance.setAmountPaid(1.0);

        assertEquals(amountPaid, instance.getAmountPaid(),0.0);
    }

    /**
     * Test of getPaidAt method, of class CreatePaymentDTO.
     */
    @Test
    public void testGetPaidAt() {
        System.out.println("getPaidAt");
        String str = "2020-05-06";
        Date expResult = Date.valueOf(str);
        instance.setPaidAt(expResult);
        Date result = instance.getPaidAt();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPaidAt method, of class CreatePaymentDTO.
     */
    @Test
    public void testSetPaidAt() {
        System.out.println("setPaidAt");
        String str = "2020-05-06";
        Date result = Date.valueOf(str);
        instance.setPaidAt(result);
        assertEquals(result, instance.getPaidAt());
    }

}
