/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity.model;

import Electricity.model.pay_bill;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class pay_billTest {
    pay_bill b;
    
    
     
    
    @Before
    public void setUp() {
        b= new pay_bill();
    }

    /**
     * Test of main method, of class pay_bill.
     */
    @Test
    public void testpayBill() {
         assertEquals(900, b.payBill(500,400));
    }
    
}
