/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.resources;

import com.rajtech.exceptions.BasicAuthException;
import com.rajtech.service.AuthCode;
import com.rajtech.service.BasicAuthService;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.joda.time.Period;

/**
 * REST Web Service
 *
 * @author Rajtech
 */
@Path("Auth")
public class AuthenticateResource {

    @Context
    HttpServletRequest request;
    @Context
    HttpServletResponse response;
    HttpSession session;
       private UriInfo context;
    BasicAuthService bas = new BasicAuthService();
    String output = null;
    private URI location;
     Logger logger = Logger.getLogger(AuthenticateResource.class.getName());
    /**
     * Creates a new instance of AuthenticateResource
     */
    public AuthenticateResource() {
    }

    /**
     * Retrieves representation of an instance of com.rajtech.resources.AuthenticateResource
     * @return an instance of java.lang.String
     */
    @POST
   // @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@FormParam("username") String  username) throws URISyntaxException {
        AuthCode ac = new AuthCode();
        System.out.println("Output from Server .... \n");
        session = request.getSession();
        java.util.Date date = new java.util.Date();
        ac = bas.generator(username, Period.days(1));
        if (ac.getCode() == null) {
            request.setAttribute("errorMessage", BasicAuthException.USERNAME_ISEMPTY);
              Logger.getLogger(AuthenticateResource.class.getName()).log(Level.ERROR, BasicAuthException.USERNAME_ISEMPTY);
             return Response.ok("{\"error\":\""+BasicAuthException.USERNAME_ISEMPTY + "\"}").build();
        } else {
            
            session.setAttribute("loginstatus", BasicAuthException.AccessToken_Generated);
            session.setAttribute("access_token", ac.getCode());
            Cookie cookie = new Cookie("access_token", ac.getCode());
            response.addCookie(cookie);
              Logger.getLogger(AuthenticateResource.class.getName()).log(Level.ERROR, BasicAuthException.AccessToken_Generated);
               return Response.ok("{\"access_token\":\""+ac.getCode()+"\"}").build();  
          }
     
    }

    /**
     * PUT method for updating or creating an instance of AuthenticateResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
