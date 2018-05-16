package old;

import java.util.*;

public class Guessing {

	public static void main(String[] args) {
		
		final int MAX = 10;
		Scanner sc = new Scanner(System.in);
		int answer, guess;
		
		Random generator = new Random();
		answer = generator.nextInt(MAX)+1;
		
		System.out.println("I'm thinking of a number between 1 and "+MAX+". Guess what it is: ");
		guess = sc.nextInt();
		
		if (guess==answer) {
			System.out.println("You got it Right!");
		}
		else {
			System.out.println("That's not correct, sorry.");
			System.out.println("The answer was: "+answer);
			}
		
		
	}//end main
	
}//end class
