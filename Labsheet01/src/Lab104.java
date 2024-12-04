import java.util.Scanner;

import javax.swing.*;
public class Lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		JOptionPane.showMessageDialog(null, "Wellcome to the payroll application");
		String Employeename = JOptionPane.showInputDialog(null, "Enter employee name :", JOptionPane.QUESTION_MESSAGE);
		String totalHour = JOptionPane.showInputDialog(null, "Enter total hour for this employee.");
		double workHour = Integer.parseInt(totalHour);
		double grossErnings = workHour * 7.5;
		double tax = grossErnings * 0.15;
		double netErnings = grossErnings - tax;
		JOptionPane.showMessageDialog(null, "Employee name : " + Employeename + "\nHours worked: $ " +  workHour + "\nHourly wage $ 7.5" + "\nGross earnings: $ " + grossErnings +
				"\nTax rate: 0.15" +"\nTax: " + tax + "\nNet earnings: $ " + netErnings);
		


	}

}
