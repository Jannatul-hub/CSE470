/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electricity.model;

/**
 *
 * @author HP
 */
public class person {
    public int getSavings(int income, int expenses){
        return income - expenses;
    }
    public double getTax(int income){
        double taxPay = income*(0.05);
        return taxPay;
    }
      
     
}
