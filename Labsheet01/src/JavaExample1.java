import java.util.*;
import java.text.*;
public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนด object ในการรับข้อมูลทางKeyBoard
		Scanner input = new Scanner (System.in);
		//กำหนด object ในรูปแบบตัวเลข
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//รับและแสดงผลชื่อสินค้า
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		//แสดงและรับข้อมูลแสดงสินค้า
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		System.out.println();//เว้นบรรทัด
		//คำนวนหาผลรวมของสินค้่า
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total Price is " + frm.format(totalPriceofProduct) + " baht.");
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		//System.out.println("Add VAT 7% is "+ frm.format(totalwithVat) + " baht.");
		String frmtotalwithVat = String.format("%,.2f", totalwithVat);
		System.out.println("Output using String.format");
		//float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		System.out.println("Add VAT 7% is "+ frmtotalwithVat + " baht.");
		

		
		
		
		input.close();

	}

}
