import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Input Product Name\t: ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit\t: ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit\t: ");
		float pricePerUnit = input.nextFloat();
		float totalPriceProduct = productUnit * pricePerUnit;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.println("------------------------------------");
		System.out.println("Total Price is "+ frm.format(totalPriceProduct) +" baht.");
		System.out.println("------------------------------------");
		System.out.print("How many discount\t: ");
		int productDiscount = input.nextInt();
		System.out.println("------------------------------------");
		
		float totalPricewithVat = (totalPriceProduct*productDiscount/100.0f);
		String frmtotalPricewithVat = String.format("%,.2f", totalPricewithVat);
		System.out.println("Discount from "+ productDiscount +"\t" + frmtotalPricewithVat + " baht.");
		System.out.println("Amount to be paid" +"\t" + frm.format(totalPriceProduct - totalPricewithVat) +
				" baht.");


	}

}
