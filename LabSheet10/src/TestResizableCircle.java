
public class TestResizableCircle {

	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(10.0);
		System.out.println(rc);
		String frmResult = String.format("%.2f", rc.getPerimeter());
		System.out.println("Perimeter: %.2f" + frmResult);
		System.out.printf("Area: %.2f", + rc.getArea()) ;
		Line();
		rc.resize(50);
		System.out.println("\nAfter resize(50%): " + rc.toString());
		System.out.println("Perimeter: "+ frmResult);
		System.out.printf("Area: %.2f", + rc.getArea());

	}
	public static void Line() {
		for (int i =0; i< 50; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
