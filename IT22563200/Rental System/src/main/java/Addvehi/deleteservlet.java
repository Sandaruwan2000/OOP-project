package Addvehi;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/deleteservlet")
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String id =request.getParameter("id") ;
		
		boolean isTrue ;
		
		isTrue = VehicleDB.deletevehicle(id) ;
		
		if(isTrue == true) {
			

			RequestDispatcher dis = request.getRequestDispatcher("add_vehicle.jsp");
			dis.forward(request, response);
			
		}
		else {
			

		List<Vehicle> vehDetails = VehicleDB.getvehicle(id) ;
		request.setAttribute("vehDetails", vehDetails);
			
		RequestDispatcher dis = request.getRequestDispatcher("currentview.jsp");
		dis.forward(request, response);	
		}
	}

}
