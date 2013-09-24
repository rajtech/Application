/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.service;

import com.rajtech.util.Generator;
import java.net.UnknownHostException;
import org.joda.time.DateTime;
import org.joda.time.Period;

/**
 *
 * @author Rajtech
 */
public class BasicAuthService {
    private Generator guidGenerator = new Generator(); 
    
    public AuthCode generator(String username, Period validPeriod) throws UnknownHostException{
        return createAuthToken(username,validPeriod);
    }
    private AuthCode createAuthToken(String username,Period validPeriod) throws UnknownHostException{
        String code = guidGenerator.generator();
        AuthCode ac = new AuthCode(code,username,DateTime.now(),DateTime.now().plus(validPeriod));
        return ac;
    }
            
    
}
