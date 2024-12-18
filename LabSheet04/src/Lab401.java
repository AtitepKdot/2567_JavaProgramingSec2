import javax.swing.*;
public class Lab401 {

	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputEmail ();
		
		
		
	}//end of Main Method
	public static void InputEmail() {
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail:");
			if (varEmail != null && !varEmail.isEmpty()) {
				checkEmailError(varEmail);
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Email cannot be empty!!!");
			}
			ans = JOptionPane.showInputDialog("Do you want to input email address|{Y/y}:");
			
			
		}while(ans != null && ans.equalsIgnoreCase("y"));
		
	}
	public static void checkEmailError(String email) {
		while (email.startsWith("@")||email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail again:");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				checkEmail(email)
				?"Your e-maill is" + email :"Your email is not a hotmail or gmail address.");
		
	}
	public static boolean checkEmail(String email) {
		/*if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
			return true;
		}else {
			return false;
		}*/ //วิธีแรก
		
		if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
			return true;
		}
		return false;//วืธีที่สองง
	}
		
}
