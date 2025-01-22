
public class TestRectangle {

	public static void main(String[] args) {
		//Test Calculaltor
		Rectangle r1 = new Rectangle();
		System.out.println(r1.showData());
		Spacing();
		System.out.println("Display data using toString() method");
		System.out.println(r1);//System.out.println(r1.toString());
		Spacing();
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println(r2);
		
		//Test setters and getters method()
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println(r1);
		System.out.println("lenth is " + r1.getLength());
		System.out.println("width is " + r1.getWidth());
		Spacing();
		System.out.printf("area is %.2f%n", r1.getArea());
		System.out.printf("perieter is %.2f",r1.getPerimeter());
		
		System.out.printf("area is %.2f%n", r2.getArea());
		System.out.printf("perieter is %.2f",r2.getPerimeter());
		
	}//end main()
	public static void Spacing() {
		System.out.println();
		
	}

}
