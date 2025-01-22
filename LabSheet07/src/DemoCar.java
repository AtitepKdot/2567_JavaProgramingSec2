
public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		System.out.println("Company Name: " + car.getCompanyName());
		System.out.println("Model Name: " + car.getModelName());
		System.out.println("Year: " + car.getYear());
		System.out.println("Mileage: " + car.getmileage());
		//update
		System.out.println("\nUpdate Car Details: ");
		Car carupdate = new Car("Toyoya ","Corolla ",2015,150000.0 );
			System.out.println("Company Name: " + carupdate.getCompanyName());
			System.out.println("Model Name: " + carupdate.getModelName());
			System.out.println("Year: " + carupdate.getYear());
			//Error
			carupdate.setYear(0);
			carupdate.setCompanyName(null);
			

		
	
	}
}


