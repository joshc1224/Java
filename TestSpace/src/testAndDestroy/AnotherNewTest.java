package testAndDestroy;

import java.util.*;

public class AnotherNewTest {

	public static void main(String[] args) {
		int size, arrayCount=0, upper=0, minimum, opsCount=0;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		minimum=sc.nextInt();
		int[] randArr = new int[size];
		int count = size;
		while(arrayCount<count) {
			randArr[arrayCount]=sc.nextInt();
			arrayCount++;
			//System.out.println(arrayCount+" "+Arrays.toString(randArr));
		}
		Arrays.sort(randArr);
		//System.out.println(Arrays.toString(randArr));
		
		
			while (randArr.length>1&&randArr[0]<minimum) {
				randArr[1]=(randArr[0]+(2*randArr[1]));
				randArr = zeroOut(randArr, count);
				count--;
				Arrays.sort(randArr);
				opsCount++;
				//System.out.println(opsCount);
			}
		
		if(randArr[0]>=minimum) {
			System.out.println(opsCount);
		}else {System.out.println(-1);}

		//randArr = Arrays.copyOf(randArr, count);*/
		//System.out.println(Arrays.toString(randArr));
		
	}
	
	
	public static int[] zeroOut(int[] arr, int count) {
		if (count>=arr.length) {
			arr = Arrays.copyOf(arr, 2*arr.length);
		}
		for (int i=0;i<=count;i++) {
			arr[i]=arr[i+1];
			//System.out.println(Arrays.toString(arr));
		}
		count --;
		return Arrays.copyOf(arr, count);
	}
	
	public static int[] randomArray(int size, int lowerLimit, int upperLimit) {
		
		int [] randos=new int[size];
		for (int i=0;i<randos.length;i++) {
			randos[i]=(int)(Math.random()*(upperLimit-lowerLimit)+lowerLimit);
		}
		return randos;
	}
	
	
	
	
}
