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
 * Servlet implementation class BidServlet
 */
@WebServlet("/BidServlet")
public class BidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BidServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//double bid1 = 0;
		//bid1=(double) request.getAttribute("bidOne");
		//if(bid1!=0) {
		
		
		//int credit = 12;
		//double gpa=((Integer.parseInt(grade1)*credit)+(Integer.parseInt(grade2)*credit)+(Integer.parseInt(grade3)*credit))/45;
		
			HttpSession session = request.getSession(true);
			ArrayList<Car> cars = (ArrayList<Car>) session.getAttribute("cars");
		//Car cardetail = null;
		
		//	for(Car car: cars) {
		//		if(car.getPrice()==(bid1*.9)) {
		//			boolean bidresponse = true;
		//		}
	//		}
	//	}
		
		//Student student = (Student)session.getAttribute("student");
		//student.setGpa(gpa);
		
		//session.setAttribute("student", student);
		session.setAttribute("car", cars);

		RequestDispatcher rs = request.getRequestDispatcher("Bid.jsp");
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
