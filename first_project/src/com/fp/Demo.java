package com.fp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	void m() {
		Connection con;
		Statement stmt;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("loaded and registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy1 ? user=root & password=root");
			System.out.println("connection estabished");
			System.out.println(con);
			stmt=con.createStatement();
			System.out.println("created platfrom");
			System.out.println(stmt);
			String qur="insert into dummy1.student values(2,'sumanth',20)";
			System.out.println(stmt.execute(qur));
			String qur1="select * from dummy1.student";
			System.out.println(stmt.execute(qur1));
			con.close();
			stmt.close();
			} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m();
	}
}
