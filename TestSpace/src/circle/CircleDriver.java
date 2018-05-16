package circle;

public class CircleDriver {
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(4, "green");
		Circle circle2 = new Circle(2, "green");
		Circle circle3 = new Circle(4, "green");
		
		System.out.println(circle1.areCirclesEqual(circle3));
		
	}
	
	

}
