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
public class Review {
    
    private int rating;
    private String review;
    private Rental rent;
    
    public Review( int r, String rev, Rental rent){
        
        this.rating=r;
        this.review=rev;
        this.rent= rent;
    }
    
    public int getRate(){
        
        return this.rating;
    }
    
    public String getReview(){
     
        return this.review;
    }
    
    
}
