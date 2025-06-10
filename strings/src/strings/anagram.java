package strings;

import java.util.Scanner;

public class anagram {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter first the string:");
	 char[] a=sc.next().toCharArray();
	 System.out.println("Enter second String:");
	 char[] b=sc.next().toCharArray();
	 sc.close();
	 if (a.length!=b.length) {
		 System.out.println("not an anagram");
	 }
	 else {
	 char c;
	 for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-2;j++) {
			if(a[i]>a[i+1]) {
				c=a[i];
				a[i]=a[i+1];
				a[i+1]=c;
			}
			if(b[i]>b[i+1]) {
				c=b[i];
				b[i]=b[i+1];
				b[i+1]=c;
			}	
		}
	 }
	 for(int i=0;i<a.length;i++) {
		 if(a[i]!=b[i]) {
			 System.out.println("not an angram");
			 return;
		 }
	 }
	 System.out.println("is a anagram");
	 }
}
}
