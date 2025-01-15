
public class Product {
 private String name;
 private double price;
 private double vatRate;
 
 public void setProductDetails(String Pname, double Pprice, double Vat) {
		name = Pname;
		price = Pprice;
		vatRate = Vat;
		
	}
 public double calculateTotalPrice() {

	 return price + (price * vatRate/100);
	 
 }
 public void displayProductDetails() {
	 System.out.println("Product Name:" + name);
	 System.out.println("Price (Before Vat):" + price);
	 System.out.println("Price (After Vat):" + calculateTotalPrice());
	 
 }

}


