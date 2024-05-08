package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/searchservlet")
public class searchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String cusid = request.getParameter("cusid");
		
		 boolean isTrue;
		 isTrue= customerdbutil.search(cusid);
		
		if(isTrue==true) {
			List<Customer>cusDetails = customerdbutil.getcustomer(cusid);
			request.setAttribute("cusDetails",cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			
			dis.forward(request, response);
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your customer id is incorrect');");
			out.println("location='search.jsp'");
			out.println("</script>");
		}
	}

}
