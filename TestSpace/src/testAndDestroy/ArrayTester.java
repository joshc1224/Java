package testAndDestroy;

import java.util.Arrays;

public class ArrayTester {
	
	
	static int[] found = new int[10];
	static int foundSize=0;
	
	public static void main(String[] args) {
		
		int search=(int)(Math.random()*1000+1);
		int size = 100;
		int[][]	array = new int[size][size];
		
		for (int i=0;i<size;i++) {
			
			for (int j=0;j<size;j++) {
				array[i][j] = (int)(Math.random()*1000+1) ;
			}
		}
		for (int i=0;i<size;i++) {
			
			for (int j=0;j<size;j++) {
				int n = array[i][j];
				System.out.printf("%04d",n);
				System.out.print("|");
			}
			System.out.println("");
		}
		
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				if (array[i][j]==search) {
					addToFound(array[i][j]);
				}
			}
		}
		
		System.out.println(search +"|"+foundSize);
		found = Arrays.copyOf(found, foundSize);
		System.out.println(Arrays.toString(found));
	}
	
	private static void addToFound(int foundOne) {
		if(foundSize>=found.length) {
			found = Arrays.copyOf(found, found.length*2);
		}
		found[foundSize]=foundOne;
		foundSize++;
	}

}
