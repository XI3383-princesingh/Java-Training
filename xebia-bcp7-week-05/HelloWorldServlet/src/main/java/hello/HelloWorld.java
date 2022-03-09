package hello;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class HelloWorld extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.print("<h1>HelloWorldServlet</h1>");
	}

}
