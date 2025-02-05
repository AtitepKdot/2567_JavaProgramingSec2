
public class Customer {
 //private two Attribute (Instant variable)
	private int id;
	private String name;
	private int discount;
	
	//Parameter Constructor
	Customer (int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}//end of Constructor
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getDiscount() {
		return this.discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String toString() {
		return getName() + "(" + getId() + ")" + getDiscount() +"%";
 	}
	
	
}//end class Method
