package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cp")

public class ClothServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product pro = new Product();
		pro.id=123;
		pro.brand="puma";
		pro.name="kurta";
		pro.price=200.6;
				PrintWriter printwriter = resp.getWriter();
				printwriter.print("<html><body bgcolor='pink'>"
						+"<h1> thank u for selecting cloths"+pro.name +" ' '+</h1>"+"<a href='context.html'>back</a1></body></html>");
		
	}


}
