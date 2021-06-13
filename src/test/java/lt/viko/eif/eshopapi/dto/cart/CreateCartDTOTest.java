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
 * @author Jonas, Lukas
 */
public class CreateCartDTOTest {
    CreateCartDTO instance = new CreateCartDTO();
    public CreateCartDTOTest() {
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
        boolean expResult = true;
        instance.setCheckedOut(true);
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCheckedOut method, of class CreateCartDTO.
     */
    @Test
    public void testSetCheckedOut() {
        System.out.println("setCheckedOut");
        boolean checkedOut = true;
        instance.setCheckedOut(true);
        assertEquals(checkedOut, instance.isCheckedOut());
    }
    
}
