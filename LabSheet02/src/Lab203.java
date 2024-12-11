import javax.swing.*;
import java.text.*;
public class Lab203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String WeightInput = JOptionPane.showInputDialog(null, "Input Weight:", "Input",JOptionPane.QUESTION_MESSAGE);
		double Weight = Double.parseDouble(WeightInput);
		
		String HeightInput = JOptionPane.showInputDialog(null, "Input Height:", "Input",JOptionPane.QUESTION_MESSAGE);
		double Height = Double.parseDouble(HeightInput);
		
		double hieghtm = Height /100; 
		double BMI = Weight /(hieghtm * hieghtm);
		DecimalFormat frm = new DecimalFormat("#,###.0");
		if (BMI < 18.5) {
			JOptionPane.showMessageDialog(null,"BMI = " + frm.format(BMI) +"\nYou're Under-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if(BMI >= 18.5 && BMI <= 24.9) {
			JOptionPane.showMessageDialog(null,"BMI = " + frm.format(BMI) +"\nYou're Normal-weight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (BMI >= 25.0 && BMI <= 29.9) {
			JOptionPane.showMessageDialog(null,"BMI = " + frm.format(BMI) +"\nYou're Overweight","BMI",JOptionPane.WARNING_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"BMI = " + frm.format(BMI) +"\nYou're Obesity","BMI",JOptionPane.WARNING_MESSAGE);
		}

		

	}

}