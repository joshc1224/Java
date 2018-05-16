package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

	private static int iterate=0;
	public static void main(String[] args) {
		int[] test = {5,4,2,9,1,7,3,8,6};
		System.out.println("first"+Arrays.toString(test));
		sort(test,0,test.length-1);
		System.out.println("last"+Arrays.toString(test));
	}
	
	
	public static void sort(int[] a, int from, int to) {
		if (from>=to) {return;}
		int p = partition(a,from,to);
		sort(a,from,p);
		sort(a,p+1,to);
		//System.out.println(iterate);
		//iterate++;
	}
	
	
	private static int partition(int[] a, int from, int to) {
		int pivot=a[from];
		int i = from-1;
		int j = to+1;
		while (i<j) {
			i++;while(a[i]<pivot) {i++;}
			j--;while(a[j]>pivot) {j--;}
			if(i<j) {swap(a,i,j);}
			System.out.println(iterate +" "+Arrays.toString(a));
			//iterate++;
		}
		System.out.println(j);
		return j;
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
}
