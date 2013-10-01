<%-- 
    Document   : header
    Created on : Sep 15, 2013, 1:02:52 PM
    Author     : Rajtech
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<%@ include file="/common/header.jsp"  %>
<div id="notification"></div>
 
<div id="content"><div class="slideshow">
  <div id="slideshow0" class="nivoSlider" style="width: 980px; height: 280px;">
            <a href="index.php?route=product/product&amp;path=57&amp;product_id=49"><img src="http://localhost/upload/image/cache/data/samsung_banner-980x280.jpg" alt="Samsung Tab 10.1" /></a>
          </div>
</div>
<script type="text/javascript"><!--
$(document).ready(function() {
	$('#slideshow0').nivoSlider();
});
--></script><div class="box">
  <div class="box-heading">Featured</div>
  <div class="box-content">
    <div class="box-product">
            <div>
                <div class="image"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=43"><img src="http://localhost/upload/image/cache/data/macbook_1-80x80.jpg" alt="MacBook" /></a></div>
                <div class="name"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=43">MacBook</a></div>
                <div class="price">
                    $500.00                  </div>
                        <div class="cart"><input type="button" value="Add to Cart" onclick="addToCart('43');" class="button" /></div>
      </div>
            <div>
                <div class="image"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=40"><img src="http://localhost/upload/image/cache/data/iphone_1-80x80.jpg" alt="iPhone" /></a></div>
                <div class="name"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=40">iPhone</a></div>
                <div class="price">
                    $101.00                  </div>
                        <div class="cart"><input type="button" value="Add to Cart" onclick="addToCart('40');" class="button" /></div>
      </div>
            <div>
                <div class="image"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=42"><img src="http://localhost/upload/image/cache/data/43417-1004-1-3ww-l-80x80.jpg" alt="Standard Grade Screen Printing Units" /></a></div>
                <div class="name"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=42">Standard Grade Screen Printing Units</a></div>
                <div class="price">
                    <span class="price-old">$100.00</span> <span class="price-new">$90.00</span>
                  </div>
                        <div class="cart"><input type="button" value="Add to Cart" onclick="addToCart('42');" class="button" /></div>
      </div>
            <div>
                <div class="image"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=49"><img src="http://localhost/upload/image/cache/data/samsung_tab_1-80x80.jpg" alt="Samsung Galaxy Tab 10.1" /></a></div>
                <div class="name"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=49">Samsung Galaxy Tab 10.1</a></div>
                <div class="price">
                    $199.99                  </div>
                        <div class="cart"><input type="button" value="Add to Cart" onclick="addToCart('49');" class="button" /></div>
      </div>
            <div>
                <div class="image"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=46"><img src="http://localhost/upload/image/cache/data/sony_vaio_1-80x80.jpg" alt="Sony VAIO" /></a></div>
                <div class="name"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=46">Sony VAIO</a></div>
                <div class="price">
                    $1,000.00                  </div>
                        <div class="cart"><input type="button" value="Add to Cart" onclick="addToCart('46');" class="button" /></div>
      </div>
            <div>
                <div class="image"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=47"><img src="http://localhost/upload/image/cache/data/hp_1-80x80.jpg" alt="HP LP3065" /></a></div>
                <div class="name"><a href="http://localhost/upload/index.php?route=product/product&amp;product_id=47">HP LP3065</a></div>
                <div class="price">
                    $100.00                  </div>
                        <div class="cart"><input type="button" value="Add to Cart" onclick="addToCart('47');" class="button" /></div>
      </div>
          </div>
  </div>
</div>
<h1 style="display: none;">Your Store</h1>
<div id="carousel0">
  <ul class="jcarousel-skin-opencart">
        <li><a href="index.php?route=product/manufacturer/product&amp;manufacturer_id=5"><img src="http://localhost/upload/image/cache/data/htc_logo-80x80.jpg" alt="HTC" title="HTC" /></a></li>
        <li><a href="index.php?route=product/manufacturer/product&amp;manufacturer_id=9"><img src="http://localhost/upload/image/cache/data/canon_logo-80x80.jpg" alt="Canon" title="Canon" /></a></li>
        <li><a href="index.php?route=product/manufacturer/product&amp;manufacturer_id=8"><img src="http://localhost/upload/image/cache/data/apple_logo-80x80.jpg" alt="Apple" title="Apple" /></a></li>
        <li><a href="index.php?route=product/manufacturer/product&amp;manufacturer_id=6"><img src="http://localhost/upload/image/cache/data/palm_logo-80x80.jpg" alt="Palm" title="Palm" /></a></li>
        <li><a href="index.php?route=product/manufacturer/product&amp;manufacturer_id=10"><img src="http://localhost/upload/image/cache/data/sony_logo-80x80.jpg" alt="Sony" title="Sony" /></a></li>
        <li><a href="index.php?route=product/manufacturer/product&amp;manufacturer_id=7"><img src="http://localhost/upload/image/cache/data/hp_logo-80x80.jpg" alt="Hewlett-Packard" title="Hewlett-Packard" /></a></li>
      </ul>
</div>
<script type="text/javascript"><!--
$('#carousel0 ul').jcarousel({
	vertical: false,
	visible: 5,
	scroll: 3});
//--></script></div>
<%@ include file="/common/footer.jsp"  %>
