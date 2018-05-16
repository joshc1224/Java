package testingone;

import java.util.ArrayList;

public class CompareTotester {

	
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<Integer>();
		for (int i=0;i<10;i++) {
			test.add(i);
		}
		System.out.println(test.toString());
		System.out.println("a".compareTo("b"));
		
	}
}
