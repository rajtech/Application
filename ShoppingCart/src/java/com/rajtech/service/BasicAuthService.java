/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.service;

import com.rajtech.util.Generator;
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 *
 * @author Rajtech
 */
public class BasicAuthService {
    private Generator guidGenerator = new Generator(); 
    AuthCode ac;
    
    public AuthCode generator(String username, Period validPeriod) {
        if (username == null){
            return new AuthCode();
        }
        return createAuthToken(username,validPeriod);
    }
    private AuthCode createAuthToken(String username,Period validPeriod){
        String code = guidGenerator.generator();
         ac = new AuthCode(code,username,DateTime.now(),DateTime.now().plus(validPeriod));
        return ac;
    }
            
    
}
