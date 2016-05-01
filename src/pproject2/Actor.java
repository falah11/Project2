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
public class Actor {
<<<<<<< HEAD
    private String acttorID;
    private String name;
    private Gender gender;
    
    
=======
    
    private String name;
    private Gender gender;
    
>>>>>>> Project-patch-1
    public enum Gender{
     
        M, F
    }
    
<<<<<<< HEAD
    public Actor(String actID , String name, Gender gend){
        
        this.acttorID=actID;       
        this.name= name;
        this.gender= gend;
       
    }
    // getter
    public String getActorID(){
        
        return this.acttorID;
    }
=======
    public Actor( String name, Gender gend){
     
        this.name= name;
        this.gender= gend;
    }
    
    // getter
    
>>>>>>> Project-patch-1
    public String getActorName(){
     
        return this.name;
    }
    
    public Gender getGend(){
     
        return this.gender;
    }
    
    public String GetActINFO(){
     
        return " Actor Name is:"+ getActorName()+ " Gender:"+ getGend();
    }
    
    
    
    
}
