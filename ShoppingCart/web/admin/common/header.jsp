<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
        <base href="http://localhost:8080/ShoppingCart/admin/" />

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link type="text/css" href="javascript/jquery/css/blitzer/jquery-ui-1.8.23.custom.css" rel="stylesheet" />
		<script type="text/javascript" src="javascript/jquery/js/jquery-1.8.0.min.js"></script>
                
		<script type="text/javascript" src="javascript/jquery/js/jquery-ui-1.8.23.custom.min.js"></script>
                
<script>
	$(function() {
		$( "#datepicker" ).datepicker();
	});
	</script>
    
		

<script type="text/javascript" src="javascript/jquery/tabs.js"></script>

<script type="text/javascript" src="javascript/jquery/superfish/js/superfish.js"></script>
        <title>Administrator</title>
        <script type="text/javascript">
//-----------------------------------------
// Confirm Actions (delete, uninstall)
//-----------------------------------------
$(document).ready(function(){
    // Confirm Delete
    $('#form').submit(function(){
        if ($(this).attr('action').indexOf('delete',1) != -1) {
            if (!confirm('Delete/Uninstall cannot be undone! Are you sure you want to do this?')) {
                return false;
            }
        }
    });
    	
    // Confirm Uninstall
    $('a').click(function(){
        if ($(this).attr('href') != null && $(this).attr('href').indexOf('uninstall', 1) != -1) {
            if (!confirm('Delete/Uninstall cannot be undone! Are you sure you want to do this?')) {
                return false;
            }
        }
    });
});
</script>

    </head>
    <body >
        <div id="contenter"> 
            <div id="header">
                <div class="div1">
                  <div class="div2"><img src="image/logo.png" title="Administration" onclick="location = '#'" /></div>
                  <% 
                    
                    if(session.getAttribute("loginstatus")== "Success" && session.getAttribute("loginstatus") != null){%>
                  <div class="div3"><img src="image/lock.png" alt="" style="position: relative; top: 3px;" />&nbsp;&nbsp;You are logged in as <span> <%= session.getAttribute("username")%></span> </div>
                    <% }%>
               </div>
                <% if (session.getAttribute("loginstatus") == "Success" && session.getAttribute("loginstatus") != null) {%>
            <div id="menu">
                <ul class="left" >
                    <li id="dashboard" ><a href="home.jsp" name="home" class="top">Dashboard</a></li>
                  <li id="masters"><a class="top">Catalog</a>
                    <ul>
                        <li><a href="Product.jsp?route=catalog/products">Products</a></li>
                        <li><a href="Flavours.jsp?route=catalog/flavours">Flavours</a></li>
                        <li><a href="UnitData?route=catalog/units&action=Search">Units</a></li>
                        <li><a href="Dosage.jsp?route=catalog/dosage">Dosage</a></li>
                        <li><a href="resources/status?route=catalog/status&action=Search">Status</a></li>
                        <li><a href="Storage.jsp?route=catalog/storage">Storage</a></li>
                        
                        <li><a href="Ledgers.jsp?route=catalog/ledgers">Ledgers</a></li>
                   
                        </ul>
                    </li>
                    <li id="Settings"><a class="top">Settings</a>
                    <ul>
                        <li><a href="Company.jsp?route=setting/company">Company</a></li>
                        
                   
                        </ul>
                    </li>
                </ul>
                <ul class="right" style="display: block;">
                    <li id="store"><a onclick="window.open('http://localhost:8080/ShoppingCart/');" class="top">Store Front</a>
                     <ul style="display: none; visibility: hidden;"></ul>
                     </li>
                     <li id="store"><a class="top" href="http://localhost/uploadindex.php?route=common/logout&amp;token=adc363e615be6d9ee468403e94d8a1fd">Logout</a></li>
                </ul>
                  <script type="text/javascript"><!--
$(document).ready(function() {
	$('#menu > ul').superfish({
		hoverClass	 : 'sfHover',
		pathClass	 : 'overideThisToUse',
		delay		 : 0,
		animation	 : {height: 'show'},
		speed		 : 'normal',
		autoArrows   : false,
		dropShadows  : false, 
		disableHI	 : false, /* set to true to disable hoverIntent detection */
		onInit		 : function(){},
		onBeforeShow : function(){},
		onShow		 : function(){},
		onHide		 : function(){}
	});
	
	$('#menu > ul').css('display', 'block');
});
 
function getURLVar(urlVarName) {
	var urlHalves = String(document.location).toLowerCase().split('?');
	var urlVarValue = '';
	
	if (urlHalves[1]) {
            
		var urlVars = urlHalves[1].split('&');

		for (var i = 0; i <= (urlVars.length); i++) {
			if (urlVars[i]) {
				var urlVarPair = urlVars[i].split('=');
				
				if (urlVarPair[0] && urlVarPair[0] == urlVarName.toLowerCase()) {
					urlVarValue = urlVarPair[1];
				}
			}
		}
	}
	
	return urlVarValue;
} 

$(document).ready(function() {
	route = getURLVar('route');
	
	if (!route) {
		$('#dashboard').addClass('selected');
	} else {
		part = route.split('/');
		
		url = part[0];
		
		if (part[1]) {
			url += '/' + part[1];
		}
		
		$('a[href*=\'' + url + '\']').parents('li[id]').addClass('selected');
	}
});
//--></script> 
            </div>
             <% } %>
</div>
