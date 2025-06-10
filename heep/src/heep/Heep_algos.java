package heep;
import java.util.Scanner;
//public class Heep_algos {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int[] pos=new int[10];
//		int[] neg=new int[10];
//		int n;
//		System.out.println("enter numof array:");
//		n= sc.nextInt();
//		System.out.println("enter values:");
//		int i,x;
//		for(i=0;i<=n-1;i++) {
//			x=sc.nextInt();
//			if(x>=0) {
//				pos[x]++;
//			}
//			else {
//				x=x*(-1);
//				neg[x]++;
//			}
//		 }
//		for(i=0;i<=pos.length-1;i++) {
//			System.out.print(pos[i]+" ");
//		}
//		System.out.println("");
//		for(i=0;i<=neg.length-1;i++) {
//			System.out.print(neg[i]+" ");
//		}
//	}
//}







//public class Heep_algos {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int[] pos=new int[100];
//		int[] neg=new int[100];
//		int n;
//		System.out.print("enter numof array:");
//		n= sc.nextInt();
//		System.out.println("enter values:");
//		int i,x;
//		for(i=0;i<=n-1;i++) {
//			x=sc.nextInt();
//			if(x>=0) {
//				pos[x]++;
//			}
//			else {
//				x=x*(-1);
//				neg[x]++;
//			}
//		 }
//		System.out.print("enter search to be element:");
//		x=sc.nextInt();
//		if(x>0) {
//			System.out.println("count="+pos[x]);
//		}
//		else {
//			x=x*(-1);
//			System.out.println("count="+neg[x]);
//		}
//	}
//
//}




//class Heep_algos{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner (System.in);
//		int pos[]=new int[100];
//		int nag[]=new int[100];
//		int n,i,x;
//		System.out.println("ente numof element:");
//		n=sc.nextInt();
//		System.out.println("enter values:");
//		for(i=0;i<=n-1;i++) {
//			x=sc.nextInt();
//			if(x>=0) {
//				pos[x]++;
//			}
//			else {
//				x=x*-1;
//				nag[x]++;
//			}
//		}
//		System.out.println("updated array is:");
//		for(i=0;i<=99;i++) {
//			if(pos[i]!=0) {
//				System.out.print(i+" ");
//			}
//			if(nag[i]!=0) {
//				System.out.print(i*-1+" ");
//			}
//		}
//	}
//}






//class Heep_algos{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner (System.in);
//		int pos[]=new int[100];
//		int nag[]=new int[100];
//		int n,i,x;
//		System.out.println("ente numof element:");
//		n=sc.nextInt();
//		System.out.println("enter values:");
//		for(i=0;i<=n-1;i++) {
//			x=sc.nextInt();
//			if(x>=0) {
//				pos[x]++;
//			}
//			else {
//				x=x*-1;
//				nag[x]++;
//			}
//		}
//		System.out.println("not duplicate array is:");
//		for(i=0;i<=99;i++) {
//			if(pos[i]!=0) {
//				System.out.println(i+"="+pos[i]);
//			}
//			if(nag[i]!=0) {
//				System.out.println(i*-1+"="+nag[i]);
//			}
//		}
//	}
//}





//class Heep_algos{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner (System.in);
//		int pos[]=new int[100];
//		int nag[]=new int[100];
//		int n,i,x;
//		System.out.println("ente numof element:");
//		n=sc.nextInt();
//		System.out.println("enter values:");
//		for(i=0;i<=n-1;i++) {
//			x=sc.nextInt();
//			if(x>=0) {
//				pos[x]++;
//			}
//			else {
//				x=x*-1;
//				nag[x]++;
//			}
//		}
//		System.out.println("sotted array whitout duplicates is:");
//		for(i=99;i>=0;i--) {
//		if(nag[i]!=0) {
//			System.out.print(i*-1+" ");
//		}
//		}
//		for(i=0;i<=99;i++) {
//			if(pos[i]!=0) {
//				System.out.print(i+" ");
//			}
//			
//		}
//	}
//}








//class Heep_algos{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner (System.in);
//		int pos[]=new int[100];
//		int nag[]=new int[100];
//		int n,i,x;
//		System.out.println("ente numof element:");
//		n=sc.nextInt();
//		System.out.println("enter values:");
//		for(i=0;i<=n-1;i++) {
//			x=sc.nextInt();
//			if(x>=0) {
//				pos[x]++;
//			}
//			else {
//				x=x*-1;
//				nag[x]++;
//			}
//		}
//		System.out.println("sotted array whitout duplicates is:");
//		for(i=99;i>=0;i--) {
//		if(nag[i]!=0) {
//			for(int j=0;j<=nag[i]-1;j++) {
//			System.out.print(i*-1+" ");
//			}
//		}
//		}
//		for(i=0;i<=99;i++) {
//			if(pos[i]!=0) {
//				for(int j=0;j<=pos[i]-1;j++){
//				System.out.print(i+" ");
//				}
//			}
//			
//		}
//	}
//}







//class Heep_algos{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int pos[]=new int[100];
//		int nag[]=new int[100];
//		int i,x,n;
//		System.out.println("enter num elements:");
//		n=sc.nextInt();
//		System.out.println("enter elements:");
//		for(i=0;i<=n-1;i++) {
//			x=sc.nextInt();
//			if(x>=0) {
//				pos[x]++;
//			}
//			else {
//				x=x*-1;
//				nag[x]++;
//			}
//		}
//		for(i=0;i<=99;i++) {
//			if(pos[i]!=0) {
//				System.out.println(i+"="+pos[i]);
//			}
//			if(nag[i]!=0) {
//				System.out.println(i*-1+"="+nag[i]);
//			}
//		}
//		
//	}
//}