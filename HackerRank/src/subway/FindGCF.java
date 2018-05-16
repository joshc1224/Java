package subway;

public class FindGCF {

	public static int findGCF(int x, int y) {
		int GCF =0;
		x=Math.abs(x);
		y=Math.abs(y);
		int dividend, divisor;
		if (x>y) {
			dividend=x;
			divisor=y;
			
		}else{
			dividend=y;
			divisor=x;
		}
		int quotient;
		int remainder = dividend%divisor;
		while (remainder!=0) {
			dividend = divisor;
			divisor = remainder;
			quotient = dividend/divisor;
			remainder = dividend%divisor;
			
		}
		GCF=divisor;
		return GCF;
	}
	
}
