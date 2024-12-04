import javax.swing.*;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;// 9 หมายถึง0-9
		//System.out.println(balance);
		int moneyWithdraw = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : " + balance + "\nInput money to withdraw: "));
		//ตรวจสอบเงื่อนไข
		if (moneyWithdraw > balance) {
			JOptionPane.showMessageDialog(null, "EROR : Cannot withdraw more than balance",
					"Eror",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithdraw > 50000) {
			JOptionPane.showMessageDialog(null, "EROR : Cannot withdraw more than 50,000",
					"Eror",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithdraw %100!=0) {
			JOptionPane.showMessageDialog(null, "EROR : Cannot withdraw " + (moneyWithdraw%100) +" baht.",
					"Eror",
					JOptionPane.ERROR_MESSAGE);
		}
		//กรณีผ่านทุกเงื่อนไข
		else  {
			JOptionPane.showMessageDialog(null,
					"You withdraw " + moneyWithdraw + " baht."
					+ "\n1,000 = " + moneyWithdraw/1000 + 
					"\n500 = " + (moneyWithdraw%1000)/500 +
					"\n100 = " + (moneyWithdraw%500)/100);
		}
	}

}
