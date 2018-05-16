package recursion;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	
	public void run() {
		/*MergeSort runner = new MergeSort();
		runner.run();
		
		ArrayList<Integer> test = new ArrayList<>();
		int[] testFill = randArray(100,100);
		for(int x:testFill) {
			test.add(x);
		}
		
		MergeSorter tester = new MergeSorter();
		tester.mergeSort(test);
		System.out.println(test);*/
		MergeSort test = new MergeSort();
		test.run();
	}
private int[] randArray(int size, int upperBound) {
		
		int[] send = new int[size];
		
		for(int i=0;i<size;i++) {
			send[i]=(int)(Math.random()*upperBound);
		}
		return send;
	}
}
