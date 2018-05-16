package ioPackage;
import java.util.*;
import java.io.*;
public class HelloWorld {
	
	public static void main(String[] args)  throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter("Hello.txt");
		boolean message = true;
		String toWrite="";
		String word="";
		while(message) {
			word=sc.next();
			if(word.equals("quit")) {
				message = false;
			}else {
				toWrite+=word+" ";
				System.out.println(word+" "+toWrite);
			}
		}
		out.println(toWrite);
		out.close();
		sc.close();
		File inputFile = new File("Hello.txt");
		Scanner input = new Scanner(inputFile);
		String fromInput="";
		while(input.hasNext()) {
			fromInput+=input.next()+" ";
		}
		input.close();
		System.out.println(fromInput);
	}

}
