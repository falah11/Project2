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
public class Request implements Searchable  {
    
    private Calendar requestDate;
    private Calendar responseDate;
    private Reqstatus status;
    private ReqType reqtype;
    private String movID;
    private Movie movie;
    private Customer customer;

    @Override
    public boolean contains(String k) {
        return (customer.getEmail().equalsIgnoreCase(k)|| movie.GetMovieName().equalsIgnoreCase(k)) ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String INFO() {
        return "Request Date is:"+ this.getReqDate()+ "Response Date is:"+ this.getRespDate(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum Reqstatus{
        AVAILABLE, NOT_AVALIABLE
     
        
    }
    
    public enum ReqType{
    
        BY_MAIL, GOTO_SHOP
    }
     public Request (Calendar reqDate,Calendar respDate, Reqstatus st,ReqType req,String mov,Customer cust){
      
         this.requestDate=reqDate;
         this.responseDate=respDate;
         this.status=st;
         this.reqtype=req;
         this.movID=mov;
         this.customer=cust;
     
     }
     
     public Request (Calendar reqDate,String mov,Customer cust){
         
         this.requestDate=reqDate;
         this.movID=mov;
         this.customer=cust;
     }
     
     public String getReqDate()
     {
         SimpleDateFormat formatter= new SimpleDateFormat("E,y-m-d 'at'h:m:s az");
      String rqdate= formatter.format(this.requestDate.getTime());// to change from calendar to date.
        
       return rqdate; 
         
     }
     
     public String getRespDate()
     {
         SimpleDateFormat formatter= new SimpleDateFormat("E,y-m-d 'at'h:m:s az");
      String resdate= formatter.format(this.responseDate.getTime());// to change from calendar to date.
        
       return resdate; 
         
     }
     
      public String getCust(){
     
        return customer.INFO();
    }
     
    public String getMovieInfo()
    {
        return this.getMovieInfo();
        
    }
    
    
}
