package testAndDestroy;

import java.util.Arrays;

public class WelcomeMe {
	
	public static void main(String[] args) {
		
		int[][] testing = new int[11][10];
		init(testing);
		System.out.println(Arrays.toString(testing[0]));
		System.out.println(Arrays.toString(testing[1]));
		System.out.println(Arrays.toString(testing[2]));
		System.out.println(Arrays.toString(testing[3]));
		System.out.println(Arrays.toString(testing[4]));
		System.out.println(Arrays.toString(testing[5]));
		System.out.println(Arrays.toString(testing[6]));
		System.out.println(Arrays.toString(testing[7]));
		System.out.println(Arrays.toString(testing[8]));
		System.out.println(Arrays.toString(testing[9]));
		System.out.println(Arrays.toString(testing[10]));
	}
	
	public static void init(int[][] arr) {
		
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = i*(j+1);
			}
		}
		
	}

}
