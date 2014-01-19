/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.service;

import java.util.Date;
import org.joda.time.DateTime;

/**
 *
 * @author Rajtech
 */
public class AuthCode  {
    private String code;
    private Date validPeriod;
    private Date expiry;
    private String username;

    public AuthCode() {
    }

    public AuthCode(String code,String username, Date validPeriod, Date expiry) {
        this.code = code;
        this.validPeriod = validPeriod;
        this.expiry = expiry;
        this.username= username;
        
    }

    public String getUsername() {
        return username;
    }

    public String getCode() {
        return code;
    }

    public Date getExpiry() {
        return expiry;
    }

    public Date getValidPeriod() {
        return validPeriod;
    }


    
    
}
