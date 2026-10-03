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

@WebServlet("/Practice2")
public class Insert_Value extends HttpServlet{
	
	private static final String url="jdbc:mysql://localhost:3306/servlet";
	private static final String name="root";
	private static final String password="1234";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		PrintWriter out=resp.getWriter();
		
		String name1=req.getParameter("Name");
		String age=req.getParameter("Age");
		String salary=req.getParameter("Salary");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con=DriverManager.getConnection(url,name,password);
			
			String str="insert into employee(name,age,salary) values(?,?,?);";
			
			PreparedStatement ps=con.prepareStatement(str);
			
			ps.setString(1,name1);
			ps.setString(2,age);
			ps.setString(3,salary);
			
			
			int find=ps.executeUpdate();
			
			out.println("Value has been Succesfully "+find);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
