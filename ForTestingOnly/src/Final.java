import java.util.*;

public class Final {
	
	public static void main(String[] anything) {
		int sum=0;
		double average=0.0;
		int[] test = {1,2,3,4,5,6,7,8,9,10};
		for (int i=test.length-1;i>=0;i--) {
			sum+=test[i];
		}
		average =(double)sum/test.length;
		System.out.println(average);
		
	}

	
}
