package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ep")
public class ElectronicServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Product pro = new Product();
		pro.id=123;
		pro.brand="gsr";
		pro.name="kavyaa";
		pro.price=200.6;
		ServletContext con=getServletContext();
		String ref1=con.getInitParameter("kav");
	 String ref2   =	con.getInitParameter("kavy");
		PrintWriter printwriter = resp.getWriter();
				printwriter.print("<html><body bgcolor='pink'>"+"<h1>'"+ ref1  +" '  ' " +ref2 +" ' </h1>	" +"<h2> thanks for selecting electronic"+pro +" '' </h2>"+"<a href='context.html'>back</a1></body></html>");
		
	}

}
