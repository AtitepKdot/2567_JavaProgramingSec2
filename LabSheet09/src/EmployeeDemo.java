import java.text.DecimalFormat;
import java.util.*;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Employee Id 	: ");
		String empId = input.next();
		input.nextLine();
		System.out.print("Input Employee Name   : ");
		String empName = input.nextLine();
		System.out.print("Input employee salary : ");
		double empSalary = input.nextDouble();
		System.out.print("Input employee sales  : ");
		double empSales = input.nextDouble();
		//Space
		System.out.println("");
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Sales emp1 = new Sales(empId,empName,empSalary,empSales);
		System.out.println(emp1.toString());
		System.out.println("Total salary " + frm.format(empSalary + emp1.getCommision()) + "bath.");
		
		
input.close();
	}//end of Main

}//end of class
