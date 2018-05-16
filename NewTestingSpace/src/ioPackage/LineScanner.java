package ioPackage;
import java.io.*;
import java.util.*;

public class LineScanner {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(decompose("John dong, fung 12345")));
	}

	public static String[] decompose(String address) {
		
		String[] values = new String[3];
		Scanner lineScanner = new Scanner(address);
		int counter =0;
		values[0]=findCity(address);
		values[1]=findState(address);
		values[2]=findZip(address);
		return values;
	}
	
	public static String findCity(String address) {
		
		Scanner lineScanner = new Scanner(address);
		lineScanner.useDelimiter("");
		String city="";
		int count = 0;
		while (lineScanner.hasNext()) {
			count++;
			if(lineScanner.next().equals(",")) {
				return address.substring(0,count-1);
			}
		}
		return city;
	}
	public static String findState(String address) {
		
		Scanner lineScanner = new Scanner(address);
		lineScanner.useDelimiter("");
		int commaIndex=0, numberIndex=0;
		int count=0;
		while(lineScanner.hasNext()) {
			count++;
			if(lineScanner.next().equals(",")) {
				commaIndex=count;
			}
			if(lineScanner.hasNextInt()) {
				numberIndex=count;
				return address.substring(commaIndex+1, numberIndex-1);
			}
		}
		return "Lost";
	}
	public static String findZip(String address) {
		
		Scanner lineScanner = new Scanner(address);
		lineScanner.useDelimiter("");
		int commaIndex=0, numberIndex=0;
		int count=0;
		while(lineScanner.hasNext()) {
			count++;
			if(lineScanner.next().equals(",")) {
				commaIndex=count;
			}
			if(lineScanner.hasNextInt()) {
				numberIndex=count;
				return address.substring(numberIndex);
			}
		}
		return "Lost";
		
	}
}
