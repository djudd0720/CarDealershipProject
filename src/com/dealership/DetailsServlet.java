package com.dealership;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DetailsServlet
 */
@WebServlet("/DetailsServlet")
public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session= request.getSession(true);
		String carIdString = request.getParameter("carId");
		int carId = 0;
		if(carIdString !=null) {
			carId = 	Integer.parseInt(carIdString);

		}
		
		String bidCarIdString = request.getParameter("bidCarId");
		if(bidCarIdString !=null) {
			carId = 	Integer.parseInt(bidCarIdString);

		}
	
		
		ArrayList<Car> cars = (ArrayList<Car>) session.getAttribute("cars");
		Car cardetail = null;
		
		for(Car car: cars) {
			if(car.getcarId()==carId) {
				cardetail=car;
			}
		}
		
		
		//Request dispatcher
		session.setAttribute("car", cardetail);
				
		RequestDispatcher rs = null;
		
		if(carIdString !=null) {
			rs =request.getRequestDispatcher("Details.jsp");
		}else {
			rs = request.getRequestDispatcher("Bid.jsp");
		}
		
		
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
