<%@ page  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.bcp7.user.UserDetails" %>    
    
<!DOCTYPE html>
<html>

<meta charset="ISO-8859-1">


<body>
	<% 
	
	String username=request.getParameter("Username");
	String password=request.getParameter("Password");
	
	UserDetails user=new UserDetails();
	user.setUsername(username);
	user.setPassword(password);
	
	
	
	out.println("<h1> Hi "+user.getUsername()+" Your password is "+user.getPassword()+"</h1>");
	out.println("<h1>The date and time is</h1>");
	%>

	<%@ page language="java"%>
	<h1>
		<%=new java.util.Date()%>
	</h1>
</body>
</html>