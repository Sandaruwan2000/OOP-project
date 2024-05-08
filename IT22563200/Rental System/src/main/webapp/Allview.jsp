<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="allview.css">

</head>
<body>
<div class="type">
<table class="table"  >

<tr>
 <th>ID</th>
 <th>Vehicle</th>
 <th>Number</th>
 <th>Made Year</th>
 <th>Number Of Seats</th>
 <th>Engine Capacity</th>
 <th>Gear System</th>
 <th>Liter Per Kilometers</th>
 <th>Price</th>
 <th>View</th>
 
 </tr>
<c:forEach var="veh" items="${vehDetails}">





<tr>
 <td>${veh.id}</td>
 <td>${(veh.vehicle)}</td>
 <td>${veh.number}</td>
 <td>${veh.year}</td>
 <td>${veh.seats}</td>
 <td>${veh.engine}</td>
 <td>${veh.gear}</td>
 <td>${veh.kilometers}</td>
 <td>${veh.price}</td>
 <form class="forms" action="search" method="post">

	 
	 <td><input type="password" id="number" name="number">
	 <button type="submit" name="submit" value="submit">Check</button></td>
	 
	
</form>

 </tr>


</c:forEach> 

</table>
</div>

</body>
</html>