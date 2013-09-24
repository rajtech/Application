/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.util;

import java.util.UUID;

/**
 *
 * @author Rajtech
 */
public class Generator {
    public String generator(){
        
        return UUID.randomUUID().toString();
    }
    
}
