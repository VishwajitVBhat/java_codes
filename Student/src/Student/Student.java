package Student;

public class Student {
	int id;
	String name;
	long phone_no;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student(int id, String name, long phone_no) {
		this(id,name);
		this.phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", phone_no=" + phone_no;
	}
	public static void main(String[] args) {
		Student s1=new Student(10,"Darshan");
		Student s2=new Student(20,"Sumanth",1234567890);
		System.out.println(s1+"\n"+s2);
	}
}
