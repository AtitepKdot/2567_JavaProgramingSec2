import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many students in classroom: ");
		int numberofStudent = scan.nextInt();
		scan.nextLine();
		//Create an Array of student object
		Student[] stds = new Student[numberofStudent];
		
		//Input information for each student
		for (int i= 0;i < numberofStudent;i++) {
			//2.Create a new student object
			stds[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT " + (i +1));
			Line();
			//input Student's name
			System.out.print("Input student name: ");
//			String stdName = scan.nextLine();
			stds[i].setName(scan.nextLine());
			while(true) {
			 System.out.print("Input student score: ");
			 int score = scan.nextInt();
			 
			 //Consume newline character
			 scan.nextLine();
			 stds[i].setScore(score);
			 if (stds[i].checkScore()) {
				 break;
			 }else {
				 System.out.print("Input score,again:");

			 }
			}//end of while
		}
		//Display the list of students who passed
		System.out.println("LIST OF PASS STUDENTS (>=50):");
		Line();
		for(Student student : stds) {
		   	  if(student.isPass()) {
		   		  System.out.print(">> "+student.getName()+ 
		   				  " (" + student.getScore()+ ") "+
		   				  " get grade "+ findGrade(student.getScore()));
		   	  }
		}	
		scan.close();
	}//end of MainMethod
	public static  String findGrade(int score) {
		if (score>= 80 && score <= 100) {
			return "A";
		}else if (score >= 75 && score <= 79) {
			return "B+";
		}else if (score >= 70 && score <= 74) {
			return "B";
		}else if (score >= 65 && score <= 69) {
			return "C+";
		}else if (score >= 60 && score <= 64) {
			return "C";
		}else if (score >= 55 && score <= 59) {
			return "D+";
		}else if (score >= 50 && score <= 54) {
			return "D";
		}else {
			return "F";
		}
		
		
		
	}
	public static void Line() {
		
		for (int i = 1; i<=60; i++) {
			System.out.print("-");
			
		}
		System.out.println();
	}

}
