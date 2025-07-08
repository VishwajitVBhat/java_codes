package in.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	static Scanner sc=new Scanner(System.in);
	static void createAccount() {
		try {
		Connection c=ConnectionClass.giveConnection();
		c.setAutoCommit(false);
		System.out.println("connection estabished");
		String iqur="insert into dummy1.account(name,email,bal,phone,pass) values(?,?,?,?,?)";
		PreparedStatement pstmt=c.prepareStatement(iqur);
		for(int i=1;i<=5;i++) {
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
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setDouble(3,bal);
			pstmt.setLong(4, pho);
			pstmt.setString(5,pass);
			int x=pstmt.executeUpdate();
			c.commit();
			if(x>0) {
				System.out.println("insertion seccefully.....");
			}else {
				System.out.println("insertion faild....");
			}
		  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createAccount();
	}

}
