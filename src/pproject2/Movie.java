/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pproject2;

<<<<<<< HEAD
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
=======
>>>>>>> Project-patch-1
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import static java.util.Spliterators.iterator;
<<<<<<< HEAD
import pproject2.Actor.Gender;
=======
>>>>>>> Project-patch-1
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
<<<<<<< HEAD
    private Actor actor;
    private Keyword keywd;

   
    
=======
    private Keyword keywd;
>>>>>>> Project-patch-1
    
   

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
     
<<<<<<< HEAD
        G,PG, PG_13,R
=======
        G,PG, PG13,R
>>>>>>> Project-patch-1
    }
    
    private HashMap<String,Actor> actors = new HashMap<String,Actor>();// list of actors in Movie
    private HashMap<String,DVD> dvds= new HashMap<String,DVD>();// list of dvd for each Movie
    private HashMap<String,Keyword> keywds= new HashMap<String,Keyword>();// list of keyword for a Movie
    
<<<<<<< HEAD
    public Movie(String id, Type rate, String gen, int yr,String name,Language lang,DVD dvd,Actor act,Keyword ky){
=======
    public Movie(String id, Type rate, String gen, int yr,String name, DVD dvd,Keyword ky,Language lang){
>>>>>>> Project-patch-1
        this.ID=id; 
        this.rating=rate;
        this.genre= gen;
        this.year=yr;
<<<<<<< HEAD
        this.name=name;
        this.language=lang;
        this.dvd= dvd;
        this.actor=act;
        this.keywd=ky;
       
       
    }
    
    public Movie(String id){
        
        this.ID=id;
=======
        this.dvd= dvd;
        this.keywd=ky;
        this.language=lang;
       
>>>>>>> Project-patch-1
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
            
<<<<<<< HEAD
            if(entry.getKey().equalsIgnoreCase(SN)){
=======
            if(entry.getValue().equals(SN)){
>>>>>>> Project-patch-1
                
                dvds.remove(SN);
            }
            
        }
    }
    
<<<<<<< HEAD
    public DVD findDVD(String SN, boolean lst, Position pos){
        
        DVD d= new DVD(SN, lst,pos);
        for(Entry<String,DVD> entry: dvds.entrySet()){
            
            if(entry.getKey().contains(SN)){
                
                d= entry.getValue();
            }
            
        }
        return d;
    }
    
    public Actor addActor(String ID, String name, Gender gen){
        
        Actor act = new Actor(ID, name, gen);
        
        actors.put(ID, act);
        
        return act;
    }
    
    public Actor findActor (String ID, String name, Gender gen){
        
        Actor act= new Actor(ID, name,  gen);
        for(Entry<String,Actor> entry: actors.entrySet()){
            
            if(entry.getKey().contains(ID)){
                
              act=entry.getValue();
            }
        }
        
        return act;
    }

    public Keyword addKeyword(String k){
        
        Keyword kwd= new Keyword(k);
        
        for(Entry<String,Keyword> entry:keywds.entrySet() ){
            
            if(entry.getKey().equalsIgnoreCase(GetMovieName().trim().substring(0))){
                
                kwd=entry.getValue();
            }
        }
        return kwd;
    }
    
    
=======
    public DVD findDVD(String SN, boolean lst, Posti
            
            
            tion pos){
        
        DVD d= new DVD()
    }
>>>>>>> Project-patch-1

}

    
    
 





    

