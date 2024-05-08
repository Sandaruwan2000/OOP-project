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
            background-image:url(image/b2.jpg);
   
   			background-size: 1270px 830px;
   			
        }
         

        table {
            border-collapse: collapse;
            margin: 20px auto;
        }

        td {
            padding: 10px;
        }

        input[type="text"] {
            padding: 10px;
            width: 200px; 
        }

        button[type="submit"] {
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
  <form action="view" method="post">
  	<table>
  		<tr>
  			
  			<td><input type="text" id="cusid" name="cusid"></td>
  			<td><button type="submit" name="submit" value="submit">Search</button></td>
  		</tr>
  	
  	</table>
  	
  </form>
</body>
</html>