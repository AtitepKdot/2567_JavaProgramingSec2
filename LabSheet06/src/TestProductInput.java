import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Product _product = new Product();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter product Name: "); 
		String product = input.nextLine();
		System.out.print("Enter product price: ");
		double price = input.nextInt();
		System.out.print("Enter VAT rate (%): ");
		double vat = input.nextInt();
		
		_product.setProductDetails(product, price, vat);
		_product.displayProductDetails();
		input.close();
		}

}
