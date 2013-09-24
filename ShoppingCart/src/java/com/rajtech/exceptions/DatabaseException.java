/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.exceptions;

/**
 *
 * @author Rajtech
 */
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajtech
 */
public class DatabaseException extends SQLException {

    public static String DATABASE_NOT_CONNECTED = "Database Not Connected";
    public static String DATABASE_CONNECTED = "Database connection established";
    
    public DatabaseException(String reason, String SQLState) {
        super(reason, SQLState);
    }
    
    public static void thorwDbException(String reason,String SQLState) {
        try {
            throw new DatabaseException(reason,SQLState);
        } catch (DatabaseException ex) {
            Logger.getLogger(DatabaseException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
