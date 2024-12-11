
import java.util.*;
public class IncomeTaxCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare constants first (variables may use these constants)
		Scanner input = new Scanner(System.in);
		 final double TAX_RATE_ABOVE_20K = 0.1;
		 final double TAX_RATE_ABOVE_40K = 0.2;
		 final double TAX_RATE_ABOVE_60K = 0.3;
		 // Declare variables
		 int taxableIncome;
		 double taxPayable;
		 System.out.print("Enter the taxable income: $");
	      taxableIncome = input.nextInt();
		 // Compute tax payable in "double" using a nested-if to handle 4 cases
		 if (taxableIncome <= 20000) { // [0, 20000]
		 taxPayable = 0.0;
		 } else if (taxableIncome <= 40000) { // [20001, 40000]
		 taxPayable = TAX_RATE_ABOVE_20K * (taxableIncome-20000);
		 } else if (taxableIncome <= 60000) { // [40001, 60000]
		 taxPayable = (TAX_RATE_ABOVE_40K * (taxableIncome-40000)+(TAX_RATE_ABOVE_20K*20000));
		 } else {
			 taxPayable = (TAX_RATE_ABOVE_60K * (taxableIncome-60000)+(TAX_RATE_ABOVE_20K*20000)+((TAX_RATE_ABOVE_40K*20000)));
		 }

	}

}