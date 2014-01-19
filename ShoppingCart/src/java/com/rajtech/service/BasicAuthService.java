/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.service;

import com.rajtech.util.Generator;
import org.joda.time.DateTime;
import org.joda.time.Period;
import com.rajtech.dao.AuthCodeDaoImpl;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author Rajtech
 */
public class BasicAuthService {
    private Generator guidGenerator = new Generator(); 
    AuthCode ac;
    AuthCodeDaoImpl acdi = new AuthCodeDaoImpl();
    
    public AuthCode generator(String username, int validPeriod) {
        if (username == null){
            return new AuthCode();
        }
        return createAuthToken(username,validPeriod);
    }
    private AuthCode createAuthToken(String username,int validPeriod){
        String code = guidGenerator.generator();
        DateFormat currentDate = DateFormat.getDateInstance();
        Date d = new Date();
        d.setTime(d.getTime() + validPeriod * 1000 * 60 * 60 * 24);
        Date addedDate1 = d; 
         ac = new AuthCode(code,username,new Date(),addedDate1);
         acdi.addAuthCode(ac);
        return ac;
    }
    public static Date addDays(Date d, int days)
    {
        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
        return d;
    }
            
    
}
