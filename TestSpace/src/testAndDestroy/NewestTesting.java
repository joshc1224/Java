package testAndDestroy;
import java.util.*;
public class NewestTesting {

	public static void main(String[] args) {
		
		int[] nums;
		int count=0;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		nums = new int[size];
		
		while (sc.hasNextInt()) {
			int state=sc.nextInt();
			
			switch (state) {
			
			case 1:
				nums[count]=sc.nextInt();
				count ++;
				break;
				
			case 2:
				remove(nums, highest(nums, count), count);
				count--;
				break;
				
			case 3:
				System.out.println(highest(nums, count));
			
			
			}
		}
		
		
	}
	
	public static int highest(int[] arr, int count) {
		
		int highest = arr[0];
		for (int i=0;i<count;i++) {
			if (arr[i]>highest) {
				highest = arr[i];
			}
		}
		return highest;
	}
	public static int highestIndex(int[] arr, int count) {
		
		int highest = arr[0];
		int index = 0;
		for (int i=0;i<count;i++) {
			if (arr[i]>highest) {
				highest = arr[i];
				index = i;
			}
		}
		return index;
	}
	public static void remove(int[] arr, int toRemove, int count) {
		int temp;
		for (int i=0;i<count;i++) {
			if (arr[i]==toRemove) {
				arr[i]=arr[count];
			}
		}
		
	}
	
}
