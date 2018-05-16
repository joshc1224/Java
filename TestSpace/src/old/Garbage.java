package old;

import java.util.Scanner;

public class Garbage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input, tenCount=0;
		boolean running = true;
		while (running) {
			System.out.print("Enter an integer. Enter 0 to quit: ");
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				switch (input){
				case 10:
					tenCount++;
					break;
				case 0:
					running = false;
					break;
				}
				
			}else {
				System.out.println("You must enter a valid input");
				sc.next();
			}
		}//while
		System.out.println("Number of tens entered is: "+tenCount);
	}
}
