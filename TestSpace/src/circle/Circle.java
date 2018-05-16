package circle;

public class Circle {
	
	private double radius;
	private String color;
	
	public Circle(double initRadius, String initColor) {
		
		color = initColor;
		radius = initRadius;
	}
	
	public boolean areCirclesEqual(Circle circle) {
		boolean result =
				this.radius== circle.getRadius()&&
				this.color.equalsIgnoreCase(circle.getColor());
		return result;
	}

	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
}
