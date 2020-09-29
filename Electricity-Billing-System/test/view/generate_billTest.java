/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.generate_bill;
import java.awt.event.ActionEvent;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class generate_billTest {
    generate_bill c;
    
     
    
    @Before
    public void setUp() {
        c = new generate_bill();
    }

    /**
     * Test of actionPerformed method, of class generate_bill.
     */
    @Test
    public void testGenerateBill() {
         assertEquals(400,c.generate_bill(100,300));
    }

     
     
     
    
}
