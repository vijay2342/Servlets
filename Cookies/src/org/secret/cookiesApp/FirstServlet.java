package org.secret.cookiesApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		Cookie c=new Cookie("nmg",name);
		c.setMaxAge(200);
		resp.addCookie(c);
		PrintWriter pw=resp.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<form action='ss'>");
		pw.print("<input type='submit' value='NextServlet'>");
		pw.print("</form>");
		pw.print("</body>");
		pw.print("</html>");
		pw.close();
		
	}
}
