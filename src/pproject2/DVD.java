/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pproject2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Mohamed
 */
public class DVD {
    
    
    private String serialNO;
    private boolean lost;
    private Position position;
    
    public enum Position{
     RENTED, NOTRENTED   
    }
    
    public DVD ( String SN, boolean lst, Position pos){
     
        this.serialNO= SN;
        this.lost=lst;
        this.position= pos;
    }
    
    public String getSerialNO(){
     return serialNO;   
    }
    
    public boolean isLost(){
        
        return lost;
    }
     public void setPosion( Position pos){
      
         
         this.position=pos;
     }
     
     public void setLost( boolean lst){
      
         this.lost=lst;
     }
     
     public String getDVDInfo(){
      
         return " DVD serialNO :"+ this.serialNO+ " is Found :"+ this.lost+" its Status or Position :"+ this.position;
         
     }
     
     
     
}


    

