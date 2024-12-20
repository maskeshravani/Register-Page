package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/regform")

public class regestre extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String Fname = req.getParameter("name1");
		String lname = req.getParameter("name2");
		String email = req.getParameter("email1");
		String password = req.getParameter("pass1");

		PrintWriter out = resp.getWriter();
		out.print("Data Inserted Successfully......");

//		System.out.println("First Name: "+Fname);
//		System.out.println("Last Name: "+lname);
//		System.out.println("Email: "+email);
//		System.out.println("Password: "+password);
	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch197", "root", "root");

			PreparedStatement ps = c.prepareStatement("insert into register(fname, lname, email, password) values (?,?,?,?)");

			ps.setString(1, Fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, password);

			ps.executeUpdate();

			System.out.println("Data Inserted Successfully.....");
			c.close();

		} catch (Exception e) {

		}
	}
	

	
	
	

}
