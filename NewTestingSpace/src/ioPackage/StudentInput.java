package ioPackage;
import java.io.*;
import java.util.*;
public class StudentInput {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input File: ");
		File input = new File(sc.next());
		Scanner reader = new Scanner(input);
		int count=0;
		System.out.printf("%-17s %6s\n", "Name", "Average");
		System.out.println("-------------------------");
		while (reader.hasNext()) {
			String name = "";
			int total=0;
			while (!reader.hasNextInt()) {
				name += reader.next()+" ";
				//System.out.println(name);
			}
			while (reader.hasNextInt()) {
				total+=reader.nextInt();
				count++;
			}
			System.out.printf("%-18s %5.2f\n", name.trim()+":", (double)total/count);
			System.out.println("*************************");	
		}	
	}
}