import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Buffet = 299;
		int isMember;
		int numberofCustomer = Integer.parseInt
				(JOptionPane.showInputDialog("How many customer per bill?"));
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		
		double totalPrice =  Buffet * numberofCustomer;
		
		//System.out.printf("Total Price is  %,.2F baht.", totalPrice);
		do {
			isMember = JOptionPane.showConfirmDialog(null, "TotalPrice is " + frm.format(totalPrice) + " baht." + "\nDo you have a member card?");

		}while (isMember == JOptionPane.CANCEL_OPTION);
		if(isMember == JOptionPane.YES_OPTION) {//if (isMember == 0); เหมือนกัน
			double priceAfterDiscount = totalPrice - (totalPrice * 10/100);
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(priceAfterDiscount) + "baht.");
		}
		else if (isMember == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice +"baht.");
		}
		
		
	}

}
