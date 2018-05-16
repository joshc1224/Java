package dayOne;
import java.util.*;

public class Counter {

	
	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.run();
	}
	
	private void run() {
		
		int total = 0;
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] inputs = new String[input.length()];
		for(int i=0;i<input.length();i++) {
			
			inputs[i]= input.substring(i, i+1);
			
		}
		int halfLength = (inputs.length)/2;
		/*if(Integer.parseInt(inputs[halfLength])==Integer.parseInt(inputs[inputs.length-1])) {
			total+=Integer.parseInt(inputs[inputs.length-1]);
			System.out.println("added length");
		}*/
		
		for(int j =0;j<halfLength;j++) {
			
			if(Integer.parseInt(inputs[j])==Integer.parseInt(inputs[j+halfLength])) {
				total+=Integer.parseInt(inputs[j]);
				System.out.println("added "+j);
			}
			//System.out.println(j);
		}
		for(int k=halfLength;k<inputs.length;k++) {
			if(Integer.parseInt(inputs[k])==Integer.parseInt(inputs[k-halfLength])) {
				total+=Integer.parseInt(inputs[k]);
				System.out.println("added "+k);
			}
		}
		System.out.println(halfLength);
		System.out.println("Total: "+total);
	}
	
}
