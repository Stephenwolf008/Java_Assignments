package assignment3;

public class DayScholar extends Student{
	private String residentialAddress;
	
	DayScholar(){}
	
	public DayScholar(int studentId, char studentType, String name, double fees, String address) {
		super(studentId, studentType, name, fees);
		this.residentialAddress = address;
	}
	
	@Override
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Residential Address: "+this.residentialAddress);
	}
}
