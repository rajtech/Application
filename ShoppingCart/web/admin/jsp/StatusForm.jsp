<%-- 
    Document   : StatusForm
    Created on : Apr 1, 2013, 8:02:08 PM
    Author     : Rajtech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="statuslists" class="com.rajtech.db.Status" scope="session">
    <jsp:setProperty name="statuslists" property="*"/>
</jsp:useBean>
<%
        
        String statusid = request.getParameter("statusId");
        if (statusid==null){
            ArrayList statuslist = new ArrayList();
            statuslist.add(statuslists);
            pageContext.setAttribute("statuslist", statuslist);
            pageContext.setAttribute("action", "Add");
        }
    %>

<!DOCTYPE html>
<%@include file="/admin/header.jsp" %>
<div id="content">
    <div class="box">
        <div class="heading">
            <h1><img src="/admin/image/category.png" alt="" /> Status</h1>
            <div class="buttons"><a onclick="$('#form').submit();" class="button">Save</a><a onclick="location = 'StatusData?route=catalog/status&action=Search'" class="button">Cancel</a></div>
        </div>
        <div class="content">
        <form action="StatusData?route=catalog/Unit&action=${action}" method="post"  id="form">
         <table id="option-value0" class="list">
              <thead>
                <tr>
                  <td class="left">Status:</td>
                  <td></td>
                </tr>
              </thead>
              <c:forEach var="liststatus" items="${statuslist}">
                  <tbody id="option-value-row0">
                <tr>
                    <td class="left"><input type="text" name="statusId" value="${liststatus.getStatusID()}"  readonly="" placeholder="Enter Unit ID"/></td>
                    <td class="left"><input type="text" name="statusdesc" value="<c:out value='${liststatus.getStatusDesc()}'  default="" />"  placeholder="Enter Status"/></td>
                    
                </tr>
                  </tbody>
              </c:forEach>
            </table>
</form>
   </div>
    </div>
</div> 
<%@include file="/admin/footer.jsp" %>
 