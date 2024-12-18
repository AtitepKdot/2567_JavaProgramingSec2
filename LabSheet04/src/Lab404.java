import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputStudent();
	}
	public static void inputStudent() {
		String studentId;
		String studentSub;
		boolean isStudentIDValid, isSubjectCodeValid;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter Student Id: ");
			studentId = input.nextLine();
			
			System.out.print("Enter Subject Id: ");
			studentSub = input.nextLine();
			
			isStudentIDValid = isLength(studentId, 10);
			isSubjectCodeValid = isLength(studentSub, 7);
			if (isStudentIDValid && isSubjectCodeValid) {
				boolean isITStudent = isITStudent(studentId);
				boolean isITSubject = isITSubject(studentSub);
				System.out.print("Student Id: " + studentId);
				displayData (isITStudent, isITSubject );
				break;
			}
		}
		
	}//end main method
	public static boolean isLength(String input , int len) {
		
		return input.length() == len;
		
	}
	public static boolean isITStudent(String stId) {
		if (stId.substring(0,6) == "211311") {
			return true;
		}else {
			return false;
		}
		
	
	}
	public static boolean isITSubject(String stSub) {
		if (stSub.substring(0,2) == "21" && stSub.charAt(4) == '1') {
			return true;
		}else {
			return false;
		}
		
	}
	public static void displayData(boolean isSt , boolean isSub ) {
		System.out.println(" ");
		if (isSt == true && isSub == true) {
			System.out.println("1st year student in IT" + "\nEnroll in courses for Year 1");
		}
		else if (isSt == false && isSub == true) {
			System.out.println("is not\t1st year student in IT" + "\nEnroll in courses for Year 1");
		}
		if (isSt == true && isSub == false) {
			System.out.println("1st year student in IT" + "\nnot enroll in courses for Year 1");

		}
		else if (isSt == false && isSub == true) {
			System.out.println("is not\t1st year student in IT" + "\nEnroll in courses for Year 1");

		}
		
	}

}
