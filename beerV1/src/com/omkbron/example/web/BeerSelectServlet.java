package com.omkbron.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;
import com.omkbron.example.model.BeerExpert;

public class BeerSelectServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String color = request.getParameter("color");
		
		BeerExpert beerExpert = new BeerExpert();
		List<String> brands = beerExpert.getBrands(color);

        //response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		//out.println("<p>Beer Selection Advice</p>");
		//out.println("Try: <ul>");
		//for (String brand : brands) {
		//	out.println("<li>");
		//	out.println(brand);
		//	out.println("</li>");
		//}
		//out.println("</ul>");
		
		request.setAttribute("styles", brands);

		RequestDispatcher view = request.getRequestDispatcher("result.jsp");

		view.forward(request, response);
	}

}
