import java.util.*;
public class TestEmployeeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// create two Employee object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//Input data for first employee
		System.out.println("Eter details for Employee 1:");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int emp1hourWorked = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double emp1HourlyRate = scan.nextDouble();
		emp1.setEmployeeDetails(empName1, emp1hourWorked, emp1HourlyRate);
		Line('-');
		emp1.displayEmployeeDetails();
		Line('*');
		
		scan.nextLine();
		
		System.out.println("Eter details for Employee 2:");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int emp2hourWorked = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double emp2HourlyRate = scan.nextDouble();
		
		emp2.setEmployeeDetails(empName2, emp2hourWorked, emp2HourlyRate);
		Line('-');
		emp2.displayEmployeeDetails();
		Line('*');
		
		
		scan.close();
	}//end of Main Method
	//Line method
	public static void Line(char symbo) {
		for (int i = 1 ;i<50;i++) {
			System.out.print(symbo);
		}
		System.out.println( );
	}
}
