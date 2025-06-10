package demo;

//public class Student {
//	String name;
//	double mockR;
//	int nod;
//	Student(String name,double mockR,int nod){
//		this.name=name;
//		this.mockR=mockR;
//		this.nod=nod;
//	}
//	Student(String name,double mockR){
//		this.name=name;
//		this.mockR=mockR;
//	}
//	Student(String name){
//		this.name=name;
//	}
//   public static void main(String[] args) {
//	Student s1=new Student("dinga",8.5,6);
//	System.out.println(s1.name+" "+s1.mockR+" "+s1.nod);
//	Student s2=new Student("gunda",6.5);
//	System.out.println(s2.name+" "+s2.mockR);
//	Student s3=new Student("guldu");
//	System.out.println(s3.name);
//}
//}




public class Student {
	String name;
	double mockR;
	int nod;
	Student(String name,double mockR,int nod){
		this(name,mockR);
		this.nod=nod;
	}
	Student(String name,double mockR){
		this(name);
		this.mockR=mockR;
	}
	Student(String name){
		this.name=name;
	}

   public static void main(String[] args) {
	
	   Student s1=new Student("dinga",8.5,6);
		System.out.println(s1.name+" "+s1.mockR+" "+s1.nod);
		Student s2=new Student("gunda",6.5);
		System.out.println(s2.name+" "+s2.mockR);
		Student s3=new Student("guldu");
		System.out.println(s3.name);
}
}
