import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4];
		
		for (int i = 0; i <= 4; i++) {
			System.out.print("Input Product Id 	: ");
			String id = scan.nextLine();
			System.out.print("Input Product Unit : ");
			int unit = scan.nextInt();
			System.out.print("Input Product Price : ");
			double price = scan.nextDouble();
		}
		
		
		scan.close();

	}

}
