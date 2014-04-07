<%-- 
    Document   : login
    Created on : Aug 25, 2013, 4:37:19 PM
    Author     : Rajtech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include  page="/admin/common/header.jsp" />
<div id="content">
  <div class="box" style="width: 400px; min-height: 300px; margin-top: 40px; margin-left: auto; margin-right: auto;">
    <div class="heading">
      <h1><img src="image/lockscreen.png" alt="" /> Please enter your login details.</h1>
    </div>
    <div class="content" style="min-height: 150px; overflow: hidden;">
        <% if(session.getAttribute("loginstatus")=="Success") { %>
      <div class="success">Success</div>
      <% } %>
      <% if(session.getAttribute("loginstatus")!="Success" && session.getAttribute("loginstatus")!= null) { %>
      <div class="warning"> <%= session.getAttribute("loginstatus") %></div>
      <% } %>
      <form action="resource/login" method="post"  id="form">
        <table style="width: 100%;">
          <tr>
            <td style="text-align: center;" rowspan="4"><img src="image/login.png" alt="Please enter your login details." /></td>
          </tr>
          <tr>
            <td>Username:<br />
              <input type="text" name="username" value="" style="margin-top: 4px;" />
              <br />
              <br />
              Password:<br />
              <input type="password" name="password" value="" style="margin-top: 4px;" />
              <br />
             <input type="hidden" name="sendTo" value="http://localhost:8080/ShoppingCart/admin/jsp/home.jsp">
             <input type="hidden" name="failureUrl" value="http://localhost:8080/ShoppingCart/admin/jsp/error.jsp"> 
              <a href="Success">Forgotten Password</a></td>
          </tr>
          <tr>
            <td>&nbsp;</td>
          </tr>
          <tr>
              <td style="text-align: right;">
                  
                  <a onclick="$('#form').submit();" class="button">Login</a></td>
          </tr>
        </table>
        <?php if ($redirect) { ?>
        <input type="hidden" name="redirect" value="Success" />
        <?php } ?>
      </form>
    </div>
  </div>
</div>
<script type="text/javascript"><!--
$('#form input').keydown(function(e) {
	if (e.keyCode == 13) {
		$('#form').submit();
	}
});
//--></script> 
<tiles:insert page="footer.jsp" />
