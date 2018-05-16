package commonChild;

import java.util.ArrayList;

public class AllSubs {

	public static void main(String[] args) {
		
		ArrayList<String> one = findChild("HARRY");
		ArrayList<String> two = findChild("SALLY");
		int largest = 0;
		
		for (String x:one) {
			if (two.contains(x)){
				if(x.length()>largest) {
					largest=x.length();
				}
			}
		}
		System.out.println(largest);
		
	}
	
	public static ArrayList<String> findChild(String find){
		
		String test = find;
		ArrayList<String> subs = new ArrayList<String>();
		subs.add(test);
		for (int i=0;i<test.length();i++) {
			if(i<test.length()-1) {
				subs.add(test.substring(i,i+2));
				subs.add(test.substring(i,i+1)+test.substring(test.length()-1));
			}
			String temp = test.substring(0,i)+test.substring(i+1);
			subs.add(test.substring(i, i+1));
			subs.add(temp);
		}
		
		/*for(String x:subs) {
			System.out.println(x);
		}*/
		return subs;
	}
}
