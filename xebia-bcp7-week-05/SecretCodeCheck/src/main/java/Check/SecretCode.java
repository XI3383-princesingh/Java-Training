package Check;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecretCode extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String Secret=req.getParameter("SecretCode");
//		Secret Codes
//		391944517244195
//		668161412820850
//		406246692791258
//		720790475575337
//		347204828342378
//		113648728125591
		
		
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			String url = "jdbc:mysql://bcp7-java-db-01.cs4gnvom3jcr.ap-south-1.rds.amazonaws.com:3306/princes.bcp7javaee";
			String User = "princes";
			String Password = "bcp7javaee";
			Connection con = DriverManager.getConnection(url, User, Password);
			
			
			Statement st=con.createStatement();
			
			
			ResultSet rs=st.executeQuery("select * from SecretCodes");
//			
//			while(rs.next()) 
//			{
//				rs.getString("Codes");
//			}

			
			boolean flag=false;
			while(rs.next())
			{
				if(Secret.equals(rs.getString("Codes")))
				{
					flag=true;
					out.println("<h1>"+"Correct Code"+"</h1>");
				}
			}
			if(flag==false) 
			{
				out.println("<h1>"+"Wrong Code"+"</h1>");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
