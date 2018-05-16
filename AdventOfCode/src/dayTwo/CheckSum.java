package dayTwo;
import java.util.*;
public class CheckSum {

	private static int sumTotal=0;
	public static void main(String[] args) {
		
		ArrayList<String[]> stringArrays = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<17;i++) {
			String temp = sc.nextLine();
			String[] tempo = temp.split("	");
			System.out.println(Arrays.toString(tempo));
			getCheckDig(tempo);
			System.out.println(sumTotal);
		}
			
	
		
		/*for(String[] x:stringArrays) {
			getCheckDig(x);
		}*/
		System.out.println(sumTotal);
	}
	
	private static void getCheckDig(String[] array) {
		System.out.println("in the method");
		int[] intArray = new int[array.length];
		System.out.println("made the array");
		int largest=0, smallest, checkDig=0;
		for(int i=0;i<array.length;i++) {
			intArray[i]=Integer.parseInt(array[i]);
		}
		System.out.println("Made the array an int");
		smallest=intArray[0];
		for(int x:intArray) {
			if(x>largest) {
				largest=x;
			}
			if(x<smallest) {
				smallest=x;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("Largest/Smallest: "+largest+"/"+smallest);
		checkDig = largest-smallest;
		sumTotal+= checkDig;
	}
	
}
