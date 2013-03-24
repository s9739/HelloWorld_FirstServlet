package pl.edu.pjwstk.jaz.HelloWorld;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/sayhello")
public class hello extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	
	response.getWriter().write("Serwlety sa super!.");
	// TODO Auto-generated method stub
	//super.doGet(arg0, arg1);
}
}
