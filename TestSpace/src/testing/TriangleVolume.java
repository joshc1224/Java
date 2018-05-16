package testing;

public class TriangleVolume {
	
	 public static double triangleArea(double x1, double y1,
		      double x2, double y2, double x3, double y3)
	{
	 	double x3f, x2f, x1f, y3f, y2f, y1f;
	 		x3f = x3 - x3;
	 		y3f = y3 - y3;
	 		x1f = x1 -x3;
	 		y1f = y1 - y3;
	 		x2f = x2 - x3;
	 		y2f = y2 - y3;
	 		double volume = Math.abs(x1f*y2f-x2f*y1f)/2;
	 		return volume;
		 
	}



	public static void main(String[] args) {
		
		double result = TriangleVolume.triangleArea(0, 0, 5, 4, 8, 2);
		System.out.println(result);
	}
}