package subway;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> finalNums = new ArrayList<Integer>();
		try {
			int length = sc.nextInt();
			int i=0;
			while (i<length*2) {
				list.add(sc.nextInt());
				i++;
			}
			
		}catch(InputMismatchException ex) {
			System.exit(-1);
		}
		
		for (int i=0;i<list.size();i++) {
			int x, y, gcf, maxWide, maxLong, maxOverall;
			x=list.get(i);
			y=list.get(i+1);
			gcf=findGCF(x,y);
			maxWide=x/gcf;
			maxLong=y/gcf;
			maxOverall=maxLong*maxWide;
			//System.out.println(gcf);
			finalNums.add(maxOverall);
			i++;
		}
		
		for (Integer x:finalNums) {
			System.out.println(x);
		}
		
		
	}
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
