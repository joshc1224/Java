package recursion;

import java.util.ArrayList;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(factor(5));
		String check ="Sore was I ere I saw Eros";
		System.out.println(isPalindrome(check.toLowerCase()));
		int[] ar = {1,2,3,4,5,6,7,8,9};
		System.out.println(binSearch(ar,99,0,ar.length));
		recursiveReverse(12345);
	}
	
	public static int factor(int n) {
		if(n==1) {
			return n;
		}else {
			return n*(factor(n-1));
		}
	}
	
	public static boolean isPalindrome(String x) {
		if(x.length()<=1) {
			return true;
		}else if (x.charAt(0)!=x.charAt(x.length()-1)) {
			return false;
		}else {return isPalindrome(x.substring(1, x.length()-1));}
	}

	public static int binSearch(int[] y, int key, int low, int high) {
		if(low>high) {
			return -1;
		}
		int middle = (low+high)/2;
		if (y[middle]==key) {
			return middle;
		}else if (middle<key) {
			return binSearch(y,key,high,middle+1);
		}else {return binSearch(y,key,middle-1,low);}
	}
	
	public static void recursiveReverse(int x) {
		
		if(x>0) {
			System.out.print(x%10);
			recursiveReverse(x/10);
		}
	}
}
