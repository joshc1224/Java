package testAndDestroy;
import java.util.Arrays;
   
public class NewTest
{
	
	public static int linSearch(int[] arr, int search) {
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==search) {
				return i;
			}
		}
		return -1;
	}
	public static int minPos(int[] arr, int minPos) {
		int smallest=arr[minPos];
		int lowIndex=minPos;
		for (int i = minPos;i<arr.length;i++) {
			if (arr[i]<smallest) {
				smallest=arr[i];
				lowIndex=i;
			}
		}
		return lowIndex;
	}
	public static void swap(int[] arr, int to, int from) {
		int temp = arr[to];
		arr[to]=arr[from];
		arr[from]=temp;
	}
	public static void sort(int[] args) {

		for (int i=0;i<args.length;i++) {
			swap(args, i, minPos(args, i));
		}
		//System.out.println(Arrays.toString(test));
	}
	public static int[] randomArray(int size, int lowerLimit, int upperLimit) {
		
		int [] randos=new int[size];
		for (int i=0;i<randos.length;i++) {
			randos[i]=(int)(Math.random()*(upperLimit-lowerLimit)+lowerLimit);
		}
		return randos;
	}
	public static void main(String[] args) {
		
		StopWatch timer1 = new StopWatch();
		timer1.start();
		int size=(int) Math.pow(20, 5), lower = 0, upper = 100;
		//int[] random = randomArray(size, lower, upper);
		int[] random2 = randomArray(size, lower, upper);
		//System.out.println("0 "+Arrays.toString(random));
		//System.out.println(Arrays.toString(random2));
		timer1.stop();
		System.out.println(timer1.getElapsedTime()+" to make the arrays");
		//shifting(random);
		/*StopWatch timer2=new StopWatch();
		timer2.start();
		shifting(random2);
		timer2.stop();*/
		StopWatch timer3 = new StopWatch();
		timer3.start();
		System.out.println("timer Started");
		shifting(random2);
		timer3.stop();
		System.out.println(timer3.getElapsedTime()+" to sort by insertion");
		//sort(random2);
		StopWatch timer4 = new StopWatch();
		StopWatch timer5 = new StopWatch();
		timer5.start();
		linSearch(random2, 1000);
		timer5.stop();
		System.out.println(timer5.getElapsedTime()+" to search by linear");
		timer4.start();
		binSearch(random2, 55);
		timer4.stop();
		
		//System.out.println(timer2.getElapsedTime()+" to sort by Shift");
		
		
		System.out.println(timer4.getElapsedTime()+" to search by binary");
	}
		/*int row=5, col=10;
		int[][] rando = new int[row][col];
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				rando [i][j]= (int)(Math.random()*(20-0));
		
			}
		
		}System.out.println(rando[0].length+" is width");
		System.out.println(rando.length+" is height");
		System.out.println("\n");
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(rando[i][j]+"|");
			}
			System.out.print("\n");
		}
		
	}*/
	public static void shifting(int[] arr) {
		
		for (int index = 1; index<arr.length;index++) {
			int key = arr[index];
			int position = index;
			while (position>0&&arr[position-1]>key) {
				arr[position] = arr[position-1];
				position --;
				//System.out.println(index+" "+Arrays.toString(arr));
			}
			arr[position]=key;
		}
		
	}
	public static int binSearch(int[] arr, int search) {
		//System.out.println(Arrays.toString(arr)+" "+search);
		int middle;
		int from =0, to = arr.length-1;
		while (from <= to) {
			middle =(from+to)/2;
			if (search == arr[middle]) 
				return middle;
			if(search > arr[middle]) 
				from = middle+1;
			else 
				to = middle-1;
		}
		return -1;
	}
}//class
