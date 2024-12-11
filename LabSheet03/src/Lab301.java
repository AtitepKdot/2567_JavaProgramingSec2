import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//กำหนดตัวแปรชื่อtextไว้รวมโปรแกรมเข้าด้วยกัน
		String txtConcate = "";
		//กำหนดตัวแปรชื่อ word ไว้สำหรับรับข้อความทาง Console
		String word;
		
		while(true) {
			System.out.print("Enter word: ");
			word = input.next();
			//ตรววจสอบเงื่อนไขเพื่อให้หยุดการรับข้อความ
			if (word.equalsIgnoreCase("stop")  ) {
				System.out.println("Program Terminate");
				break;
			}
			//การรวมข้อความที่ป้อนเข้าด้วยกัน
			txtConcate += word + " ";
		}//end of while
		System.out.println(txtConcate.toUpperCase());
		
		input.close();

	}

}
