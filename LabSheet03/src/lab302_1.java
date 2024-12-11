import javax.swing.JOptionPane;
public class lab302_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
		
		
		
		
		while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail,again: ");
			
			if (inputEmail.endsWith("gmail.com") || inputEmail.endsWith("hotmail.com")) {
				JOptionPane.showMessageDialog(null,"Your email is : " + inputEmail);
				break;
				
			}
			else {
				JOptionPane.showMessageDialog(null,"Your email is not hotmail or gmail dot com: ");
				continue;
			}
			
		}
		
				

	}

}
