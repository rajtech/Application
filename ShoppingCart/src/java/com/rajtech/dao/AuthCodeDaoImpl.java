/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mysql.jdbc.Statement;
import com.rajtech.entity.User;
import com.rajtech.interfaces.AuthCodeDao;
import com.rajtech.service.AuthCode;
import java.net.UnknownHostException;
import java.util.ArrayList;

/**
 *
 * @author Rajtech
 */
public class AuthCodeDaoImpl implements AuthCodeDao {

    ArrayList<AuthCode> authCode;
    MongoDbConnection mdc = new MongoDbConnection();
    BasicDBObject query;
    DBCursor cursor;

    @Override
    public void addAuthCode(AuthCode authCode) {
        try {

            mdc.connectionPool();
            query = new BasicDBObject("code", authCode.getCode());
            query.append("validPeriod", authCode.getValidPeriod());
            query.append("expiry", authCode.getExpiry().toString());
            query.append("username", authCode.getUsername());
            mdc.insertCollection("authCode", query);

        } catch (UnknownHostException ex) {
            java.util.logging.Logger.getLogger(AuthCodeDaoImpl.class.getName()).log(java.util.logging.Level.SEVERE, "Add AuthCode", ex);
        }
    }

    @Override
    public void resolveAuthCode(String authCode) {
        try {
            mdc.connectionPool();
            query = new BasicDBObject("code", authCode);
            try {
                cursor = mdc.findCollection("authCode", query);
                while (cursor.hasNext()) {
                    System.out.println(cursor.next());
                }
            } finally {
                cursor.close();
            }

        } catch (UnknownHostException ex) {
            java.util.logging.Logger.getLogger(AuthCodeDaoImpl.class.getName()).log(java.util.logging.Level.SEVERE, "Get AuthCode", ex);
        }

    }
}
