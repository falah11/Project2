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
public class Customer implements Searchable {
    
    private String email;
    private String address;
    private String phone;
    private String passwd;
    private String name;
    
    public Customer( String em, String add,String ph, String pass, String name){
        
        this.email=em;
        this.address= add;
        this.passwd=pass;
        this.name=name;
    
    }
    
<<<<<<< HEAD
    public Customer(String email){
        
        this.email=email;
    }
    
=======
>>>>>>> Project-patch-1
    public String getCustName(){
     
        return this.name;
    }
    
    public String getEmail(){
     
        return this.email;
    }
    
    public String getAdd(){
     
        return this.address;
    }
    
    public String getPh(){
     
        return this.phone;
    }
    
    public void setName(String name){
        
        this.name=name;
    }
    
    public void setEmail(String emal){
     
        this.email=emal;
    }

    @Override
    public boolean contains(String k) {
        return(this.getEmail().equalsIgnoreCase(k)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String INFO() {
        return "Custome Name :"+ this.getCustName()+ "Customer E-mail is:"+ this.getEmail(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
    

