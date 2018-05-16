package testAndDestroy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Testing{
	
	public static void main(String[] args) {
		int size=10;
		int[] testArr=new int[size]	;
		for (int i=0;i<size;i++) 
			testArr[i]=(int)(Math.random()*10);
		
		System.out.println(Arrays.toString(testArr));
		
		for (int i=0;i<testArr.length;i++) {
			if (i%2==0) {
				System.out.print(testArr[i]+"	");
			}
		}
		testArr = Arrays.copyOf(testArr, testArr.length+1);
		System.out.println("\nafter adding"+Arrays.toString(testArr));
		for (int i=testArr.length-1;i>0;i--) {
			testArr[i]=testArr[i-1];
			System.out.println(i+" after addi"+Arrays.toString(testArr));
		}
		int [][] A = {{1,2,3,4}, {5,6,7,8}};
		System.out.println(A[0][3]);
		String[] B = {"Mike", "Betsy", "Aaron", "Steven", "Doug", "Pat", "Elise"};
		Arrays.sort(B);
		System.out.println(Arrays.toString(B));
	}
	
}
