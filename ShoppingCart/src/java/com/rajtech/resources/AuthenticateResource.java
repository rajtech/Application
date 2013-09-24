/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajtech.resources;

import com.rajtech.service.AuthCode;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.joda.time.Period;

/**
 * REST Web Service
 *
 * @author Rajtech
 */
@Path("Auth")
public class AuthenticateResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AuthenticateResource
     */
    public AuthenticateResource() {
    }

    /**
     * Retrieves representation of an instance of com.rajtech.resources.AuthenticateResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/xml")
    public Response getUser() throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException, ServletException, URISyntaxException {
        AuthCode ac = new AuthCode();
        System.out.println("Output from Server .... \n");
        session = request.getSession();
        java.util.Date date = new java.util.Date();
        ac = bas.generator(request.getParameter("username"), Period.days(1));
        if (ac.getCode().isEmpty()) {
            request.setAttribute("errorMessage", "This is error!!");
            request.getRequestDispatcher("report.jsp").forward(request, response);
        } else {
            
            session.setAttribute("loginstatus", "Success");
            session.setAttribute("access_token", ac.getCode());
            
            location = new URI("http://localhost:8080/Accounts/admin/home.jsp");
          }
        return Response.temporaryRedirect(location).build();
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
