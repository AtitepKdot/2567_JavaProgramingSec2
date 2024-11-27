import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name");
		//แสดงผลและรับข้อมูลทาง Dialog Box
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit");
		int productUnit = Integer.parseInt(strProductUnit);
		//รับและแสดงผลและแสดงข้อมูลราคาทาง DialogBox
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""
				+ "Input Price per Unit: "));
		double totalPriceofProduct = productUnit * productPrice;
		double totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		//สั่งแสดงผลทางDialogBox
		String frmtotalwithVat = String.format("%,.2f", totalwithVat);
		JOptionPane.showConfirmDialog(null, "Total Price is " + totalPriceofProduct + " baht." + "\nAdd Vat 7% is " + frmtotalwithVat + " baht.");
		
		
		
		
	}

}
