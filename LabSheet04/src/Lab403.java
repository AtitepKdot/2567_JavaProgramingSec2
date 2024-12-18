import java.util.*;

import javax.naming.InitialContext;
public class Lab403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String fullName; //The input line entered by user.
		String firstName;//The first name, extracted from the input.
		
		System.out.println("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(" "); // find space
		firstName = fullName.substring(0 , space);		// start with index 0 to space
		//System.out.println(firstName);
		System.out.println(abbreviatName(fullName) + (firstName));
		input.close();
	}//end Main Method
	public static String abbreviatName(String fname) {
		String initailLetter = "";
		
		for (int i = 0; i < fname.length();i++) {
			if (fname.charAt(i) ==' ') {
			 initailLetter = (initailLetter + fname.charAt(i+1)).toUpperCase();
			 initailLetter = initailLetter + ".";
			}
		}//end for
		return initailLetter;
	}

}
