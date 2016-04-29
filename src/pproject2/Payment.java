/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pproject2;

/**
 *
 * @author Mohamed
 */
public class Payment {
    
    private double amount;
    private PaymentMethod pmt;
  
    
    public enum PaymentMethod{
        CASH,CREDIT
        
    }
  public Payment(double amt, PaymentMethod pmt){
      
      this.amount=amt;
      this.pmt=pmt;
  }  
  
  public double getAmount(){
      
      return this.amount;
  }
}
