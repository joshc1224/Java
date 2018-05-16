import java.util.*;
import java.io.*;
public class ArrayLIstTesting {

	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<>();
		for (int i=0;i<=10;i++) {
			test.add(i);
		}
		System.out.println("First");
		for (int i=0;i<test.size();i++) {
			
			System.out.print(test.get(i)+"|");
		}
		test.remove(5);
		System.out.println("\nsecond");
		for (int i=0;i<test.size();i++) {
			System.out.print(test.get(i)+"|");
		}
		double x = 3.0;
		String y = "3.0";
		
		Double q = Double.parseDouble(y);
		
		System.out.println("");
		System.out.println(x+q.toString());
		System.out.println(x+q);
		
		File f = new File("Hello.txt");
		try {
			Scanner in = new Scanner(f);
			PrintWriter out = new PrintWriter("Hello2.txt");
			while (in.hasNextLine()) {
				out.println(in.nextLine());
			}out.close();
			
		}catch (FileNotFoundException ex) {
			System.out.println("The file aint here sucka");
		}
		
	}
	
}
