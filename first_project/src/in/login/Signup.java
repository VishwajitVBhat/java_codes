package in.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Signup {
	static Scanner sc=new Scanner(System.in);
//	static void createAccount() {
//		try {
//		Connection c=ConnectionClass.giveConnection();
//		System.out.println("connection estabished");
//			Statement stmt=c.createStatement();
//			System.out.println("enter name:");
//			String name=sc.next();
//			System.out.println("enter email:");
//			String email=sc.next();
//			System.out.println("enter balence:");
//			double bal=sc.nextDouble();
//			System.out.println("enter phone:");
//			long pho=sc.nextLong();
//			System.out.println("enter password:");
//			String pass=sc.next();
//			String iqur="insert into dummy1.account(name,email,bal,phone,pass) values('"+name+"','"+email+"','"+bal+"','"+pho+"','"+pass+"')";
//			int x=stmt.executeUpdate(iqur);
//			if(x>0) {
//				System.out.println("insertion seccefully.....");
//			}else {
//				System.out.println("insertion faild....");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	
	static void createAccount() {
		try {
		Connection c=ConnectionClass.giveConnection();
		c.setAutoCommit(false);
		System.out.println("connection estabished");
			System.out.println("enter name:");
			String name=sc.next();
			System.out.println("enter email:");
			String email=sc.next();
			System.out.println("enter balence:");
			double bal=sc.nextDouble();
			System.out.println("enter phone:");
			long pho=sc.nextLong();
			System.out.println("enter password:");
			String pass=sc.next();
			String iqur="insert into dummy1.account(name,email,bal,phone,pass) values('"+name+"','"+email+"','"+bal+"','"+pho+"','"+pass+"')";
			PreparedStatement pstmt=c.prepareStatement(iqur);
			int x=pstmt.executeUpdate();
			if(x>0) {
				System.out.println("insertion seccefully.....");
			}else {
				System.out.println("insertion faild....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		createAccount();
	}
}
