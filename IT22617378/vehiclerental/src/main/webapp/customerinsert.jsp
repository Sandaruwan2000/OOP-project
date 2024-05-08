<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="insert.css">

<script>
    function validatecusid() {
        // Get the input element
        var idInput = document.getElementById("cusid");
        
        var idPattern = /^[A-Z]{2}\d{3}$/;
        
        if (!idPattern.test(idInput.value)) {
            alert("Invalid Customer ID format. Please use a format like 'AB123'.");
            idInput.value = "";
            return false;
        }
        
        // Validation passed, allow form submission
        return true;
    }
</script>

<style>
body{background-image:url(image/b8.jpg);
   
background-size: 1270px 830px;}
</style>
</head>
<body>
		<h1>BOOKING CAR </h1>
		<form action="insert" method="post" onsubmit="return validatecusid();">
        <table>
            <tr>
                <td>CustomerID:</td>
                <td><input type="text" id="cusid" name="cusid" required></td>
            </tr>
            <tr>
                <td>name:</td>
                <td><input type="text" id="name" name="name" required></td>
            </tr>
            <tr>
                <td>Booking data:</td>
                <td><input type ="date" id="bdate" name="bdate" required></td>
                
            </tr>
            <tr>
                <td>make payment:</td>
                <td><select  id="payment" name="payment">
                        <option value="master">Master card</option>
                        <option value="debit">debit</option>
                        
                    </select>
                </td>
            </tr>
            <tr>
                
                <td><br><button type="submit" name="submit" value="submit">Submit</button></td>
               
            </tr>
            
        </table>
        
    </form>
</body>
</html>