<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Energieprognose</title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<script type="text/javascript">
			window.onload = function() {
			 
			var dps = [[]];
			var chart = new CanvasJS.Chart("chartContainer", {
				theme: "light2", // "light1", "dark1", "dark2"
				animationEnabled: true,
				title: {
					text: "Powerconsumption"
				},
				axisX: {
					valueFormatString: "HH:mm"
				},
				axisY: {
					title: "Power (in kwh)",
					suffix: " kwh"
				},
				data: [{
					type: "line",
					xValueType: "dateTime",
					xValueFormatString: "HH:mm",
					yValueFormatString: "#,#00 kwh",
					dataPoints: dps[0]
				}]
			});
			 
			var xValue;
			var yValue;
			 
			<c:forEach items="${dataPointsList}" var="dataPoints" varStatus="loop">	
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
			 
			}
			</script>
	</head>
	<body>
		<div id="chartContainer" style="height: 370px; width: 100%;"></div>
		<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
	 	<table border="1">
	 		<tr>
	 			<th>Current Time</th>
	 			<th>Weather</th>
	 			<th>Description</th>
	 			<th>Temperature</th>
	 			<th>Sunrise</th>
	 			<th>Sunset</th>
	 		</tr>
	 		<tr>
	 			<td>${currentTime}</td>
	 			<td>${main}</td>
	 			<td>${description}</td>
	 			<td>${temperature}°C</td>
	 			<td>${sunrise}</td>
	 			<td>${sunset}</td>
	 		</tr>
	 	</table>
	</body>
</html>