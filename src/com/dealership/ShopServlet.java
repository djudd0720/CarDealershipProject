package com.dealership;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShopServlet
 */
@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession session= request.getSession(true);
		
		
		ArrayList<Car> cars = createCars();
		
		
				
		
				
		//Request dispatcher
		session.setAttribute("cars", cars);
		
		RequestDispatcher rs = request.getRequestDispatcher("Inventory.jsp");
		rs.forward(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public ArrayList<Car> createCars() {
		ArrayList<Car>cars=new ArrayList<Car>();
		
		//String year, String make, String model, String carId, String description, String condition, String price,
		//String image)
		
		
		Car car1= new Car("2018", "Toyota", "4-Runner", 12345, "Off-Road", "New", 32500, ".//images//Toy4Runner.jpg", "04/20/2018", "Available" );
		Car car2= new Car("2018", "Toyota", "4-Runner", 12347, "Off-Road", "New", 47500, ".//images//Toy4Runner2.jpg", "05/04/2018", "Available" );
		Car car3= new Car("2018", "Toyota", "Prius Prime", 12349, "Sporty", "New", 19500, ".//images//PriusPrime.jpg", "01/01/2018", "Available" );
		Car car4= new Car("1966", "Ford", "Mustang", 12351, "Classic", "Used", 50500, ".//images//FordMustang1966.jpg", "02/12/2018", "Available");
		Car car5= new Car("1972", "Karman", "Gia", 12353, "Classic", "Used", 19500, ".//images//KarmanGhia.jpg", "02/01/2018", "Available" );
		Car car6= new Car("1967", "Mercedes Benz","230SL Pagode", 12355, "Classic", "Used", 54500, ".//images//MercedesBenz1967.jpg", "01/10/2018", "Available" );
		Car car7= new Car("1968", "VW", "Bus", 12356, "Classic", "Used", 9500, ".//images//VWBus.jpg", "12/20/2017", "Available" );
		Car car8= new Car("1968", "VW", "Bus2", 12357, "Classic", "Used", 9500, ".//images//VWBus2.jpg", "12/20/2017", "Available" );
		Car car9= new Car("2005", "Ford", "Mustang", 12358, "Classic", "Used", 9500, ".//images//FordMustang2005.JPG", "12/20/2017", "Available" );
		Car car10= new Car("1937", "Speed 25", "Saloon Charlesworth", 12359, "Classic", "Used", 9500, ".//images//1937-Speed-25-Saloon-by-Charlesworth.jpg", "12/20/2017", "Available" );
		Car car11= new Car("1957", "Chevrolet", "Corvette", 12360, "Classic", "Used", 9500, ".//images//1957-Chevrolet-Corvette-red-white-coves-le.jpg", "12/20/2017", "Available" );
		Car car12= new Car("1969", "Dodge", "A100", 12361, "Classic", "Used", 9500, ".//images//1964-70-Dodge-A100.jpg", "12/20/2017", "Available" );
		Car car13= new Car("1964", "Morris Mini", "Van", 12362, "Classic", "Used", 9500, ".//images//1964MorrisMiniwindowlessPanelVan.jpg", "12/20/2017", "Available" );
		
		
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		cars.add(car8);
		cars.add(car9);
		cars.add(car10);
		cars.add(car11);
		cars.add(car12);
		cars.add(car13);
		
		
		return cars;
	}
	
}
