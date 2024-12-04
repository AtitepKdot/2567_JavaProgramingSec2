import java.util.Scanner;
import javax.swing.*;

public class Lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String Parkingminutes = JOptionPane.showInputDialog("Input time parking (minute): ");
		int minutes = Integer.parseInt(Parkingminutes);
		int hour = minutes/60;
		int minutesRemain = minutes % 60;
		
		
		
		double totalprice = hour * 50 + (minutesRemain * 0.25); 
		
		JOptionPane.showMessageDialog(null, "You parking "
				+  hour + " Hour " + minutesRemain + " Minute." + "\nAmount to be paid is " + totalprice +" baht.");
		
		
		
				
		
		
		
		
		
	}

}
