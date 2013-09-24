/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.dao;

import com.mysql.jdbc.Connection;
import com.rajtech.exceptions.DatabaseException;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
/**
 *
 * @author Rajtech
 */
public class DatabaseConnection {
        public Connection conn = null;

    public void connectionPool(){
    
           try
           {
               String userName = "root";
               String password = "root";
               String url = "jdbc:mysql://localhost:3306/accounts";
               Class.forName ("com.mysql.jdbc.Driver").newInstance ();
               conn = (Connection) DriverManager.getConnection (url, userName, password);
               Logger.getLogger(DatabaseConnection.class.getName()).log(Level.ERROR, DatabaseException.DATABASE_CONNECTED);
               //System.out.println ("Database connection established");
           }
           catch (Exception e)
           {
                  Logger.getLogger(DatabaseConnection.class.getName()).log(Level.ERROR, DatabaseException.DATABASE_NOT_CONNECTED +",Error :DB101", e);
               
           }
    }
      public void conectionClose() throws SQLException{
        conn.close();
    }
}
   
