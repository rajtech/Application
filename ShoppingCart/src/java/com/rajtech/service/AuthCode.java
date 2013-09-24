/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.service;

import org.joda.time.DateTime;

/**
 *
 * @author Rajtech
 */
public class AuthCode  {
    private String code;
    private DateTime validPeriod;
    private DateTime expiry;
    private String username;

    public AuthCode() {
    }

    public AuthCode(String code,String username, DateTime validPeriod, DateTime expiry) {
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

    public DateTime getExpiry() {
        return expiry;
    }

    public DateTime getValidPeriod() {
        return new DateTime(validPeriod);
    }


    
    
}
