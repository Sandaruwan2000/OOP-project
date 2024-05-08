package Addvehi;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/adsvehicleservlet")
public class adsvehicleservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String vehicle = request.getParameter("vehicle") ;
		String number = request.getParameter("number") ;
		String year = request.getParameter("year") ;
		String seats = request.getParameter("seats") ;
		String engine = request.getParameter("engine") ;
		String gear = request.getParameter("gear") ;
		String kilometers = request.getParameter("kilometers") ;
		String price = request.getParameter("price") ;
		
		boolean dt ;
		dt = VehicleDB.addvehicle(vehicle, number, year, seats, engine, gear, kilometers,price);
		
		if(dt==true) {
			RequestDispatcher d = request.getRequestDispatcher("add_vehicle.jsp") ;
			d.forward(request, response);
		}else {
			RequestDispatcher d1 = request.getRequestDispatcher("unsuccess.jsp") ;
			d1.forward(request, response);
			
		}
		
	}

}
