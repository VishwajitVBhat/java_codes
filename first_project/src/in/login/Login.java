package in.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	static Scanner sc=new Scanner(System.in);
	static void loginpage() throws SQLException {
		Connection c=ConnectionClass.giveConnection();
		Statement stmt=c.createStatement();
		System.out.println("enter uaer name:");
		String uname=sc.nextLine();
		System.out.println("enter password:");
		String pass=sc.nextLine();
//		boolean b= stmt.execute("select * from dummy1.user where uname='"+uname+"' and pass='"+pass+"'");
//		if(b) {
//			System.out.println("loged in succefully");
//		}
//		else {
//			System.out.println("not loged in");
//		}
		
		ResultSet rs=stmt.executeQuery("select * from dummy1.account where name='"+uname+"' and pass='"+pass+"'");
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			double balence=rs.getDouble(4);
			long phone=rs.getLong(5);
			String password=rs.getString(6);
			System.out.printf("|%-3d |%-15s |%-20s |%-15.2f |%-15d |%-6s\n",id,name,email,balence,phone,password);
		}
//		else {
//			System.err.println("enter currect user name and password ");
//		}
	}
public static void main(String[] args) {
	try {
		loginpage();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
