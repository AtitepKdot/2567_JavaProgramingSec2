import java.util.*;
import java.io.*;
public class Lab1101 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		System.out.print("Input Section: ");
		int section = input.nextInt();
		
		printHeader(section); 
		displayStudentList(section);
		
		
	}//end of Main method
	public static void printHeader(int sec) {
		System.out.println("********************************************************");
		System.out.println("\t\tList of Data for Section " + sec);
		System.out.println("********************************************************");

	}//end of printHeader MEthod
	public static void displayStudentList(int sec) throws IOException {
		try(BufferedReader readfile = new BufferedReader (new FileReader("src//txtFile//List107.txt"))) {
			String temp="";
			while((temp = readfile.readLine())!= null) {
				String[] data = temp.split("\t");
				
				if (data.length < 6 ) continue;
				
				int studentsection = Integer.parseInt(data[3]);
				
				if (studentsection == sec) {
					double midterm = Double.parseDouble(data[4]);
					double finalScore = Double.parseDouble(data[5]);
					
					System.out.printf("%s %s\t%.2f\t%.2f \t%s%n",data[0],data[2],midterm,
							finalScore,determineResult(midterm,finalScore));
				}
			}
		}//end of try
		catch(IOException e) {
			System.out.println(e.getMessage());
		}//end of catch
		
		
	}//end displayStudentList
	public static String determineResult(double mid,double fin) {
		return (mid + fin) <= 40?"Fail":"Pass";
	}
	
}//end class
