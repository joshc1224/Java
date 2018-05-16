package selectionSort;
import java.util.Arrays;
public class SelectionSort {
	
	public static int[] sortForLow(int[] arr) {
		System.out.println("input"+Arrays.toString(arr));
		for (int i=0;i<arr.length;i++) {
			
			for (int j=i;j<arr.length;j++) {
				int temp=0;
				int lowest = arr[i];
				if (arr[j]<lowest) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					System.out.println(Arrays.toString(arr)+"first "+i);
					
				}
				
			}
			
		}
		return arr;
	}
	public static int[] sorts (int[] arr) {
		int min, temp;
		for (int index =0;index<arr.length-1;index++) {
			min = index;
			
			for (int scan = index+1;scan <arr.length;scan++) {
				if (arr[scan]<arr[min]) 
					min =scan;				
			}
			temp = arr[min];
			arr[min]=arr[index];
			arr[index]=temp;
			System.out.println(Arrays.toString(arr)+"second	"+index);
		
		}
		return arr;
	}

	public static void main(String[] args) {
		//int[] test = {99,10000,3,0,-1,344};
		int[] test2= {5,4,3,2,1};
		//sortForLow(test);
		sorts(test2);
	}
}
