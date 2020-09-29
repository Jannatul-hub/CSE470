/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.calculate_bill;
import java.awt.event.ActionEvent;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class calculate_billTest {
    calculate_bill c;
    
    
     
    
    @Before
    public void setUp() throws Exception {
        c= new calculate_bill();
    }

    /**
     * Test of actionPerformed method, of class calculate_bill.
     */
    @Test
    public void testCalculate_bill() {
         assertEquals(1000, c.cal_bill(500,300,200));
    }

         
}
