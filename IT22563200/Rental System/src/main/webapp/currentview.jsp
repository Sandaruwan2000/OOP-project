<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="insert.css">

<style>
     body {
    background-image:url(image/b6.jpg);
   
    background-size: 1270px 830px;
  }
    
    </style>
    
</head>
<body>

<header class="header">

        <div class="navbar1">
            <a href="#"><img src="image/logo.jpg" class="newlogo"></a>
            
        </div>
        <div class="navbar2">
            <ul >
                <li><a href="#"><b>HOME</b></a></li>
                <li><a href="front.jsp"><b>BOOK</b></a></li>
                <li><a href="#"><b>NEWS</b></a></li>
                <li><a href="#"><b>ABOUT US</b></a></li>
            </ul>

            <a href="#" ><b>LOGIN</b></a>
            
         </div>
		<div class="navbar3">
            <a href="#"><img src="image/logo4.jpg" class="newlogo1"></a>
            
        </div>
        
        
      
      
    </header>
<form class="form">
<table class="table">
<c:forEach var="veh" items="${vehDetails}">

<c:set var="id" value="${veh.id}"/>
<c:set var="vehicle" value="${veh.vehicle}"/>
<c:set var="number" value="${veh.number}"/>
<c:set var="year" value="${veh.year}"/>
<c:set var="seats" value="${veh.seats}"/>
<c:set var="engine" value="${veh.engine}"/>
<c:set var="gear" value="${veh.gear}"/>
<c:set var="kilometers" value="${veh.kilometers}"/>
<c:set var="price" value="${veh.price}"/>



<tr>
 <td><br>ID :</td>
 <td><br>${veh.id}</td>
 </tr>
<tr>

<tr>
 <td><br>Vehicle :</td>
 <td><br>${(veh.vehicle)}</td>
 </tr>
<tr>

<td><br>Number:</td>
<td><br>${veh.number}</td>
</tr>
<tr>
<td><br>Made Year :</td>
<td><br>${veh.year}</td>
</tr>
<tr>
<td><br>Number Of Seats :</td>
<td><br>${veh.seats}</td>
</tr>
<tr>
<td><br>Engine Capacity :</td>
<td><br>${veh.engine}</td>
</tr>
<tr>
<td><br>Gear System :</td>
<td><br>${veh.gear}</td>
</tr>
<tr>
<td><br>Liter Per Kilometers :</td>
<td><br>${veh.kilometers}</td>
</tr>
<tr>
<td><br>Price :</td>
<td><br>${veh.price}</td>

</c:forEach> 

</table>
</form>
<table>
 <tr>
<td><br>

<c:url value="update.jsp" var="updatevehicle">

<c:param name="id" value="${id}"/>
<c:param name="vehicle" value="${vehicle}"/>
<c:param name="number" value="${number}"/>
<c:param name="year" value="${year}"/>
<c:param name="seats" value="${seats}"/>
<c:param name="engine" value="${engine}"/>
<c:param name="gear" value="${gear}"/>
<c:param name="kilometers" value="${kilometers}"/>
<c:param name="price" value="${price}"/>
</c:url>
<a href="${updatevehicle}"><button type="submit" name="submit" value="submit" class="b1">Update</button></a></td>
</tr>
</table>
<table>
 <tr>
<td><br>

<c:url value="delete.jsp" var="deletevehicle">

<c:param name="id" value="${id}"/>
<c:param name="vehicle" value="${vehicle}"/>
<c:param name="number" value="${number}"/>
<c:param name="year" value="${year}"/>
<c:param name="seats" value="${seats}"/>
<c:param name="engine" value="${engine}"/>
<c:param name="gear" value="${gear}"/>
<c:param name="kilometers" value="${kilometers}"/>
<c:param name="price" value="${price}"/>
</c:url>
<a href="${deletevehicle}"><button type="submit" name="submit" value="submit" class="b1">Delete</button></a></td>
</tr>
</table>




</body>
</html>