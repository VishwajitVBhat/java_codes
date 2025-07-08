package suppayi;

public class Employee {
   private String employeeId;
   private String employeeName;
   private String employeeDesignation;
   private String managerEmployeeId;
   public Employee(String employeeId, String employeeName, String employeeDesignation, String managerEmployeeId) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.managerEmployeeId = managerEmployeeId;
      }
		public String getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmployeeDesignation() {
			return employeeDesignation;
		}
		public void setEmployeeDesignation(String employeeDesignation) {
			this.employeeDesignation = employeeDesignation;
		}
		public String getManagerEmployeeId() {
			return managerEmployeeId;
		}
		public void setManagerEmployeeId(String managerEmployeeId) {
			this.managerEmployeeId = managerEmployeeId;
		}
		@Override
		public String toString() {
			return employeeName + "("+employeeDesignation + "-" +employeeId + ")"; 
			}
		

}
   
