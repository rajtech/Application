/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.dao;

import com.mysql.jdbc.Statement;
import com.rajtech.entity.User;
import com.rajtech.interfaces.UserDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author Rajtech
 */
public class UserDaoImpl implements UserDao {

    ArrayList<User> user;
    DatabaseConnection dbc = new DatabaseConnection();
    Statement stm = null;

    @Override
    public ArrayList<User> getAllUser() {
        try {
            user = new ArrayList<User>();
            dbc.connectionPool();
            stm = (Statement) dbc.conn.createStatement();
            stm.executeQuery("select * from user  order by username asc");
            ResultSet rs = stm.getResultSet();
            while (rs.next()) {
                user.add(new User(rs.getInt("userid"), rs.getString("username"), rs.getString("password"), rs.getDate("datecreated"), rs.getDate("datemodified"), rs.getInt("statusid"), rs.getString("createdby"), rs.getString("modifiedby")));
            }
            rs.close();
            stm.close();
            dbc.conectionClose();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.ERROR, "GetAllUser", ex);
        }


        return user;
    }

    @Override
    public ArrayList<User> getUserById(int userid) {
        try {
            user = new ArrayList<User>();
            dbc.connectionPool();
            stm = (Statement) dbc.conn.createStatement();
            stm.executeQuery("select * from user  where userid=" + userid);
            ResultSet rs = stm.getResultSet();
            while (rs.next()) {
                user.add(new User(rs.getInt("userid"), rs.getString("username"), rs.getString("password"), rs.getDate("datecreated"), rs.getDate("datemodified"), rs.getInt("statusid"), rs.getString("createdby"), rs.getString("modifiedby")));
            }
            rs.close();
            stm.close();
            dbc.conectionClose();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.ERROR, "GetUserById", ex);
        }


        return user;
    }

    @Override
    public void updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteUSer(String[] userid) {
        try {
            dbc.connectionPool();
            stm = (Statement) dbc.conn.createStatement();
            for (int i = 0; i < userid.length; i++) {

                stm.execute("delete from user where userid=" + userid[i]);
            }
            stm.close();
            dbc.conectionClose();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.ERROR, "Delete User", ex);
        }
    }

    @Override
    public void addUser(User user) {
        try {
            dbc.connectionPool();
            stm = (Statement) dbc.conn.createStatement();
            String SqlQuery = "insert into user(userid,username,password,datecreated,datemodified,statusid,createdby,modifiedby) values(null,'" + user.getUserName() + "','" + user.getPassword() + "','" + user.getDateCreated() + "','" + user.getDateModified() + "'," + user.getStatusId() + ",'" + user.getCreatedBy() + "','" + user.getModfiedBy() + "')";
            stm.execute(SqlQuery);
            stm.close();
            dbc.conectionClose();

        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.ERROR, "Add User", ex);
        }
    }

    @Override
    public boolean isUserExists(String username, String password) {
        Integer isExists =0;
        try {
            
            dbc.medicalConnectionPool();
            stm = (Statement) dbc.conn.createStatement();
            String SqlQuery = "select count(*)as count from user where username ='"+username+"' and password ='"+password+"'";
            stm.execute(SqlQuery); 
             ResultSet rs = stm.getResultSet();
            while (rs.next()) {
                isExists = rs.getInt("count"); 
                System.out.println(isExists);
            }
            stm.close();
            dbc.conectionClose();

        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.ERROR, "Add User", ex);
        }
        if (isExists > 0) {
            return true;
        }

        return false;
    }
}
