/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.dao;

import com.mongodb.BasicDBObject;
import com.rajtech.dao.MongoDbConnection;
import java.net.UnknownHostException;

/**
 *
 * @author Rajtech
 */
public class MongoCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        // TODO code application logic here
        MongoDbConnection mdc = new MongoDbConnection();
        BasicDBObject doc = new BasicDBObject();
        mdc.connectionPool();
        System.out.println(mdc.mongoClient.getDatabaseNames());
        mdc.createCollections("user");
        doc.append("username", "Admin");
        doc.append("password", "Admin");
        mdc.insertCollection("user", doc);
        
        
    }
}
