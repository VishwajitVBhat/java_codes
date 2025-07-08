package suppayi;

import java.util.HashMap;

public class Test {
	static HashMap<String,Employee> em=new HashMap<String,Employee>();
	
 public static void main(String[] args) {
	 Employee e1=new Employee("X7F3", "John Doe", "CEO", "NULL");
	 Employee e2=new Employee("POR4", "Jane Smith", "CTO", "X7F3");
	 Employee e3=new Employee("K2B9", "David Lee", "CFO", "X7F3");
	 Employee e4=new Employee("L8M5", "Michael Brown", "VP Eng", "POR4");
	 Employee e5=new Employee("A3N6", "Sarah Jones", "VP Mkt", "X7F3");
	 Employee e6=new Employee("B9Q7", "Emily Davis", "SE", "L8M5");
     Employee e7=new Employee("C6R1", "James Wilson", "MM", "A3N6");
     Employee e8=new Employee("D1S2", "Christopher Martinez", "SE", "L8M5");
     Employee e9=new Employee("E9K7", "Nancy Rodriguez", "MS", "C6R1");
     Employee e10=new Employee("F4U8", "Patricia Walker", "MS", "C5R1");
     em.put(e1.getEmployeeId(), e1);
     em.put(e2.getEmployeeId(), e2);
     em.put(e3.getEmployeeId(), e3);
     em.put(e4.getEmployeeId(), e4);
     em.put(e5.getEmployeeId(), e5);
     em.put(e6.getEmployeeId(), e6);
     em.put(e7.getEmployeeId(), e7);
     em.put(e8.getEmployeeId(), e8);
     em.put(e9.getEmployeeId(), e9);
     em.put(e10.getEmployeeId(), e10);
     
     
}
}
