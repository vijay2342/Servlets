package org.secret.cookiesApp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c[]=req.getCookies();
		System.out.println(c[0].getValue());
	}
}
