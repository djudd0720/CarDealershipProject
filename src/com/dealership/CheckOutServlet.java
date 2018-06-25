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
 * Servlet implementation class CheckOutServlet
 */
@WebServlet("/CheckOutServlet")
public class CheckOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckOutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session= request.getSession(true);
		//int carId = Integer.parseInt(request.getParameter("carId"));
		ArrayList<Car> cars = (ArrayList<Car>) session.getAttribute("cars");
		ArrayList<Car> cartArray= (ArrayList<Car>) session.getAttribute("cartCars");
		
		//Car cardetail = null;
		//Remove car from inventory if added to the cart
		//for(Car car: cars) {
		for(Car car: cartArray) {
			//if(car.getcarId()==carId) {
				//cardetail=car;
			cars.remove(car);
			//}
		}
		
		
		//Request dispatcher
		//session.setAttribute("car", cardetail);
		
		Customer customer = new Customer();

		customer.setEmail(request.getParameter("email"));
		customer.setFirstName(request.getParameter("firstName"));
		customer.setLastName(request.getParameter("lastName"));
		customer.setUserName(request.getParameter("username"));
		customer.setPassword(request.getParameter("password"));
		customer.setCardName(request.getParameter("cardName"));
		customer.setCardNumber(request.getParameter("cardNumber"));
		customer.setCardExp(request.getParameter("cardExp"));
		customer.setCardCVV(request.getParameter("cardCVV"));

		Address address = new Address();

		address.setStreet(request.getParameter("street"));
		address.setCity(request.getParameter("city"));
		address.setState(request.getParameter("state"));
		address.setZipCode(request.getParameter("zipCode"));

		customer.setAddress(address);
		session.setAttribute("customer", customer);
		
				
		RequestDispatcher rs = request.getRequestDispatcher("signIn.jsp");
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
////////////
/*HttpSession session=request.getSession(true);
ArrayList<Car> carArray= (ArrayList<Car>) session.getAttribute("cars");
int carId=Integer.parseInt(request.getParameter("cart"));
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
RequestDispatcher rs=request.getRequestDispatcher("ShopServlet");
rs.forward(request, response);
}

private double totalSum(ArrayList<Car> cartArray) {
// TODO Auto-generated method st
double sum=0;
for(Car car: cartArray) {
	
	sum+=car.getPrice();
}
return sum;*/
