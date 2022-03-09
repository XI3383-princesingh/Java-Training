package com.bcp7.form;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class Compare extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String username=req.getParameter("Username");
		String password=req.getParameter("Password");
		
		out.println("<h1>Username is "+username+"</h1>");
		out.println("<h1>Password is "+password+"</h1>");
	}

}
