package ioPackage;
import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.PrintWriter;
	import java.util.Scanner;
	   
	/**
	   This program reads a file with words and writes each sentence
	   on a separate line to the file sentences.txt.
	*/
public class IO {

	public static void main(String[] args) throws FileNotFoundException
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input file: ");
		String input = sc.next();
		sc.close();
		File inputFile = new File(input);
		PrintWriter out = new PrintWriter("sentences.txt");
		Scanner in = new Scanner(inputFile);
		while (in.hasNext()) {
			String temp = in.next();
			//out.print(temp.charAt(temp.length()-1));
			switch (temp.charAt(temp.length()-1)) {
			case '?':
				out.println(temp);
				break;
			case '.':
				out.println(temp);
				break;
			case '!':
				out.println(temp);
				break;
			case '"':
				switch (temp.charAt(temp.length()-2)) {
				case '?':
					out.println(temp);
					break;
				case '.':
					out.println(temp);
					break;
				case '!':
					out.println(temp);
					break;
				default:
					out.print(temp+" ");
					break;
				}break;
			default:
				out.print(temp+" ");
				break;
			}
		}//end while for reading
		in.close();
		out.close();
	
	}
	
	
	
}

