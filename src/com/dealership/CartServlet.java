package com.dealership;

import java.io.IOException;
//import java.util.ArrayList;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession session=request.getSession(true);
		ArrayList<Car> carArray= (ArrayList<Car>) session.getAttribute("cars");
		int carId=Integer.parseInt(request.getParameter("carId"));
		ArrayList<Car> cartArray= (ArrayList<Car>) session.getAttribute("cartCars");

		//Add car to cart array
		if(cartArray==null) {

		cartArray=new ArrayList<Car>();
		}

		for(Car car: carArray) {
		if(car.getcarId()==carId) {

		cartArray.add(car);
		
		}
		}

		double total=totalSum(cartArray);


		session.setAttribute("cartCars",cartArray);
		session.setAttribute("cartSum",total);
		
		RequestDispatcher rs=request.getRequestDispatcher("ShoppingCart.jsp");
		rs.forward(request, response);
	}
	
	private double totalSum(ArrayList<Car> cartArray) {
		// TODO Auto-generated method st
		double sum=0;
		for(Car car: cartArray) {
			
			sum+=car.getPrice();
		}
		return sum;
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

}


	
}

