<%-- 
    Document   : Accounts
    Created on : Jul 27, 2012, 7:31:42 AM
    Author     : Rajtech
--%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<%@include file="/admin/header.jsp" %>
<div id="content">
    <div class="box">
        <div class="heading">
            <h1><img src="/admin/image/category.png" alt="" /> Status</h1>
            <div class="buttons"><a onclick="location = 'StatusForm.jsp?route=catalog/status'" class="button">Insert</a><a onclick="$('#form').submit();" class="button">Delete</a></div>
        </div>
        <div class="content">
            <form action="StatusData?route=catalog/status&action=Delete" method="post"  id="form">
                <table class="list">
                    <thead>
                        <tr>
                            <td width="1" style="text-align: center;"><input type="checkbox" onclick="$('input[name*=\'selected\']').attr('checked', this.checked);" /></td>
                            <td class="left">Status Description</td>
                            <td class="left">Status</td>
                            <td class="right">Action</td>
                        </tr>
                    </thead> 
                    <tbody>
                        <c:if test="${statuslist !=null}">

                            <c:forEach var="status" items="${statuslist}" varStatus="rowCounter">

                                <tr>


                                    <td style="text-align: center;">
                                        <input type="checkbox" name="selected" value="${status.getStatusID()}" />
                                         
                                    </td>
                                        <td class="left">${status.getStatusDesc()}</td>
                                        
                                        <td class="left"></td>
                                    
                                     <td class="right">
                                    
                                        [ <a href="StatusData?route=catalog/status&action=find&statusId=${status.getStatusID()}">Edit</a> ]
                                            
                                        </td>
                                </tr>
                            </c:forEach>
                        </c:if>
                        <c:if test="${statuslist ==null}">
                            <tr>
                                <td class="center" colspan="4">No Result</td>
                            </tr>
                        </c:if>
                 
                    </tbody>
                </table>
            </form>
        </div>
    </div>
</div>

<%@include file="/admin/footer.jsp" %>
