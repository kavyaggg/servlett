import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/kk")
public class LifeCycleServlet extends GenericServlet {
	
	public void LifeCycleServlet() {
		System.out.println("default constructor created");
		
		
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("initialization");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String AppName =req.getParameter("name");
		String AppSize =req.getParameter("size");

		String AppVersion=req.getParameter("version");
		ServletOutputStream outputStream=res.getOutputStream();
		outputStream.print("appName"+AppName);

		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("close costly resources");
	}
	

}
