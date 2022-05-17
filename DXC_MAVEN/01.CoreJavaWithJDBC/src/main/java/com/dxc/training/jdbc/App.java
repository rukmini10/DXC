
package com.dxc.training.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

//to show all records of student table from dxcdb
public class App 
{
    public static void main( String[] args )
    {
     final String url="jdbc:mysql://localhost:3306/";
     final String dbname="dxcdb";
     final String userid="root";
     final String password="Mysql@2710";
     
     //1. declaring references
     Connection con=null;
     Statement stmt=null;
     ResultSet rs=null;
    
     try {
      //2. Loading and registring driver with driver manager
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.print("\nDriver registered");
      
      //3. Creating new connection
      con=DriverManager.getConnection(url+dbname,userid,password);
      System.out.print("\nConnection created");
      
      //4. create statement
      stmt=con.createStatement();
      System.out.print("\nStatement creted");

 //5. Write query to execute
      String query="select * from student";
      
      //6. Execute Query
      rs=stmt.executeQuery(query);
      System.out.print("\nStatement executed");
      
      //7. Displaying rs data
      System.out.print("\nRollNo \t Name \t Stream \t AvgMarks");
      while(rs.next()) {
       System.out.print("\n"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t  "
         +rs.getFloat(4));
      }
     
     }catch(Exception e) {
      e.printStackTrace();
     }
    }
}

