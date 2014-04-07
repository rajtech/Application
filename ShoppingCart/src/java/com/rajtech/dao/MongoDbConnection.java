/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.dao;
import com.mongodb.*;
import java.net.UnknownHostException;
import java.util.Arrays;
/**
 *
 * @author Rajtech
 */
public class MongoDbConnection {
     public MongoClient mongoClient ;
     public DB db;
     public  DBCollection coll;
     
    public void connectionPool() throws UnknownHostException{
        mongoClient = new MongoClient(Arrays.asList(new ServerAddress("localhost", 27017)
                                      ));
        db = mongoClient.getDB( "shopping" );
        
    }
    public void createCollections(String name){
        
      db.createCollection(name,null);
      System.out.println(db.getCollection(name));
    }
    public void insertCollection(String name, BasicDBObject doc ){
       coll = db.getCollection(name);
        coll.insert(doc);
        
    }
    public void removeCollection(String name, BasicDBObject doc){
        coll = db.getCollection(name);
        coll.remove(doc);
        
    }
    public DBCursor findCollectionByObject(String name, BasicDBObject doc){
        coll = db.getCollection(name);
        DBCursor cursor = coll.find(doc);
        return cursor;
    }
    public DBCursor findCollection(String name){
        coll = db.getCollection(name);
        DBCursor cursor = coll.find();
        return cursor;
    }
    
    
}
