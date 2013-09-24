/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.entity;


import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rajtech
 */
@XmlRootElement
public class User {
    int UserId;
    String UserName;
    String Password;
    Date DateCreated;
    Date DateModified;
    int StatusId;
    String CreatedBy;
    String ModfiedBy;
    public User() {
    }

    public User(int UserId, String UserName, String Password, Date DateCreated, Date DateModified, int StatusId, String CreatedBy, String ModfiedBy) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.Password = Password;
        this.DateCreated = DateCreated;
        this.DateModified = DateModified;
        this.StatusId = StatusId;
        this.CreatedBy = CreatedBy;
        this.ModfiedBy = ModfiedBy;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date DateCreated) {
        this.DateCreated = DateCreated;
    }

    public Date getDateModified() {
        return DateModified;
    }

    public void setDateModified(Date DateModified) {
        this.DateModified = DateModified;
    }

    public String getModfiedBy() {
        return ModfiedBy;
    }

    public void setModfiedBy(String ModfiedBy) {
        this.ModfiedBy = ModfiedBy;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getStatusId() {
        return StatusId;
    }

    public void setStatusId(int StatusId) {
        this.StatusId = StatusId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    
    
    
}
