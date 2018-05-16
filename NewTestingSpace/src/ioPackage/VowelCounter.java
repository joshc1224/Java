package ioPackage;
import java.io.*;
import java.util.*;
public class VowelCounter {

	public static void main(String[] args) throws FileNotFoundException {
		
		String[] vowels = {"a","e","i","o","u"};
		int[] vowelCounts = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("input File: ");
		String inputFileName = sc.next();
		sc.close();
		File input = new File(inputFileName);
		Scanner in = new Scanner(input);
		in.useDelimiter("");
		
		while (in.hasNext()) {
			char temp = in.next().charAt(0);
			if(Character.isUpperCase(temp)) {
				vowelCounts[0]++;
			}else if(Character.isLowerCase(temp)) {
				vowelCounts[1]++;
			}else if(Character.isDigit(temp)) {
				vowelCounts[2]++;
			}else if(Character.isWhitespace(temp)) {
				vowelCounts[3]++;
			}else {vowelCounts[4]++;}
			
			
		}
		System.out.println("Uppercase: " + vowelCounts[0]);
	      System.out.println("Lowercase: " + vowelCounts[1]);
	      System.out.println("Digits: " + vowelCounts[2]);
	      System.out.println("Whitespace: " + vowelCounts[3]);
	      System.out.println("Other: " + vowelCounts[4]);
	}
}
