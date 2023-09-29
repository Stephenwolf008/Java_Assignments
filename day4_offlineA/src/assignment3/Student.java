package assignment3;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	Student(){}
	
	public Student(int studentId, char studentType, String fName, String lName) {
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = fName + " " + lName;
	}
	
	public Student(int studentId, char studentType, String studentName, double feesPerMonth) {
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String fName, String lName) {
		this.studentName = fName + " " + lName;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void displayStudentDetails() {
		System.out.println("Id: "+this.studentId);
		System.out.println("Type: "+this.studentType);
		System.out.println("Name: "+this.studentName);
		System.out.println("Fees: "+this.feesPerMonth);
	}
	
}
