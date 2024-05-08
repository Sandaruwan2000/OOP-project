<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

body{
background-color:rgb(237, 229, 229);
background-image:url(image/b8.jpg);
   
background-size: 1270px 830px;
color:black;

}

        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
            border: 1px solid black;
        }

        td {
            padding: 10px;
            border: 1px solid black;
        }

        a {
            text-decoration: none;
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
	<table>
	<c:forEach var="cus" items="${cusDetails}" >
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="cusid" value="${cus.cusid}"/>
	<c:set var="name" value="${cus.name} "/>
	<c:set var="bdate" value="${cus.bdate}"/>
	<c:set var="payment" value="${cus.payment}"/>
	
	
	<tr>
		<td>Id:</td>
		<td>${cus.id} </td>
	</tr>
	<tr>
		<td>CusId:</td>
		<td>${cus.cusid} </td>
	</tr>
	<tr>
		<td>Name:</td>
		<td>${cus.name} </td>
	</tr>
	
	<tr>
		<td>Booking Date:</td>
		<td>${cus.bdate} </td>
	</tr>
	<tr>
		<td>payment:</td>
		<td>${cus.payment} </td>
	</tr>
	
	</c:forEach>
	
	<tr><td><br>
		<c:url value="updatecustomer.jsp" var="cusupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="cusid" value="${cusid}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="bdate" value="${bdate}"/>
		<c:param name="payment" value="${payment}"/>
		</c:url>
		
		<a href="${cusupdate}"><button type="submit" name="submit" value="update">Update</button></a>
		</td>
	</tr>
	<tr>
		<td>
		<c:url value="deletecustomer.jsp" var="cusdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="cusid" value="${cusid}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="bdate" value="${bdate}"/>
		<c:param name="payment" value="${payment}"/>
		
		</c:url>
		<a href="${cusdelete}"><button type = "submit"name="delete" value="delete">Delete</button></a>
		</td>
	</tr>
	</table>


</body>
</html>