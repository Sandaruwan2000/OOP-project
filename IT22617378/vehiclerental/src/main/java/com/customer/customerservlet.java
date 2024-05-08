package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class customerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cusid = request.getParameter("cusid");
		String name = request.getParameter("name");
		String bdate = request.getParameter("bdate");
		String payment = request.getParameter("payment");
		
		
		boolean dt;
		
		dt = customerdbutil.insercustomer(cusid, name, bdate, payment);
		

		if(dt==true) {
			RequestDispatcher d = request.getRequestDispatcher("front.jsp") ;
			d.forward(request, response);
		}else {
			RequestDispatcher d1 = request.getRequestDispatcher("unsuccess.jsp") ;
			d1.forward(request, response);
			
		}
			
		
		
	}

}
