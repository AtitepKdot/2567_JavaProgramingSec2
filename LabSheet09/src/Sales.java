import java.text.DecimalFormat;

public class Sales extends Employee{
private double sales;
Sales(String id, String name, double salary , double sales) {
	super(id,name,salary);
	this.sales = sales;
	
}
DecimalFormat frm = new DecimalFormat("#,###.00");
Sales(String id, String name, double sales) {
	super(id,name);
	this.sales = sales;
}
public double getCommision() {
	if(this.sales < 10000) {
		return 0;
	}
	else if(this.sales < 50000) {
		System.out.println("asdasdasdasdasd");
		return (this.sales - 10000 ) * 0.1;
	}
	else {
		return (this.sales - 50000) * 0.15;
	}
}
public String toString() {
	return super.getName() + "(" + super.getId() + ")" + "get Commission " + frm.format(getCommision()) + "baht.";
}


}//end of sales class method
