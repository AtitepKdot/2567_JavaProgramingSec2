import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
		
		boolean validateEmail = false;
		
		validateEmail = inputEmail.startsWith("@") || inputEmail.contains(" ");
		while(validateEmail) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail,again: ");
			
		}
		if (inputEmail.endsWith("gmail.com") || inputEmail.endsWith("hotmail.com")) {
			JOptionPane.showMessageDialog(null,"Your email is : " + inputEmail);
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Your email is not hotmail or gmail dot com:");
		}
				

	}

}
