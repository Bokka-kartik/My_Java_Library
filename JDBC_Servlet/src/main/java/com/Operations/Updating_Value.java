package com.Operations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Update_Value")
public class Updating_Value extends HttpServlet {
	
	private static final String url="jdbc:mysql://localhost:3306/servlet";
	private static final String name="root";
	private static final String password="1234";

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		PrintWriter out=res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String salary=req.getParameter("salary");
		String id=req.getParameter("id");
		
		try {
			Connection con=DriverManager.getConnection(url,name,password);
			
			String str="update employee set salary=? where id=?";
			
			PreparedStatement ps=con.prepareStatement(str);
			
			ps.setString(1,salary);
			ps.setString(2,id);
			
			int ans=ps.executeUpdate();
			
			out.print("Value is being successful updated "+ans);
			
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
