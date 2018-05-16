package recursion;

import java.util.ArrayList;

public class Searches {

	ArrayList<String> tester;
	
	public static void main(String[] args) {
		Searches test = new Searches();
		test.run();
	}
	
	private void run() {
		/*tester = creater();
		System.out.println(search(tester, "Kim"));*/
		int[] tester = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		ArrayList<Integer> runner = new ArrayList<>();
		for (int x:tester) {
			runner.add(x);
		}
		ArrayList<String> names = creater();
		System.out.println("Names: "+recLinearSearch(names, "Jos", 0, names.size()));
		System.out.println("Final: "+binSearch(runner,7,0,runner.size()));
	}
	private int search(ArrayList<String> x, String key) {
		return(recLinearSearch(x,key,0,x.size()));
	}
	
	public int recLinearSearch(ArrayList<String> list, String key, int start, int end) {
		if(start>end-1) {
			return -1;
		}else if(list.get(start).equals(key)) {
			return start;
		}else {
			return recLinearSearch(list,key,start+1,end);
		}
	}
	
	private ArrayList<String> creater(){
		ArrayList<String> sender = new ArrayList<String>();
		String[] maker = {"Josh", "Kim", "Lexi", "Thomas", "Ryan", "Natalie"};
		for (String x:maker) {
			sender.add(x);
		}
		return sender;
	}
	private static int count =0;
	private int binSearch(ArrayList<Integer> list, Integer key, int start, int end) {
		count++;
		System.out.println(count+" Times on BinSearch");
		System.out.println(list+" "+start+" "+end);
		if(start==end) {
			return -1;
		}
		int mid = (start+((end-start)/2));
		System.out.println(mid);
		if(key==list.get(mid)) {
			return mid;
		}else if(key>list.get(mid)) {
			return binSearch(list, key, mid+1, end);
		}else {
			return binSearch(list, key, start, mid);
		}
	}
}
