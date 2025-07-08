package day_25_06_2025;

class Student {
 int sid;
 String sname;
 int sub1mark;
 int sub2mark;
 int sub3mark;
 int sub4mark;
public Student(int sid, String sname, int sub1mark, int sub2mark, int sub3mark, int sub4mark) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sub1mark = sub1mark;
	this.sub2mark = sub2mark;
	this.sub3mark = sub3mark;
	this.sub4mark = sub4mark;
}
 public String getmarksAndgread() {
	 int tmark=sub1mark+sub2mark+sub3mark+sub4mark;
	 double persent=(((double)tmark)/400)*100;
	 if(tmark>=75){
		 return "Student: "+sname+"\nGrade is A+ \nTotal mark is: "+tmark+"\nPrecentage is: "+persent;
	 }
	 else if(tmark>=60 && tmark<75) {
		 return "Student: "+sname+"\nGrade is A \nTotal mark is: "+tmark+"\nPrecentage is: "+persent;
	 }
	 else if(tmark>=50 && tmark<60) {
		 return "Student: "+sname+"\nGrade is B \nTotal mark is: "+tmark+"\nPrecentage is: "+persent;
	 }
	 else if(tmark>=35 && tmark<50) {
		 return "Student: "+sname+"\nGrade is b \nTotal mark is: "+tmark+"\nPrecentage is: "+persent;
	 }
	 else {
		 return "Student: "+sname+"\nGrade is f \nTotal mark is: "+tmark+"\nPrecentage is: "+persent +"Student got failed";
	 }
	 
 }
}
public class Test{
	public static void main(String[] args) {
		
	}
}