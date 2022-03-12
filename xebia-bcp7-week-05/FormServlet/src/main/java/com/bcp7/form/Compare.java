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
		String CorrectPassword="bcp7javaee";
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String username=req.getParameter("Username");
		String password=req.getParameter("Password");
		out.print("<h1>");
		if(password.equals(CorrectPassword))
			out.println("Correct Password");
		else
			out.println("Wrong Password");
		out.print("</h1>");
		
	}

}
