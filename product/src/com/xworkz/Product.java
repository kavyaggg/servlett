package com.xworkz;

import javax.servlet.annotation.WebServlet;

public class Product {
	public int id;
	public String name;
	public String brand;
	
	public double price;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	


}
