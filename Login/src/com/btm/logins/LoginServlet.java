package com.btm.logins;
import java.io.*;
import javax.servlet.*;
public class LoginServlet extends GenericServlet
{
	public LoginServlet() 
	{
		System.out.println("Servlet Object is created");
	}
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("servlet object is intialized");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String password=req.getParameter("pas");
		
		System.out.println("name is"+name);
		System.out.println("password is"+password);
	}
	@Override
	public void destroy() 
	{
		System.out.println("close  costly resources");
	}
	
}
