/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.interfaces;

import com.rajtech.service.AuthCode;
import java.util.ArrayList;

/**
 *
 * @author Rajtech
 */
public interface AuthCodeDao {

   public void addAuthCode(AuthCode authCode);
   public boolean resolveAuthCode(AuthCode authCode);
    
    
}
