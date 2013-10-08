<%-- 
    Document   : header
    Created on : Sep 15, 2013, 1:02:52 PM
    Author     : Rajtech
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="store/css/stylesheet.css" />
        <link rel="stylesheet" type="text/css" href="store/css/slideshow.css" media="screen">
        <link rel="stylesheet" type="text/css" href="store/css/carousel.css" media="screen">
        <link type="text/css" href="store/javascript/jquery/css/blitzer/jquery-ui-1.8.23.custom.css" rel="stylesheet" />
        
        <script type="text/javascript" src="admin/javascript/jquery/js/jquery-ui-1.8.23.custom.min.js"></script>
	
        <title>Store</title>
    </head>
    <body>
        <div id="container">
<div id="header">
    <div id="logo"><a href="http://localhost/upload/index.php?route=common/home"><img src="store/images/sdlogo3.png" title="Rajtech Enterprise UK Limited" alt="Rajtech Enterprise UK Limited" /></a></div>
      <form action="http://localhost/upload/index.php?route=module/currency" method="post" enctype="multipart/form-data">
  <div id="currency">Currency<br />
                <a title="Euro" onclick="$('input[name=\'currency_code\']').attr('value', 'EUR'); $(this).parent().parent().submit();">€</a>
                        <a title="Pound Sterling" onclick="$('input[name=\'currency_code\']').attr('value', 'GBP'); $(this).parent().parent().submit();">£</a>
                        <a title="US Dollar"><b>$</b></a>
                <input type="hidden" name="currency_code" value="" />
    <input type="hidden" name="redirect" value="http://localhost/upload/index.php?route=common/home" />
  </div>
</form>
  <div id="cart">
  <div class="heading">
    <h4>Shopping Cart</h4>
    <a><span id="cart-total">0 item(s) - $0.00</span></a></div>
  <div class="content">
        <div class="empty">Your shopping cart is empty!</div>
      </div>
</div>  <div id="search">
    <div class="button-search"></div>
        <input type="text" name="filter_name" value="Search" onclick="this.value = '';" onkeydown="this.style.color = '#000000';" />
      </div>
  <div id="welcome">
        Welcome visitor you can <a href="http://localhost/upload/index.php?route=account/login">login</a> or <a href="http://localhost/upload/index.php?route=account/register">create an account</a>.      </div>
  <div class="links"><a href="http://localhost/upload/index.php?route=common/home">Home</a><a href="http://localhost/upload/index.php?route=account/wishlist" id="wishlist-total">Wish List (0)</a><a href="http://localhost/upload/index.php?route=account/account">My Account</a><a href="http://localhost/upload/index.php?route=checkout/cart">Shopping Cart</a><a href="http://localhost/upload/index.php?route=checkout/checkout">Checkout</a></div>
</div>
<div id="menu">
  <ul>
        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=20">ScreenPrinting</a>
            <div>
                <ul>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=20_26">Wood</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=20_27">Cloth</a></li>
                            </ul>
              </div>
          </li>
        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=18">Inks</a>
            <div>
                <ul>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=18_46">Macs</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=18_45">Windows</a></li>
                            </ul>
              </div>
          </li>
        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=25">Components</a>
            <div>
                <ul>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=25_29">Mice and Trackballs</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=25_28">Monitors</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=25_30">Printers</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=25_31">Scanners</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=25_32">Web Cameras</a></li>
                            </ul>
              </div>
          </li>
        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=57">Tablets</a>
          </li>
        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=17">Software</a>
          </li>
        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=24">Phones &amp; PDAs</a>
          </li>
        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=33">Cameras</a>
          </li>
        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34">MP3 Players</a>
            <div>
                <ul>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_43">test 11</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_44">test 12</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_47">test 15</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_48">test 16</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_49">test 17</a></li>
                            </ul>
                <ul>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_50">test 18</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_51">test 19</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_52">test 20</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_53">test 21</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_54">test 22</a></li>
                            </ul>
                <ul>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_55">test 23</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_56">test 24</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_38">test 4</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_37">test 5</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_39">test 6</a></li>
                            </ul>
                <ul>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_40">test 7</a></li>
                                        <li><a href="http://localhost/upload/index.php?route=product/category&amp;path=34_42">test 9</a></li>
                                                                                        </ul>
              </div>
          </li>
      </ul>
</div>
