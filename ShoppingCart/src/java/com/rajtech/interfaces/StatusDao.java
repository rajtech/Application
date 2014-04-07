/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.interfaces;

import com.rajtech.entity.Status;
import java.util.ArrayList;

/**
 *
 * @author Rajtech
 */
public interface StatusDao {
    public void addStatus(Status status);
    public ArrayList listStatusById(int status_id);
    public ArrayList listStatus();
    public void deleteStatus(int status_id);
            
    
}
