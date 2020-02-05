package com.xworkz.pr;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FoodStreetServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String area=req.getParameter("area");
		String stallName=req.getParameter("stallName");
		String noOfItems=req.getParameter("noOfItems");
		String type=req.getParameter("type");
		ServletOutputStream outputstream=resp.getOutputStream();
		
		outputstream.print("thank u for visiting"+stallName);

	}

}
