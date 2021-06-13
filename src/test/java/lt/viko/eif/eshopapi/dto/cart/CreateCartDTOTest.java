/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.viko.eif.eshopapi.dto.cart;

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
public class CreateCartDTOTest {
    
    public CreateCartDTOTest() {
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
     * Test of isCheckedOut method, of class CreateCartDTO.
     */
    @Test
    public void testIsCheckedOut() {
        System.out.println("isCheckedOut");
        CreateCartDTO instance = new CreateCartDTO();
        boolean expResult = false;
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCheckedOut method, of class CreateCartDTO.
     */
    @Test
    public void testSetCheckedOut() {
        System.out.println("setCheckedOut");
        boolean checkedOut = false;
        CreateCartDTO instance = new CreateCartDTO();
        instance.setCheckedOut(checkedOut);
        assertEquals(checkedOut, instance.isCheckedOut());
    }
    
}
