import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		try (// object input รับข้อมูลทาง keyboard
		Scanner input = new Scanner(System.in)) {
			try (//ประกาศ object ชื่อ WriteFile เพื่อบันทึกข้อมูลลงไฟล์โดยใช้class PrintStream
			PrintWriter writeFile = new PrintWriter(new FileWriter("src//txtFile//employee.txt",true))) {
				String answer="";
				do {
					super.header();
					System.out.print("Enter name: ");
					name = input.next();
					System.out.print("Enter department: ");
					dept = input.next();
					//บันทึกข้อมูลชื่อกับแผนกลงไปในไฟล์ที่กำหนดไว้
					writeFile.println(name + "\t" + dept);
					System.out.print("Do you want to input data again? : ");
					answer = input.next();
				}while(answer.equals("y"));
			}
		}
		
	}
	public void searchData() {
		try  {
			//use class Scanner for read file
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			int i =0;
			boolean check = false;
			super.header();
			while (readFile.hasNext()) {
				name =readFile.next();
				dept = readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i + ")" + name);
					check = true;
					
				}
				
			}
			if(check) {
				super.header();
				System.out.print("Employee in dep " + super.getDept() +
						"is " + i + " person(s).");
				}
			else {
				System.out.println("\nSorry, no dept: " + super.getDept() + " in file.");
			}
			
		}catch(IOException e) {
			System.out.println("\nSalarry, file not found...");
		}
	}
}
