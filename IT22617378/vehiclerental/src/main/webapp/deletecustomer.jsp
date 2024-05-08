<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <style>
        body {
            font-family: Arial, sans-serif;
            background-color:rgb(237, 229, 229);
            margin: 0;
            padding: 0;
            background-image:url(image/b8.jpg);
   
			background-size: 1270px 830px;
        }

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
            border: 1px solid #ccc;
        }

        td {
            padding: 10px;
            border: 1px solid #ccc;
        }

        input[type="text"],
        input[type="date"],
        select {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
        }

        button {
            background-color: #008CBA;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            cursor: pointer;
        }
    </style>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String cusid = request.getParameter("cusid");
	    String name = request.getParameter("name");
	    String bdate = request.getParameter("bdate");
	    String payment = request.getParameter("payment");
	%>
	
	<form action="delete" method="post">
	<table>
		<tr>
			<td><br>Id:</td>
			<td><br><input type ="text" name="id" value="<%= id%>"readonly></td>
		
		</tr>
		<tr>
			<td><br>CusId:</td>
			<td><br><input type ="text" name="cusid" value="<%=cusid %>"readonly></td>
		
		</tr>
		<tr>
			<td><br>Name:</td>
			<td><br><input type= "text" name="name" value="<%=name %>"readonly></td>
		
		</tr>
		<tr>
			<td><br>Booking date:</td>
			<td><br><input type="date" name="bdate" value="<%=bdate %>"readonly></td>
		
		</tr>
		<tr>
			<td><br>Payment</td>
			<td><br><select id="payment" name="payment" value="<%=payment%>"readonly>
				<option>Master</option>
				<option>VISA</option>
			</select></td>
		
		</tr>
		<tr>
			<td><br><button type="submit" name="delete" value="delete">Delete</button></td>
		</tr>
		</table>
	</form>

</body>
</html>