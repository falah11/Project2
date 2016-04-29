/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pproject2;

import java.util.HashMap;

/**
 *
 * @author Mohamed
 */
public class Controller {
    
    private static Controller singleton;
    
    private HashMap<String, Movie> movies= new HashMap<String,Movie>();
    private HashMap<String, Customer> customers= new HashMap<String,Customer>();
    private HashMap<String, Rental> rentals= new HashMap<String,Rental>();
    private HashMap<String, Request> requests= new HashMap<String,Request>();
    
    
    private Controller()
    {}
    
    public static Controller instance(){
    
        if(singleton==null){
            
            singleton= new Controller();
        
        }
        return singleton;
        }
    
    // be able to keep track of Movies and Customers as well
    
    
    
    
}
