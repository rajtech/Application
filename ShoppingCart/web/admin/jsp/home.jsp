<%-- 
    Document   : home
    Created on : Jun 27, 2012, 10:53:33 PM
    Author     : Rajtech
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html>
<%@ include file="/admin/common/header.jsp"  %>

<div id="content">
  <div class="breadcrumb">

  </div>
 
  <div class="box">
    <div class="heading">
      <h1><img src="image/home.png" alt="" /> Dashboard</h1>
    </div>
    <div class="content">
      <div class="overview">
        <div class="dashboard-heading">overview </div>
        <div class="dashboard-content">
          <table>
            <tr>
              <td>Total Sales:</td>
              <td>250</td>
            </tr>
            <tr>
              <td>Total Sale Year</td>
              <td>total_sale_year %></td>
            </tr>
            <tr>
              <td>text_total_order </td>
              <td> total_order </td>
            </tr>
            <tr>
              <td>text_total_customer</td>
              <td>total_customer </td>
            </tr>
            <tr>
              <td>text_total_customer_approval</td>
              <td>total_customer_approval </td>
            </tr>
            <tr>
              <td>text_total_review_approval</td>
              <td>total_review_approval</td>
            </tr>
            <tr>
              <td>text_total_affiliate</td>
              <td>total_affiliate </td>
            </tr>
            <tr>
              <td>text_total_affiliate_approval </td>
              <td>total_affiliate_approval </td>
            </tr>
          </table>
        </div>
      </div>
     <div class="statistic">
        <div class="range">Select Range
          <select id="range" onchange="getSalesChart(this.value)">
            <option value="day">Dat</option>
            <option value="week">Week</option>
            <option value="month">Month</option>
            <option value="year">Year</option>
          </select>
        </div>
        <div class="dashboard-heading">Statistics </div>
        <div class="dashboard-content">
          <div id="report" style="width: 390px; height: 170px; margin: auto;"></div>
        </div>
      </div>
      <div class="latest">
        <div class="dashboard-heading">text_latest_10_orders </div>
        <div class="dashboard-content">
          <table class="list">
            <thead>
              <tr>
                <td class="right">order </td>
                <td class="left">customer </td>
                <td class="left">status</td>
                <td class="left">_date_added</td>
                <td class="right">total</td>
                <td class="right">action</td>
              </tr>
            </thead>
            <tbody>
              <?php if ($orders) { ?>
              <?php foreach ($orders as $order) { ?>
              <tr>
                <td class="right">order_id</td>
                <td class="left">customer</td>
                <td class="left">status</td>
                <td class="left">date_added</td>
                <td class="right">total</td>
                <td class="right"><?php foreach ($order['action'] as $action) { ?>
                  [ <a href="">text</a> ]
                  <?php } ?></td>
              </tr>
              <?php } ?>
              <?php } else { ?>
              <tr>
                <td class="center" colspan="6"> text_no_results %></td>
              </tr>
              <?php } ?>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
</div>
<!--[if IE]>
<script type="text/javascript" src="view/javascript/jquery/flot/excanvas.js"></script>
<![endif]--> 
<script type="text/javascript" src="view/javascript/jquery/flot/jquery.flot.js"></script> 
<script type="text/javascript"><!--
function getSalesChart(range) {
	$.ajax({
		type: 'get',
		url: 'index.jsp?route=common/home/chart&token=token&range=' + range,
		dataType: 'json',
		async: false,
		success: function(json) {
			var option = {	
				shadowSize: 0,
				lines: { 
					show: true,
					fill: true,
					lineWidth: 1
				},
				grid: {
					backgroundColor: '#FFFFFF'
				},	
				xaxis: {
            		ticks: json.xaxis
				}
			}

			$.plot($('#report'), [json.order, json.customer], option);
		}
	});
}

getSalesChart($('#range').val());
//--></script> 
<%@ include file="/admin/common/footer.jsp"  %>