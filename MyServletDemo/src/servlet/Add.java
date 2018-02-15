package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		requestProcess(request,response);
	}
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	requestProcess(request,response);
	}
    public void requestProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int num1=Integer.parseInt(request.getParameter("t1"));
	int num2=Integer.parseInt(request.getParameter("t2"));
	
	int result=num1+num2;
	
	PrintWriter out=response.getWriter();
	out.println(result);
    }

	}
	
	
	


