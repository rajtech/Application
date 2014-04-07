/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rajtech
 */
@XmlRootElement
public class Status {
    private int status_id;
    private String statusName;

    public Status() {
    }

    public Status(int status_id, String statusName) {
        this.status_id = status_id;
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }
               
    
}
