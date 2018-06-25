package com.dealership;

import java.io.IOException;
//import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class RegistrationCarServlet
 */
@WebServlet("/RegistrationCarServlet")
public class RegistrationCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		
		Customer customer = new Customer();
		
		
		customer.setEmail(request.getParameter("email"));
		customer.setFirstName(request.getParameter("firstName"));
		customer.setLastName(request.getParameter("lastName"));
		customer.setPassword(request.getParameter("password"));
		//customer.setDealershipName("Toyota Toys");
		
		Address address = new Address();
		
		address.setStreet(request.getParameter("street"));
		address.setCity(request.getParameter("city"));
		address.setState(request.getParameter("state"));
		address.setZipCode(request.getParameter("zipCode"));
		
		customer.setAddress(address);
		
		HttpSession session= request.getSession(true);
		session.setAttribute("customer", customer);
		
		RequestDispatcher rs = request.getRequestDispatcher("logon.jsp");
		rs.forward(request, response);
		
		
		
				
		/*Car car = new Car();
		
		
		car.setYear(request.getParameter("year"));
		car.setMake(request.getParameter("make"));
		
		car.setModel(request.getParameter("model"));
		car.setDescription(request.getParameter("description"));
		car.setPrice(request.getParameter("price"));
		car.setCondition(request.getParameter("condition"));
		car.setImage(request.getParameter("image"));*/
		
		
		
		//??cars.add(car);
		//???session.setAttribute("course", course);
		
		//Request dispatcher
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
