/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
//import controllers.accessDB;


/**
 *
 * @author FRANK
 */
public class processCsv {
    

    public String phone;
    public String address;
    public String name;
    public String amount;
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
  public void setAmount(String amount){
      this.amount = amount;
  }
  
    public String getAmount(){
        return this.amount;
    }

}
