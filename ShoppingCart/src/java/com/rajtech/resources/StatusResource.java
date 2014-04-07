/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.resources;

import com.rajtech.dao.StatusDaoImpl;
import com.rajtech.dao.UserDaoImpl;
import com.rajtech.entity.Status;
import com.rajtech.service.AuthCode;
import com.rajtech.service.BasicAuthService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;

/**
 * REST Web Service
 *
 * @author Rajtech
 */
@Path("status")
public class StatusResource {
 @Context
    HttpServletRequest request;
    @Context
    HttpServletResponse response;
    HttpSession session;
       private UriInfo context;
    BasicAuthService bas = new BasicAuthService();
    ArrayList<Status> status = new ArrayList();
    String output = null;
    private URI location;
     Logger logger = Logger.getLogger(LoginResource.class.getName());
     StatusDaoImpl sdi = new StatusDaoImpl();
    /**
     * Creates a new instance of StatusResource
     */
    public StatusResource() {
    }

    /**
     * Retrieves representation of an instance of com.rajtech.resources.StatusResource
     * @return an instance of javax.ws.rs.core.Response
     */
    @GET
    @Produces("application/json")
    public List<Status> getStatus() {
       status =sdi.listStatus();
       if (status.isEmpty())
               return null;
       else
       return status;
    }

    /**
     * PUT method for updating or creating an instance of StatusResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    //@Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    public void addStatus(@FormParam("statusname") String  statusname,@FormParam("id") String  id) {
        Status status = new Status();
     status.setStatus_id(Integer.parseInt(id));   
     status.setStatusName(statusname);
        sdi.addStatus(status);
    }
}
