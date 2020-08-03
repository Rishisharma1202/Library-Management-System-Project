/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author Rishi Sharma
 */
public class connection1 {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","rishi");
            return con;
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
             return null;
        }
       
        
    }
    
}
