/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.dao;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
/**
 *
 * @author Rajtech
 */
public class MongoDbConnection {
     MongoClient mongoClient ;
     DB db;
     DBCollection coll ;
     
    public void connectionPool() throws UnknownHostException{
        mongoClient = new MongoClient(Arrays.asList(new ServerAddress("localhost", 27017),
                                      new ServerAddress("localhost", 27018),
                                      new ServerAddress("localhost", 27019)));
        db = mongoClient.getDB( "accounts" );
        coll = db.getCollection("testCollection");
    }
    
}
