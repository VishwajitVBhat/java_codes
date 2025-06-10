package amstrong;
import java.util.Scanner;

public class Amstrong {
	
	
	static int lenght(int n) {
		int l=0;
		while(n!=0) {
			n/=10;
			l++;
		}
		return l;
	}
	
	
	
	static int powerAndAdd(int n,int l) {
		int a,p=0;
		while(n!=0) {
			a=n%10;
			n/=10;
			p+=pow(a,l);
		}
		return p;
	}
	
	static int pow(int a,int l) {
		int res=1;
		for(int i=1;i<=l;i++) {
			res*=a;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,len,power;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        n=sc.nextInt();
        len=lenght(n);
        power=powerAndAdd(n,len);
  //      System.out.print(power);
        if (power==n) {
        	System.out.println(n+" is a amstrong number");
        }
        else {
        	System.out.println(n+" is not a amstrong number");
        }
	}

}
