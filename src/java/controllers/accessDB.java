/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
 import java.sql.*;
import controllers.processCsv;
/**
 *
 * @author FRANK
 */
public class accessDB {
 
    
    public void storeData(String phoneNumber, String name, String address, String amount){
              // Declare the JDBC objects.
      Connection con = null;
      PreparedStatement query = null;
      
         try{
 Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/cellulant_db", "root", "");
         String SQL = "INSERT INTO users (phone_number, name, amount, address, status) values (?, ?, ?, ?, ?)";
         query = con.prepareStatement(SQL);
         
         query.setInt(5, 7);
         query.setString(4, address);
         query.setString(2, name);
         query.setString(1, phoneNumber);
         query.setString(3, amount);
         query.executeUpdate();
     System.out.println("Inserting data to db!");
    query.close();
    System.out.println("Data base connection closed");
   }
   catch(SQLException sqle) {
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }
    }
    
}
    