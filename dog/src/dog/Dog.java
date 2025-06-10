//package dog;
//
//import java.util.Scanner;
////    class Cat{
////    	static int i=10;
////    }
//    
//    
//public  class Dog {
//	
// public static void main(String []arge) {
//	 int n;
//	 int ans=0;
//	 Scanner sc=new Scanner(System.in);
//	 System.out.println("enter the number: ");
//	 n=sc.nextInt();
//	 for(int i=0;i<=n;i++) {
//		 ans=ans+i;
//		 System.out.print(ans+" ");
//	 }
//	 System.out.println("");
//	 System.out.println("Final answer is: "+ans);
// }
//}









//package dog;
//
//import java.util.Scanner;
//
//    
//public  class Dog {
//	String bread_name;
//	int count;
//	Dog(String bread_name,int count){
//		this.bread_name=bread_name;
//		this.count=count;
//	}
//	
// public static void main(String []arge) {
//	 Dog d1=new Dog("pitbull",15);
//	 System.out.println(d1.bread_name+" "+d1.count);
//	 Dog d2=new Dog("mudhol",20);
//	 System.out.println(d2.bread_name+" "+d2.count);
//	 
// }
//}







package dog;

// import java.util.Scanner;

    
public  class Dog {
	static int count=0;
	Dog(){
		count++;
	}
	
 public static void main(String []arge) {
	 
	 Dog d1=new Dog();
	 Dog d2=new Dog();
	 Dog d3=new Dog();
	 Dog d4=new Dog();
	 System.out.println(count);
	
	 
 }
}

