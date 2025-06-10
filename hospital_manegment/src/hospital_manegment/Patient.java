package hospital_manegment;

public class Patient {
     static int patientId;
     String nmae;
     int age;
     String medicalHistory;
     Patient(){
    	 
     }
	public int getPatientId() {
		return patientId;
	}
	
	public String getNmae() {
		return nmae;
	}
	public void setNmae(String nmae) {
		this.nmae = nmae;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 &&age<90)
		this.age = age;
	}
	public String getMedicalHistory() {
		return medicalHistory;
	}
     
}
