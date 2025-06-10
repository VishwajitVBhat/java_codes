package strings;

import java.util.Scanner;

public class Panagram {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	char a[]=sc.next().toCharArray();
	int count=0;
	for(int j=65,k=97; j<=90; j++,k++){
		for(char i:a) {
		if(i==j||i==k){
			count++;
			break;
		}
	}
		
		}
	if(count==26) {
		System.out.println("is panagram");
	}
	else {
		System.out.println("not panagram");
	}
	}
}
