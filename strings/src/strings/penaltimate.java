package strings;
import java.util.Scanner;
public class penaltimate {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	char[] a=sc.nextLine().toCharArray();
	int word=1;
	for(char i:a) {
	if(i==' ') {
		word++;
	}
	}
	if(word==1) {
		System.out.println("no penultimate found");
	}
	else if(word==2) {
		for(char i:a) {
			if(i!=' ') {
			System.out.print(i);
			}
			else {
				break;
			}
		}	
	}
	
	
		//	else {
		//		int count=0;
		//		int j=0;
		//		while(count!=word-2) {
		//			if(a[j]==' ') {
		//				count++;
		//			}
		//			j++;
		//		}
		//		while(a[j]!=' ') {
		//			System.out.print(a[j]);
		//			j++;
		//		}
		//	}
	
             //	******** OR *********** //
	
	
	else {
		int count=0, j=a.length-1;
		while(count!=2) {
			if(a[j]==' ') {
				count ++;
			}
			j--;
		}
		j++;
		j++;
		while(a[j]!=' ') {
			System.out.print(a[j]);
			j++;
		}
	}
	
}
}
