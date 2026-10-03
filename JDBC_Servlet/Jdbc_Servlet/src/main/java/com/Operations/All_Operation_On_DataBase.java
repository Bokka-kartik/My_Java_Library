package com.Operations;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



//make sure that the library that you import/jar file for mysql should be inside the web-inf cuz we are trying to run on the server 
//if you cant just go to the deployment assembly and add at the server request time

@WebServlet("/Operation")
public class All_Operation_On_DataBase extends HttpServlet {
	
	private static String url="jdbc:mysql://localhost:3306/servlet";
	private static String name="root";
	private static String password="1234";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		PrintWriter out=res.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(url,name,password);
			PreparedStatement ps=null;
			String val=req.getParameter("show");
			switch (val) {
			case "1": {
				
				String str="show databases;";
					ps=con.prepareStatement(str);
					out.println("Data_Bases are as Follow");
					out.println("\n ");
				break;
			}
			case "2":{
				String str="desc employee;";
					ps=con.prepareStatement(str);
					
					out.println("The Structure of Employee table is");
					out.println("\n ");
					
					out.print("Field   Type   Null   Key   Default   Extra   ");
					out.println("\n");					
					
				break;
			}
			case "3":
			{
				String str="show tables;";
					ps=con.prepareStatement(str);
				break;
			}
			case "4":
			{
				String str="select * from student";
					ps=con.prepareStatement(str);
				break;
			}
//			case "5":
//			{
//				String str="insert into student(name,age) values('kartik',22);";
//					ps=con.prepareStatement(str);
//					int find=ps.executeUpdate();
//					out.println("value is updated to the table"+ find);
////					return ;
//				break;
//			}
			default:
				throw new IllegalArgumentException("Unexpected value: "+ val);
			}
		
			ResultSet rs=ps.executeQuery();
			if("4".equals(val)) {
				while(rs.next())
				{
					out.print(rs.getInt("id")+" ");
					out.print(rs.getString("name")+" ");
					out.println(rs.getInt("age"));
				}}
			if("1".equals(val)||"3".equals(val))
			{
				while(rs.next())
				{
					out.println(rs.getString(1));
				}
			}
			
			if("2".equals(val))
			{
				while(rs.next())
				{
					out.print(rs.getString(1)+"   ");
					out.print(rs.getString(2)+"   ");
					out.print(rs.getString(3)+"   ");
					out.print(rs.getString(4)+"   ");
					out.print(rs.getString(5)+"   ");
					out.print(rs.getString(6)+"   ");
					out.println();
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
