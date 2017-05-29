package com.sd.dao.v0;
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class DaoMainV0{
  public static void main(String args[]) {
    Connection conn = null;
    Statement stmt = null;
    
    try {
      String path = System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
//      conn = DriveManager.getConnection("jdbc:mysql://localhost/test,"root","111111");
      conn = DriverManager.getConnection(
                                        prop.getProperty("URL"),
                                        prop.getProperty("USER"),
                                        prop.getProperty("PASSWORD")
      );
      Statement stst = conn.createStatement();
      String mySql ="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT.";
      mySql +="name varchar (255) NOT NULL. address varchar(255) NOT NUL. UNIQUE (id)";
    }
    catch(Exception e){
      e.printStackTrace();
    }
   finally {
            try {
                if(stmt != null) stmt.close();
            } catch (Exception e) {};
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {};
        }
  }
}