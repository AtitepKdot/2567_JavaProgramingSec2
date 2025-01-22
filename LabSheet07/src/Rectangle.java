
public class Rectangle {
/*private float length;
private float width;

//Default Constructor
Rectangle() {
	length = 1.0f;
	width = 1.0f;
	
}*/
	private float length = 1.0f;
	private float width = 1.0f;
	
	//Default Constructor
	Rectangle() {}
		//Parameterize Constructor
			
	Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	//Getter and Setter method
	public float getLength() {
		return length;
		
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	//Method to calculate area
	public double getArea() {
		
		return this.length * this.width;
	}
	//Method to calculate parameter
	public double getPerimeter() {
		return 2 *(this.length + this.width);
	}
	public String showData( ) {
		return "Rectangle[length = " + this.length + ",width = " + this.width + "]";
	}
	//Method to display using toString() 
	public String toString() {
		return "Rectangle[length = " + this.length + ",width = " + this.width + "]";
	}
	
}
