package com.jdbc;
//1
import java.sql.*;
public class JdbcUpdateDemo {
	public static void main(String[] args)throws Exception{
		//2b
		Class.forName("com.mysql.jdbc.Driver");
		
		//3
		String url="jdbc:mysql://bcp7-java-db-01.cs4gnvom3jcr.ap-south-1.rds.amazonaws.com:3306/princes.bcp7javaee";
		Connection con=DriverManager.getConnection(url,"princes","bcp7javaee");
		//4
		PreparedStatement st=con.prepareStatement("insert into  comments(Name,Email,Description,Comment) values (?,?,?,?)");
		
		st.setString(1, "Prince");
		st.setString(2, "princesingh@xebia.com");

		st.setString(3, "This is a jdbc connection");
		st.setString(4, "TestComment");
		//5
		st.executeUpdate();
		//6 ProcessResult
		//7 Close
		st.close();
		con.close();
		
	}

}
