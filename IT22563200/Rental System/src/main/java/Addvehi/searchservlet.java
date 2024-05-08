package Addvehi;

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
		
		String number = request.getParameter("number");
		
		boolean isTrue;
		isTrue= VehicleDB.search(number) ;
		
		if(isTrue== true) {
			List<Vehicle> vehDetails = VehicleDB.getvehicle(number) ;
			request.setAttribute("vehDetails", vehDetails) ;
			
			RequestDispatcher dis = request.getRequestDispatcher("currentview.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('It is not available');");
			out.println("location='search.jsp'");
			out.println("</script>");
		}
	}

}
