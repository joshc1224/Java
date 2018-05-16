package ioPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InterLeaving {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input File: ");
		File input = new File(sc.next());
		Scanner reader = new Scanner(input);
		int count=0;
		while (reader.hasNextLine()) {
			String name=reader.nextLine();
			int total=0;
			while (reader.hasNextInt()) {
				total+=reader.nextInt();	
			}
			System.out.println(name+": "+total);
			reader.nextLine();
		}
}
}
