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
    
    private String name;
    private Gender gender;
    
    public enum Gender{
     
        M, F
    }
    
    public Actor( String name, Gender gend){
     
        this.name= name;
        this.gender= gend;
    }
    
    // getter
    
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
