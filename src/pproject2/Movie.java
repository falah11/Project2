/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pproject2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import static java.util.Spliterators.iterator;
import pproject2.DVD.Position;

/**
 *
 * @author Mohamed
 */
public class Movie implements Searchable {
    
    private String ID;
    private Type rating;
    private String genre;
    private int year;
    private String name;
    private Language language;
    private DVD dvd;
    private Keyword keywd;
    
   

    @Override
    public boolean contains(String k) {
       return(getMovieID().equalsIgnoreCase(k));
       
       
    }
    
    @Override
    public String INFO() {
       return "Movie name :"+ this.name+ "Movie Rate :"+this.rating ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public enum Language{
     
        English, French, Spanish
    }
    public enum Type{
     
        G,PG, PG13,R
    }
    
    private HashMap<String,Actor> actors = new HashMap<String,Actor>();// list of actors in Movie
    private HashMap<String,DVD> dvds= new HashMap<String,DVD>();// list of dvd for each Movie
    private HashMap<String,Keyword> keywds= new HashMap<String,Keyword>();// list of keyword for a Movie
    
    public Movie(String id, Type rate, String gen, int yr,String name, DVD dvd,Keyword ky,Language lang){
        this.ID=id; 
        this.rating=rate;
        this.genre= gen;
        this.year=yr;
        this.dvd= dvd;
        this.keywd=ky;
        this.language=lang;
       
    }
    public String getMovieID(){
     
        return this.ID;
    }
    
    public String GetMovieName(){
     
        return this.name;
    }
     public Type getMovieType(){
      
         return this.rating;
     }
     
    
    public DVD addDVD(String SN, boolean lst, Position pos){
        
        DVD d = new DVD(SN,lst, pos);
        
        dvds.put(SN, d);
        return d;
    }
    
    public void removeDVD(String SN){
        
        for(Entry<String,DVD> entry:dvds.entrySet()){
            
            if(entry.getValue().equals(SN)){
                
                dvds.remove(SN);
            }
            
        }
    }
    
    public DVD findDVD(String SN, boolean lst, Posti
            
            
            tion pos){
        
        DVD d= new DVD()
    }

}

    
    
 





    

