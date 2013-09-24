/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.interfaces;

import com.rajtech.entity.User;
import java.util.ArrayList;

/**
 *
 * @author Rajtech
 */
public interface UserDao {
    public ArrayList<User> getAllUser();
   public ArrayList<User> getUserById(int userid);
   public void updateUser(User user);
   public void deleteUSer(String[]userid);
   public void addUser(User Uuser);
   public boolean isUserExists(String username,String password);
    
}
