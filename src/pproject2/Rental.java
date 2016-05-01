/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pproject2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Mohamed
 */
public class Rental implements Searchable {
    
    private Calendar rentDate;
    private Calendar returnDate;
    private Status status;
    private DVD dvd;
    private Customer customer;
<<<<<<< HEAD
    private String rating;//
    private String review;
    private ReturnType retrn;
    private String movieID;
    
    //private int Customerrate;

    

=======
    private Review rev;//
    private ReturnType retrn;
    //private int Customerrate;

>>>>>>> Project-patch-1
    @Override
    public boolean contains(String k) {
        return( dvd.getSerialNO().equalsIgnoreCase(k)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String INFO() {
        return "RentDate is:"+ this.getRentDate()+ "Rutrn Date is:"+this.getReturnDate(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum Status {
     RENTED, NOTRENTED   
    }
    public enum ReturnType{
     
    DROPPING, SHIPPING
    
}
    
<<<<<<< HEAD
    public Rental(Calendar rtDate,Calendar rtrnDate, Status st,DVD dvd,Customer cust,ReturnType ret,String movID){
=======
    public Rental(Calendar rtDate,Calendar rtrnDate, Status st,DVD dvd,Customer cust,ReturnType ret, Review rev ){
>>>>>>> Project-patch-1
     
        this.rentDate= rtDate;
        this.returnDate= rtrnDate;
        this.status=st;
        this.dvd=dvd;
        this.customer=cust;
        this.retrn=ret;
<<<<<<< HEAD
        this.movieID=movID;
        
        
=======
        this.rev=rev;
>>>>>>> Project-patch-1
    }
    
    public String getRentDate()
    {
      SimpleDateFormat formatter= new SimpleDateFormat("E,y-m-d 'at'h:m:s az");
      String rtdate= formatter.format(this.rentDate.getTime());// to change from calendar to date.
        
       return rtdate; 
    }
    
    public String getReturnDate()
    {
        SimpleDateFormat formatter= new SimpleDateFormat("E,y-m-d 'at'h:m:s az");
      String rturndate= formatter.format(this.returnDate.getTime());// to change from calendar to date.
        
       return rturndate; 
       
    }
    
    public void setReturnDate( Calendar newRetDate)
    {
        
        this.returnDate=newRetDate;
    }
    
    public String getCustomer()
    {
        
        
        return customer.getCustName();
    }
    
    public String getCust(){
     
        return customer.INFO();
    }
    


    public String getDVD(){
        
        return dvd.getDVDInfo();
    }
    
    public  String getReview(){
        
        return this.getReview();
    }
    
    
    
}
