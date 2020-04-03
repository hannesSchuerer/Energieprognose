<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Energieprognose</title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<script type="text/javascript">
			window.onload = function() {
			 
			var dps = [[]];
			var chart = new CanvasJS.Chart("consumtionChartContainer", {
				theme: "light2", // "light1", "dark1", "dark2"
				animationEnabled: true,
				title: {
					text: "(Total)Powerconsumption"
				},
				axisX: {
					valueFormatString: "HH:mm:ss"
				},
				axisY: {
					includeZero: false,
					interval: 1000,
					title: "Power (in kwh)",
					suffix: " kwh"
				},
				data: [{
					type: "line",
					xValueType: "dateTime",
					xValueFormatString: "HH:mm:ss",
					yValueFormatString: "#.##0 kwh",
					dataPoints: dps[0]
				}]
			});
			 
			var xValue;
			var yValue;
			 
			<c:forEach items="${consumtionDataPointsList}" var="dataPoints" varStatus="loop">
				<c:forEach items="${dataPoints}" var="dataPoint">
					xValue = parseInt("${dataPoint.x}");
					yValue = parseFloat("${dataPoint.y}");
					dps[parseInt("${loop.index}")].push({
						x : xValue,
						y : yValue
					});		
				</c:forEach>	
			</c:forEach> 
			 
			chart.render();





				var dps2 = [[]];
				var chart2 = new CanvasJS.Chart("generatingChartContainer", {
					theme: "light2", // "light1", "dark1", "dark2"
					animationEnabled: true,
					title: {
						text: "(Total)Powergeneration"
					},
					axisX: {
						valueFormatString: "HH:mm:ss"
					},
					axisY: {
						includeZero: false,
						interval: 1000,
						title: "Power (in kwh)",
						suffix: " kwh"
					},
					data: [{
						type: "line",
						xValueType: "dateTime",
						xValueFormatString: "HH:mm:ss",
						yValueFormatString: "#.##0 kwh",
						dataPoints: dps2[0]
					}]
				});

				var xValue2;
				var yValue2;

				<c:forEach items="${generatingDataPointsList}" var="dataPoints2" varStatus="loop2">
				<c:forEach items="${dataPoints2}" var="dataPoint2">
				xValue2 = parseInt("${dataPoint2.x}");
				yValue2 = parseFloat("${dataPoint2.y}");
				dps2[parseInt("${loop2.index}")].push({
					x : xValue2,
					y : yValue2
				});
				</c:forEach>
				</c:forEach>

				chart2.render();
			}
			</script>
	</head>
	<body>
		<%
			response.setIntHeader("Refresh", 60);
		%>
		<div id="consumtionChartContainer" style="height: 370px; width: 100%;"></div>
		<div id="generatingChartContainer" style="height: 370px; width: 100%;"></div>
		<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
	 	<table border="1">
	 		<tr>
	 			<th>Current Time</th>
	 			<th>Weather</th>
	 			<th>Description</th>
	 			<th>Temperature</th>
	 			<th>Sunrise</th>
	 			<th>Sunset</th>
				<th>Message</th>
	 		</tr>
	 		<tr>
	 			<td>${currentTime}</td>
	 			<td>${main}</td>
	 			<td>${description}</td>
	 			<td>${temperature}°C</td>
	 			<td>${sunrise}</td>
	 			<td>${sunset}</td>
				<td>${message}</td>
	 		</tr>
	 	</table>
	</body>
</html>