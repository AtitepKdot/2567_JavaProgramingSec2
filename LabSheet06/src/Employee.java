
public class Employee { 
	//private attribute
	private String name;
	private int hourWorked;
	private double hourlyRate;
	
	//Method to set Employee Details
	public void setEmployeeDetails(String empName , int hour , double rate) {
		name = empName;
		hourWorked = hour;
		hourlyRate = rate;
	}
	//Method to calculate salary
	public double calculateSalary() {
		double salary = hourWorked * hourlyRate;
		if(hourWorked > 40) {
			double bonus = salary * 0.10;//Bonus 10% of salary
			salary += bonus;
		}
		return salary;
	}
	//Method to display Employee details
	public void displayEmployeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Hour Worked: " + hourWorked);
		System.out.println("Hourly Rate: " + hourlyRate);
		System.out.println("Total Salary: " + calculateSalary());
	}// end of class Employee
	

}
