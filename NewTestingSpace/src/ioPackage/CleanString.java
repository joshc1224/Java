package ioPackage;
import java.util.*;
import java.io.*;
public class CleanString {

	public static void main(String[] args) {
		
		System.out.println(clean("-$1,223                "));
		
	}
	
	public static int clean(String number) {
		
		String cleaned = "";
		Scanner lineRead = new Scanner(number);
		lineRead.useDelimiter("");
		while (lineRead.hasNext()) {
			String temp = lineRead.next();
			if (Character.isDigit(temp.charAt(0))) {
				cleaned+=temp;
				//System.out.println(temp);
			}else if (temp.charAt(0)=='-')
				cleaned += temp;
					
		}
		return Integer.parseInt(cleaned);
		
	}
	
}
