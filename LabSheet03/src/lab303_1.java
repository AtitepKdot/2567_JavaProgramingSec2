import javax.swing.*;

public class lab303_1 {

	public static void main(String[] args) {
		String emailInput = JOptionPane.showInputDialog("Input your e-mail: ");

		while(emailInput.startsWith("@")|| emailInput.contains(" ")) {
			emailInput = JOptionPane.showInputDialog("Input your e-mail, again: ");
		}
		
		while(true) {
			if(emailInput.endsWith("@gmail.com")||emailInput.endsWith("@hotmail.com")) {
					JOptionPane.showMessageDialog(null,"Your e-mail is " + emailInput);
					break;		
			} else {
				JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail dot com " );
				emailInput = JOptionPane.showInputDialog("Input your e-mail, again: ");
			}
		}
	}
}