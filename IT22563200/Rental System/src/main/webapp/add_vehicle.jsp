<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <script>
        function validateNumber() {
            // Get the input element
            var numberInput = document.getElementById("number");
            
         
            var numberPattern = /^[A-Z]{2}-\d{4}$/;
            
          
            if (!numberPattern.test(numberInput.value)) {
              
                alert("Invalid vehicle number format. Please use a format like 'AB-1212'.");
            
                numberInput.value = "";
           
                return false;
            }
            
            // Validation passed, allow form submission
            return true;
        }
    </script>
    
    <link rel="stylesheet" type="text/css" href="insert.css">
    
    <style>
     body {
    background-image:url(image/b4.jpg);
   
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

            <a href="#" ><b>LOGOUT</b></a>
            
         </div>
		<div class="navbar3">
            <a href="#"><img src="image/logo4.jpg" class="newlogo1"></a>
            
        </div>
        
        
      
      
    </header>
    
    

    

<form class="form" action="insert" method="post" onsubmit="return validateNumber();" >
<table class="table">

 <tr>
<td><br>Vehicle :</td>
<td><br><select name="vehicle" id="vehicle">
<option value="car">Car</option>
<option value="van">Van</option>
<option value="bike">Bike</option>
</select></td>
</tr>
<tr>
<td><br>Number:</td>
<td><br><input type ="text" id="number" name="number" required></td>
</tr>
<tr>
<td><br>Made Year :</td>
<td><br><input type ="date" id="year" name="year" required></td>
</tr>
<tr>
<td><br>Number Of Seats :</td>
<td><br><input type ="text" id="seats" name="seats" required></td>
</tr>
<tr>
<td><br>Engine Capacity :</td>
<td><br><input type ="text" id="engine" name="engine"  required></td>
</tr>
<tr>
<td><br>Gear System :</td>
<td><br><select name="gear" id="gear">
<option value="auto">Auto</option>
<option value="manual">Manual</option>
</select></td>
</tr>
<tr>
<td><br>Liter Per Kilometers :</td>
<td><br><input type ="text" id="kilometers" name="kilometers" required></td>
</tr>
<tr>
<td><br>Price :</td>
<td><br><input type ="text" id="price" name="price" required></td>
</tr>
 <tr>
<td><br><button type="submit" name="submit" value="submit">Submit</button></td>
</tr>

</table>
	
</form>

    <form  class="enter" action="view" method="post" >
<table>
<tr>
<td style="color:white;"><br>Number :</td>
<td><br><input type="password" id="number" name="number"></td>
</tr>

<td><br><button type="submit" name="login" value="login">Entry</button></td>
</tr>
</table>
</form>



</body>
</html>