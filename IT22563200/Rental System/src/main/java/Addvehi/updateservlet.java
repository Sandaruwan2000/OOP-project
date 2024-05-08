package Addvehi;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/updateservlet")
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id") ;
		String vehicle = request.getParameter("vehicle") ;
		String number = request.getParameter("number") ;
		String year = request.getParameter("year") ;
		String seats = request.getParameter("seats") ;
		String engine = request.getParameter("engine") ;
		String gear = request.getParameter("gear") ;
		String kilometers = request.getParameter("kilometers") ;
		String price = request.getParameter("price") ;
		
		
		boolean isTrue ;
		
		isTrue=VehicleDB.updatevehicle(id, vehicle, number, year, seats, engine, gear, kilometers, price) ;
	
		if(isTrue ==true) {
			
			List<Vehicle> vehDetails = VehicleDB.getvehicle(number);
			request.setAttribute("vehDetails", vehDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("currentview.jsp");
			dis.forward(request, response);
		
		}else {
			
			List<Vehicle> vehDetails = VehicleDB.getvehicle(number);
			request.setAttribute("vehDetails", vehDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("currentview.jsp");
			dis.forward(request, response);
			
			
		}
	
	}

}
