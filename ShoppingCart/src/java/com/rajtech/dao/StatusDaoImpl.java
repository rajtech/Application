/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBCollection;
import com.rajtech.entity.Status;
import com.rajtech.interfaces.StatusDao;
import java.net.UnknownHostException;
import java.util.ArrayList;

/**
 *
 * @author Rajtech
 */
public class StatusDaoImpl implements StatusDao{
      ArrayList<Status> status = new ArrayList();
    MongoDbConnection mdc = new MongoDbConnection();
    BasicDBObject query;
    DBCursor cursor;
    DBCollection coll ;

    @Override
    public void addStatus(Status status) {
        try {

            mdc.connectionPool();
            query = new BasicDBObject("StatusName", status.getStatusName());
            query.append("StatusId", status.getStatus_id());
            mdc.insertCollection("Status", query);
            

        } catch (UnknownHostException ex) {
            java.util.logging.Logger.getLogger(StatusDaoImpl.class.getName()).log(java.util.logging.Level.SEVERE, "Add Status", ex);
        }
    }

    @Override
    public ArrayList<Status> listStatusById(int status_id) {
     try {

            mdc.connectionPool();
            try{
            cursor = mdc.findCollection("Status");
                while (cursor.hasNext()) {
                    System.out.println();
                     status.add(new Status(Integer.parseInt(cursor.next().get("StatusId").toString()), cursor.next().get("StatusName").toString()));
                    
                }
            } finally {
                cursor.close();
            }
        } catch (UnknownHostException ex) {
            java.util.logging.Logger.getLogger(StatusDaoImpl.class.getName()).log(java.util.logging.Level.SEVERE, "Add Status", ex);
        }
     return status;
    }

    @Override
    public ArrayList<Status> listStatus() {
        
      try {
            mdc.connectionPool();
            
            try {
               cursor = mdc.findCollection("Status");
                while (cursor.hasNext()) {
                    System.out.println();
                     status.add(new Status(Integer.parseInt(cursor.next().get("StatusId").toString()), cursor.next().get("StatusName").toString()));
                    
                }
            } finally {
                cursor.close();
            }

        } catch (UnknownHostException ex) {
            java.util.logging.Logger.getLogger(StatusDaoImpl.class.getName()).log(java.util.logging.Level.SEVERE, "Get Status", ex);
        }
      return status;

    }

    @Override
    public void deleteStatus(int status_id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
