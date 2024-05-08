<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="insert.css">
<style>
     body {
    background-image:url(image/b5.jpg);
   
    background-size: 1270px 830px;
  }
    
    </style>
    
</head>
<body>


<%		
		String id = request.getParameter("id") ;
		String vehicle = request.getParameter("vehicle") ;
		String number = request.getParameter("number") ;
		String year = request.getParameter("year") ;
		String seats = request.getParameter("seats") ;
		String engine = request.getParameter("engine") ;
		String gear = request.getParameter("gear") ;
		String kilometers = request.getParameter("kilometers") ;
		String price = request.getParameter("price") ;

%>


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


<form  class="form" action="delete" method="post">
<table class="table">
 <tr>
 <td><br>ID :</td>
 <td><br><input type="text" id="id"  name="id" value="<%= id %>" readonly></td>
 </tr>

 <tr>
<td><br>Vehicle :</td>
<td><br><select name="vehicle" id="vehicle" value="<%= vehicle %>" disabled>
<option value="car" <%= "car".equals(vehicle) ? "selected" : "" %>>Car</option>
<option value="van" <%= "van".equals(vehicle) ? "selected" : "" %>>Van</option>
<option value="bike" <%= "bike".equals(vehicle) ? "selected" : "" %>>Bike</option>
</select></td>
</tr>

<tr>
<td><br>Number:</td>
<td><br><input type ="text" id="number" name="number" value="<%= number %>" readonly></td>
</tr>
<tr>
<td><br>Made Year :</td>
<td><br><input type ="date" id="year" name="year" value="<%= year %>" readonly></td>
</tr>
<tr>
<td><br>Number Of Seats :</td>
<td><br><input type ="text" id="seats" name="seats" value="<%= seats %>" readonly></td>
</tr>
<tr>
<td><br>Engine Capacity :</td>
<td><br><input type ="text" id="engine" name="engine" value="<%= engine %>"  readonly></td>
</tr>
<tr>
<tr>
<td><br>Gear System :</td>
<td><br><select name="gear" id="gear" value="<%= gear %>" disabled>
<option value="auto" <%= "auto".equals(gear) ? "selected" : "" %>>Auto</option>
<option value="manual"<%="manual".equals(gear) ? "selected" : "" %>>Manual</option>
</select></td>
</tr>
<tr>
<td><br>Liter Per Kilometers :</td>
<td><br><input type ="text" id="kilometers" name="kilometers" value="<%= kilometers %>" readonly></td>
</tr>
<tr>
<td><br>Price :</td>
<td><br><input type ="text" id="price" name="price" value="<%= price %>" readonly></td>
</tr>
 <tr>
<td><br><button type="submit" name="submit" value="submit" class="b3">Delete</button></td>
</tr>

</table>
	
</form>
</body>
</html>