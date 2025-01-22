
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	Car(){
		/*companyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0;*/
		this("Unknown","Unknown",2000,0.0);
		
	}
	//Parameterize Constructor
	Car(String companyName, String modelName, int year, double mileage) {
		this.companyName = companyName;
		this.modelName = modelName;
		//Default ปีทั่ผลิต 2000 หากค่าที่ใส่ไม่ถูกต้อง
		this.year = year >= 1886? year:2000;
		this.mileage = mileage;
	}
	//getters and setters method()
	public String getCompanyName(){
		return companyName;
	}
	public void setCompanyName(String companyName) {
		if (companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
		
		
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		if (modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (this.year < 1886) {
			this.year = year;
		}else if(this.year >= 1886)
		{
			System.out.println("Error: Invalid year!");
		}
	}
	public double getmileage() {
		return mileage;
	}
	
	
		
	
}
