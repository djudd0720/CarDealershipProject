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
 * Servlet implementation class FinalServlet
 */
@WebServlet("/FinalServlet")
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session= request.getSession(true);
		//int carId = Integer.parseInt(request.getParameter("carId"));
		ArrayList<Car> cars = (ArrayList<Car>) session.getAttribute("cars");
		ArrayList<Car> cartArray= (ArrayList<Car>) session.getAttribute("cartCars");
		/*clear the cart array - cartArray=null*/
		
		for(Car car: cartArray) {
			//if(car.getcarId()==carId) {
				//cardetail=car;
			car.setStatus("Sold"); 
			
			cars.remove(car);
			//}
		}
		cartArray.clear();
		
		RequestDispatcher rs = request.getRequestDispatcher("Final.jsp");
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
