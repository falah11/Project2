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
public class Keyword {

   private String name;
   
   public Keyword( String name){
       
       this.name= name;
   }
   
   public String getKeyword(){
    
       return this.name;
   }
   
   public void setKeyword( String name)
   {
    
       this.name= name;
   }
   
}
