/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pproject2;

<<<<<<< HEAD
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map.Entry;
import pproject2.Movie.Language;
import pproject2.Movie.Type;
import pproject2.Rental.ReturnType;
import pproject2.Rental.Status;
=======
import java.util.HashMap;
>>>>>>> Project-patch-1

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
    
<<<<<<< HEAD
    // be able to keep track of Movies and Customers and rental and request as well
    
    //Movie(String id, Type rate, String gen, int yr,String name,Language lang,DVD dvd,Actor act,Keyword ky)
    
    public Movie addMovie(String id,Type type,String gen,int year,String name,DVD dvd,Language lang,Actor actor,Keyword kwd ){
        
       Movie movie= new Movie(id);
       
       movies.put(id, movie);
       
       return movie;
    }
    
    public Customer addCustomer( String em, String add,String ph, String pass, String name){
        
        Customer cust= new Customer(em,add,ph,pass,name);
        
        customers.put(em, cust);
        
        return cust;
    }
    
    public Movie findMovie(String ID){
        
        Movie mov = new Movie(ID);
        
        for(Entry<String,Movie> entry: movies.entrySet()){
            
            if(entry.getKey().contains(ID)){
                
                mov=entry.getValue();
            }
        }
        return mov;
    }
    
    public Customer findCustomer(String email){
        
        Customer cust= new Customer(email);
        
        for(Entry<String,Customer> entry: customers.entrySet()){
            
            if(entry.getKey().contains(email)){
                
                cust= entry.getValue();
            }
        }
        return cust;
    }
    
    public void addRental(Calendar rtDate,Calendar returnDate, Rental.Status st,DVD dvd,Customer cust,Rental.ReturnType ret, String movID){
      
        // find the moviie that customer want to rent
        
        Movie movie= findMovie(movID);
        Customer customer= findCustomer(cust.getEmail());
        
        if(movie!=null && customer !=null){
            
            //DVD d;
            //d.getDVDInfo();
            //for(Entry<String,Movie> entry: movies.entrySet()){
                
                //DVD dvd= entry.getKey().contains(dvd.getDVDInfo());
                Rental rent = new Rental( rtDate, returnDate,  st, dvd, cust, ret, movID) ;  
       
                rentals.put(cust.getEmail(), rent);
        }
      
       }
       public void addRequest(Calendar reqDate,String movID,Customer cust){
           
           Request req = new Request(reqDate,movID,cust);
           
            Movie movie= findMovie(movID);
            Customer customer= findCustomer(cust.getEmail());
            
            if(movie==null){
                
                requests.put(movID, req);
            }
            
       }    
    
    }


    
=======
    // be able to keep track of Movies and Customers as well
    
    
    
    
}
>>>>>>> Project-patch-1
