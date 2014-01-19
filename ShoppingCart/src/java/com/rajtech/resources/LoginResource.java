/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.resources;

import com.rajtech.dao.UserDaoImpl;
import com.rajtech.exceptions.BasicAuthException;
import com.rajtech.service.AuthCode;
import com.rajtech.service.BasicAuthService;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
@Path("login")
public class LoginResource {

    @Context
    HttpServletRequest request;
    @Context
    HttpServletResponse response;
    HttpSession session;
       private UriInfo context;
    BasicAuthService bas = new BasicAuthService();
    String output = null;
    private URI location;
     Logger logger = Logger.getLogger(LoginResource.class.getName());
     UserDaoImpl udi = new UserDaoImpl();
     public String SUCCESS ="Success";
     /**
     * Creates a new instance of AuthenticateResource
     */
    public LoginResource() {
    }

    /**
     * Retrieves representation of an instance of com.rajtech.resources.AuthenticateResource
     * @return an instance of java.lang.String
     */
    @POST
   // @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
     public Response getUser(@FormParam("username") String  username,@FormParam("password") String  password,@FormParam("sendTo") String  sendto,@FormParam("failureUrl") String  failureurl) throws URISyntaxException, IOException {
        AuthCode ac = new AuthCode();
        System.out.println("Output from Server .... \n");
        session = request.getSession();
        java.util.Date date = new java.util.Date();
        boolean isExists = udi.isUserExists(username, password);
        System.out.println(isExists);
        if(!isExists){
            if(failureurl == null || failureurl.isEmpty()){
                  failureurl ="http://localhost:8080/ShoppingCart/error.htm";
              }
             location = new URI(failureurl);
               return Response.temporaryRedirect(location).build();  
        }
        ac = bas.generator(username, 1);
       if (ac.getCode() == null) {
            request.setAttribute("errorMessage", BasicAuthException.USERNAME_ISEMPTY);
              Logger.getLogger(AuthenticateResource.class.getName()).log(Level.ERROR, BasicAuthException.USERNAME_ISEMPTY);
              if(failureurl == null || failureurl.isEmpty()){
                  failureurl ="http://localhost:8080/ShoppingCart/error.htm";
              }
             location = new URI(failureurl);

             response.sendError(401,BasicAuthException.USERNAME_ISEMPTY);
               return Response.temporaryRedirect(location).build();  
        } else {
            
            session.setAttribute("loginstatus", this.SUCCESS);
            session.setAttribute("access_token", ac.getCode());
            session.setAttribute("username",username);
            Cookie cookie = new Cookie("access_token", ac.getCode());
            
            response.addCookie(cookie);
              Logger.getLogger(AuthenticateResource.class.getName()).log(Level.INFO, BasicAuthException.AccessToken_Generated);
              if(sendto == null || sendto.isEmpty()){
                  sendto ="http://localhost:8080/ShoppingCart/success.htm";
              }
              location = new URI(sendto);
               return Response.temporaryRedirect(location).build();  
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
