/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity.model;

import Electricity.model.person;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class personTest {
    person p;
    
     
    
    @Before
    public void setUp(){
        System.out.println("it is in setUp");
        p = new person ();
    }

    /**
     * Test of getSavings method, of class person.
     */
    @Test
    public void testGetSavings() {
                 
        assertEquals(500, p.getSavings(1000, 500));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetTax(){
        assertEquals(50, p.getTax(1000),0);
        
    }

      
    
     
    
}
