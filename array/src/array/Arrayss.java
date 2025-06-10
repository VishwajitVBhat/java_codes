package array;
import java.util.Scanner;
//public class Arrayss {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n;
//	System.out.print("enter numbers of elements: ");
//	n=sc.nextInt();
//	int[] a=new int[n];
//	System.out.println("enter the elements in array: ");
//	for(int i=0;i<=a.length-1;i++) {
//	a[i]=sc.nextInt();
//	}
//	System.out.print("Array is: ");
//	for(int i=0;i<=a.length-1;i++) {
//		System.out.print(a[i]+" ");
//	}
//	}
//}


//public class Arrayss {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n;
//	System.out.print("enter numbers of elements: ");
//	n=sc.nextInt();
//	int[] a=new int[n];
//	System.out.println("enter the elements in array: ");
//	for(int i=0;i<=a.length-1;i++) {
//	a[i]=sc.nextInt();
//	}
//	System.out.print("Array is: ");
//	for(int i=0;i<=a.length-1;i++) {
//		if(a[i]%2==0) {
//		System.out.print(a[i]+" ");
//		}
//	}
//	}
//}



//public class Arrayss{
//	static void prime(int x) {
//		boolean flage=false;
//		if(x==0||x==1) {
//			flage=true;
//		}
//		for(int i=2;i<=x/2;i++) {
//			if(x%i==0) {
//				flage=true;
//				break;
//			}
//		}
//		if(flage==false) {
//			System.out.print(x+" ");
//	}
//	}
//	public static void main(String[] args) {
//		int n,i;
//		boolean flage=false;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter num of arrays: ");
//		n=sc.nextInt();
//		int[] a=new int[n];
//		System.out.println("enter the elements in to array: ");
//		for(i=0;i<=a.length-1;i++) {
//			a[i]=sc.nextInt();	
//		}
//		for(i=0;i<=a.length-1;i++) {
//			prime(a[i]);
//			
//		}
//	}
//}



//public class Arrayss {
//	
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n,sum=0;
//	System.out.print("enter numbers of elements: ");
//	n=sc.nextInt();
//	int[] a=new int[n];
//	System.out.println("enter the elements in array: ");
//	for(int i=0;i<=a.length-1;i++) {
//	a[i]=sc.nextInt();
//	}
//	System.out.print("Array is: ");
//	for(int i=0;i<=a.length-1;i++) {
//		sum+=a[i];
//	}
//	System.out.println(sum+" ");
//	}
//}

//public class Arrayss {
//	
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n,sum=0;
//	System.out.print("enter numbers of elements: ");
//	n=sc.nextInt();
//	int[] a=new int[n];
//	System.out.println("enter the elements in array: ");
//	for(int i=0;i<=a.length-1;i++) {
//	a[i]=sc.nextInt();
//	}
//	System.out.print("Array is: ");
//	for(int i=0;i<=a.length-1;i++) {
//		if(a[i]%2==0) {
//		sum+=a[i];
//		}
//	}
//	System.out.println(sum+" ");
//	}
//}



//public class Arrayss {
//	static int prime(int x) {
//		boolean flage=false;
//		if(x==0||x==1) {
//			flage=true;
//		}
//		for(int i=2;i<=x/2;i++) {
//			if(x%i==0) {
//				flage=true;
//				break;
//			}
//		}
//		if(flage==false) {
//			return x;
//	}
//		else {
//			return 0;
//		}
//	}
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n,sum=0;
//	System.out.print("enter numbers of elements: ");
//	n=sc.nextInt();
//	int[] a=new int[n];
//	System.out.println("enter the elements in array: ");
//	for(int i=0;i<=a.length-1;i++) {
//	a[i]=sc.nextInt();
//	}
//	System.out.print("Array is: ");
//	for(int i=0;i<=a.length-1;i++) {
//		sum+=prime(a[i]);
//	}
//	System.out.println(sum+" ");
//	}
//}




//public class Arrayss {
//	static int len(int n) {
//		int l=0;
//		while(n!=0) {
//			n/=10;
//			l++;
//		}
//		return l;
//	}
//	static int pow(int n,int l) {
//		int p=1;
//		for(int i=1;i<=l;i++) {
//			p*=n;
//		}
//		return p;
//	}
//	static int amstrong(int n,int l ) {
//		int a=0,ams=0;
//		while(n!=0) {
//			a=n%10;
//			ams+=pow(a,l);
//			n/=10;
//		}
//		return ams;
//	}
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n,sum=0;
//	System.out.print("enter numbers of elements: ");
//	n=sc.nextInt();
//	int[] a=new int[n];
//	System.out.println("enter the elements in array: ");
//	for(int i=0;i<=a.length-1;i++) {
//	a[i]=sc.nextInt();
//	}
//	System.out.print("Array is: ");
//	for(int i=0;i<=a.length-1;i++) {
//		if(amstrong(a[i],len(a[i]))==a[i]) {
//		sum+=a[i];
//		}
//	}
//	System.out.println(sum+" ");
//	}
//}









// # bubbal sort:


//public class Arrayss {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n;
//	System.out.print("enter numbers of elements: ");
//	n=sc.nextInt();
//	int[] a=new int[n];
//	System.out.println("enter the elements in array: ");
//	for(int i=0;i<=a.length-1;i++) {
//	a[i]=sc.nextInt();
//	}
//	System.out.println("sorted array is: ");
//	for (int j=0;j<=a.length-1;j++) {
//		for(int i=0;i<=a.length-2;i++) {
//			if(a[i]>a[i+1]) {
//				a[i]=a[i]+a[i+1];
//				a[i+1]=a[i]-a[i+1];
//				a[i]=a[i]-a[i+1];
//			}
//		}	
//	}
//	for(int i=0;i<=a.length-1;i++) {
//		System.out.print(a[i]+" ");
//		}
//	}
//}






// # binary search


public class Arrayss {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,x,left,right,mid;
	System.out.print("enter numbers of elements: ");
	n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the elements in array: ");
	for(int i=0;i<=a.length-1;i++) {
	a[i]=sc.nextInt();
	}
	System.out.println("enter the searching element: ");
	x=sc.nextInt();
	left=a[0];
	right=a.length-1;
	while(left<=right) {
		mid=(left+right)/2;
		if(x==a[mid]) {
			System.out.println("element is found");
			return;
		}
		else if(x>a[mid]) {
			right=mid-1;
		}
		else {
			left=mid+1;
		}
	}
	System.out.println("not found");
	}
}

