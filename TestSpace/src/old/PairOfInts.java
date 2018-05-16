package old;

import java.util.Scanner;
import java.util.logging.Logger;

public class PairOfInts {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0, num3=0, num4=0, numOfPairs=0;
		
		System.out.println("Enter four integers and I will tell you how main pairs you have.");
		System.out.println("----------------------------------------------------------------");
		System.out.print  ("Integer number one ");
		if (sc.hasNextInt()) {
			num1=sc.nextInt();
		}else {
			System.out.println("You're Fucking Dumb");
			sc.next();
		}//else
		System.out.print  ("Integer number two ");
		if (sc.hasNextInt()) {
			num2=sc.nextInt();
		}else {
			System.out.println("You're Fucking Dumb");
			sc.next();
		}//else
		System.out.print  ("Integer number three ");
		if (sc.hasNextInt()) {
			num3=sc.nextInt();
		}else {
			System.out.println("You're Fucking Dumb");
			sc.next();
		}//else
		System.out.print  ("Integer number four ");
		if (sc.hasNextInt()) {
			num4=sc.nextInt();
		}else {
			System.out.println("You're Fucking Dumb");
			sc.next();
		}//else
	
		if(num1==num2||num1==num3||num1==num4) {
			numOfPairs += 1;
		}
		if (num2==num3||num2==num4) {
			numOfPairs += 1;
		}
		if (num3==num4) {
			numOfPairs += 1;
		}
		
		if (numOfPairs>2) {
			numOfPairs -=1;
		}
		if (numOfPairs>0) {
			System.out.println("You have "+numOfPairs+" Pairs.");
		}else {
			System.out.println("You have no Pairs");
		}
	
	}//main
}//class
