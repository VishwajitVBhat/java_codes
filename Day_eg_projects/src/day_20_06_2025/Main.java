package day_20_06_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer("varun");
		Customer c2 = new Customer("tarun");
		Customer c3 = new Customer("vishesh");
		List<Customer> clist = new ArrayList<Customer>();
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		System.out.println(clist);

		int m,n,x;
		do {
			System.out.println("enter your choice \n1. enter name \n2. exit");
			m = sc.nextInt();
			if (m == 2) {
				System.exit(0);
			} else if (m == 1) {
				System.out.println("enter customer user name");
				String name = sc.nextLine(); 
				for (Customer c : clist) {
					if (c.uname.equals(name)) {
						do {
							System.out.println("enter the option \n1. add products \n2. get grand total\n3. back to main menu");
							x = sc.nextInt();
							if (x == 1) {

								System.out.println("pick the product \n1. pen \n2. notebook \n3. book \n4. pencil");
								n = sc.nextInt();
								System.out.println("enter the quantity");
								int y = sc.nextInt();
								switch (n) {
								case 1: {
									Products p1 = new Products(11, "pen", y, 10);
									c.added.add(p1);
									break;
								}
								case 2: {
									Products p2 = new Products(12, "notebook", y, 100);
									c.added.add(p2);
									break;
								}
								case 3: {
									Products p3 = new Products(13, "book", y, 200);
									c.added.add(p3);
									break;
								}
								case 4: {
									Products p4 = new Products(14, "pencil", y, 5);
									c.added.add(p4);
									break;
								}
								default: {
									System.out.println("please enter correct product number");
								}
								}

							} 

							else if (x == 2) {
								double gtotal = 0;
								System.out.println("|Product Name | Quantity | Price   | Total  |");
								System.out.println("==============================================");
								for (Products p : c.added) {
									System.out.println("--------------------------------------------");
									System.out.println(p);
									System.out.println("--------------------------------------------");
									gtotal += p.total;
								}
								System.out.println("==============================================");
								System.out.printf("Grand total = %.2f\n", gtotal);
							}else if(x==3) {
								break;
							}
							else {
								System.out.println("enter the correct option");
							}
						}while(x!=1||x!=2);
					}
				}} else {
					System.out.println("enter the correct option");
				}
		} while (m != 2);
		sc.close();
		clist.clear();
	}
}