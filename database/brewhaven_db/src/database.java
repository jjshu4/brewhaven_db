/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JJ
 */
import java.sql.*;


public class database {
    
   public static void main (String[] args){
       String url="jdbc.mysql://localhost:3306/brewhaven_db";
       String username="root";
       String password="";
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           Connection connection= DriverManager.getConnection(url, url, password);
           
           Statement statement=connection.createStatement();
           
           ResultSet resultSet=statement.executeQuery(url"select * from beverages");
           ResultSet resultSet=statement.executeQuery("select * from pastries");
           
           while (resultSet.next())}
       
                System.out.println(resultSet.getInt(column ));
           }
           
           
           
           
           
       }
       
       catch (Exception e){
           System.out.println(e);
       }
   }

    
}
