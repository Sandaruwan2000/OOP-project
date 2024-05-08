package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updatecustomerservlet")
public class updatecustomerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String cusid = request.getParameter("cusid");
		String name = request.getParameter("name");
		String bdate = request.getParameter("bdate");
		String payment = request.getParameter("payment");
		
		boolean isTrue;
		
		isTrue = customerdbutil.updatecustomer(id, cusid, name, bdate, payment);
		
		if(isTrue==true) {
			List<Customer>cusDetails = customerdbutil.getcustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<Customer>cusDetails = customerdbutil.getcustomerDetails(id);
			request.setAttribute("cusDeatails", cusDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
	}

}
