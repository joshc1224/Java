package myLibDrivers;
import java.util.Scanner;


public class ReadIntsDriver {
	public static int readIntBetween(int low, int high) {
		
		int input=0;
		Scanner sc = new Scanner(System.in);
		do {		
			System.out.print("Enter an integer between "+low+" and "+high+": ");
			if (sc.hasNextInt())
				input = sc.nextInt();
			else {sc.next();}			
		}while (input<low||input>high);
		return input;
	}
	
	public static void main(String[] args) {
		

		int result = readIntBetween(1,10);
		System.out.println(result);
	}
	
}
